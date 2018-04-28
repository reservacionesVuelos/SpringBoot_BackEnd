package com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.service;


import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model.Flight;
import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model.ModelException;
import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model.Reservation;
import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.servlet.ServletException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    private List<User> users = new ArrayList<>();

    @PostConstruct
    /*
     * Same population than FlightService to have consistent stubs
     */
    private void populateSampleData() throws ModelException {
        User carlos = new User(new Long("2105534"),new Date(new Long("867196800000")));
        Flight flight1 = new Flight("Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogota","Cartagena",new Long("750000"),
                new Date(new Long("1525683600000")));
        Flight flightAfternoon = new Flight("Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogota","Cartagena",new Long("750000"),
                new Date(new Long("1525708800000")));
        Flight flight2 = new Flight("VivaColombia","https://www.vivacolombia.co/upload/co/avion.png",
                "Cartagena","Cali",new Long("400000"),
                new Date(new Long("1525651200000")));
        Flight flight3 = new Flight("LATAM","https://i2.wp.com/www.noticiaslatamsales.com/files/cache/c3bff6bd74246ae63e70d72aa49b5bb2_f1019.png",
                "Medellin","Cali",new Long("500000"),
                new Date(new Long("1525824000000")));
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
    public List<User> getUsers() {
        return users;
    }
}
