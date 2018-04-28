package com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.service;

import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model.Flight;
import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model.ModelException;
import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model.Reservation;
import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FlightServiceImp implements FlightService {

    private List<Flight> flights = new ArrayList<>();

    @PostConstruct
    /*
     * Same population than UserService to have consistent stubs
     */
    private void populateSampleData() throws ModelException {

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
        flights.add(flight1);
        flights.add(flightAfternoon);
        flights.add(flight2);
        flights.add(flight3);

    }
    @Override
    public List<Flight> getFlights() {
        return flights;
    }
}
