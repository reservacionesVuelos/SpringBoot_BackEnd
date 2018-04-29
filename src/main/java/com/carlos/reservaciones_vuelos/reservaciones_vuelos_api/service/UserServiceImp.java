package com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.service;


import com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.model.Flight;
import com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.model.ModelException;
import com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.model.Reservation;
import com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.servlet.ServletException;
import java.util.*;

@Service
public class UserServiceImp implements UserService {

    private List<User> users = new ArrayList<>();


    /*
     * Same population than FlightService to have consistent stubs
     */
    @PostConstruct
    private void populateSampleData() throws ModelException {
        User carlos = new User(new Long("2105534"));
        Flight flight1 = new Flight("http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá","Cartagena",new Long("750000"),
                new Date(new Long("1525683600000")));
        List<Reservation> reservation1 = new ArrayList<>();
        reservation1.add(new Reservation(flight1,carlos));
        carlos.setReservationList(reservation1);
        users.add( carlos);

    }

    @Override
    public User getUser( Long cedule )
    {
        Optional<User> found = users.stream().filter(h->h.getCedule().equals(cedule)).findAny();
        User ans = found.isPresent()?found.get():null;
        return ans;
    }

    @Override
    public void createUser( User user ) throws ServletException {
        if (users.stream().anyMatch(h->h.getCedule().equals(user.getCedule()))){
            throw new ServletException ("Cedule already exist");
        }
        users.add(user);
    }

    @Override
    public boolean joinFlight(Long cedule, Flight flight) {
        boolean res=true;
        //check if the user already exist
        User user = getUser(cedule);
        if(user==null){
            //create the new user
            User toAdd = new User(cedule);
            List<Reservation> reservations = new ArrayList<>();
            reservations.add(new Reservation(flight,toAdd));
            toAdd.setReservationList(reservations);
            users.add(toAdd);
        }
        else{
            //user already exist
            //check if the reservation is in the same day
            Calendar cal = Calendar.getInstance();
            for (Reservation reservation : user.getReservationList()){
                cal.setTime(reservation.getFlight().getFlightDay());
                int yearPrevious = cal.get(Calendar.YEAR);
                int monthPrevious = cal.get(Calendar.MONTH);
                int dayPrevious = cal.get(Calendar.DAY_OF_MONTH);
                cal.setTime(flight.getFlightDay());
                int yearNew = cal.get(Calendar.YEAR);
                int monthNew = cal.get(Calendar.MONTH);
                int dayNew = cal.get(Calendar.DAY_OF_MONTH);
                res = !(yearPrevious == yearNew && monthPrevious==monthNew && dayPrevious == dayNew);
            }
            //add the new reservation
            if(res) user.getReservationList().add(new Reservation(flight,user));

        }
        return res;
    }


    @Override
    public List<Flight> obtainReservedFlights(Long cedule) throws UserServiceException {
        User user = getUser(cedule);
        if(user == null) throw new UserServiceException(UserServiceException.USER_NO_EXIST);
        List<Flight> flights = new ArrayList<>();
        for (Reservation reservation:
             user.getReservationList()) {
            flights.add(reservation.getFlight());
        }
        return flights;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
