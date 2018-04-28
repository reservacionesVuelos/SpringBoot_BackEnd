package com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.service;

import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FlightServiceImp implements FlightService {

    private List<Airline> airlines = new ArrayList<>();

    @PostConstruct
    /*
     * Same population than UserService to have consistent stubs
     */
    private void populateSampleData() throws ModelException {
        //Avianca population
        Flight flight1 = new Flight("http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogota","Cartagena",new Long("750000"),
                new Date(new Long("1525683600000")));
        Flight flightAfternoon = new Flight("http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogota","Cartagena",new Long("750000"),
                new Date(new Long("1525708800000")));
        ArrayList<Flight> aviancaFlights = new ArrayList();
        aviancaFlights.add(flight1);
        aviancaFlights.add(flightAfternoon);
        Airline avianca = new Airline("Avianca",aviancaFlights);
        //Viva colombia population
        Flight flight2 = new Flight("https://www.vivacolombia.co/upload/co/avion.png",
                "Cartagena","Cali",new Long("400000"),
                new Date(new Long("1525651200000")));
        ArrayList<Flight> vivaColombiaFlights = new ArrayList();
        vivaColombiaFlights.add(flight2);
        Airline vivaColombia = new Airline("VivaColombia",vivaColombiaFlights);
        //LATAM population
        Flight flight3 = new Flight("https://i2.wp.com/www.noticiaslatamsales.com/files/cache/c3bff6bd74246ae63e70d72aa49b5bb2_f1019.png",
                "Medellin","Cali",new Long("500000"),
                new Date(new Long("1525824000000")));

        ArrayList<Flight> latamFlights = new ArrayList();
        latamFlights.add(flight3);
        Airline latam = new Airline("LATAM",latamFlights);
        airlines.add(avianca);
        airlines.add(vivaColombia);
        airlines.add(latam);

    }

    @Override
    public List<Airline> getAllFlights() {
        return airlines;
    }
}
