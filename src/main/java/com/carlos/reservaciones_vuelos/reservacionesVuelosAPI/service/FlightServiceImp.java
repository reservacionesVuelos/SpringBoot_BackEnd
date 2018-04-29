package com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.service;

import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model.*;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.cglib.core.Predicate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
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
                "Bogotá", "Cartagena", new Long("1000000"),
                new Date(new Long("1525596200000")));
        Flight flightAfternoon = new Flight("http://i1370.photobucket.com/albums/ag244/aviatoraero/AirbusA321-Avianca_zps694c8e36.png",
                "Bogotá", "Cartagena", new Long("1000000"),
                new Date(new Long("1525708800000")));
        Flight flightAfternoon4 = new Flight("http://econoflete.com/wp-content/uploads/2016/09/avianca_avion.png",
                "Bogotá", "Cartagena", new Long("1000000"),
                new Date(new Long("1525740000000")));
        Flight flightAfternoon2 = new Flight("http://fsxaibureau.com/wp-content/uploads/2013/07/PR-AVJ.png",
                "Pereira", "Montería", new Long("350000"),
                new Date(new Long("1525708800000")));
        Flight flightAfternoon3 = new Flight("http://travelobservers.com/wp-content/uploads/2016/06/aircraft-3.png",
                "Bogotá", "San Andrés", new Long("750000"),
                new Date(new Long("1525719600000")));

        ArrayList<Flight> aviancaFlights = new ArrayList();
        aviancaFlights.add(flight1);
        aviancaFlights.add(flightAfternoon);
        aviancaFlights.add(flightAfternoon4);
        aviancaFlights.add(flightAfternoon2);
        aviancaFlights.add(flightAfternoon3);
        Airline avianca = new Airline("Avianca", aviancaFlights);
        //Viva colombia population
        Flight flight2 = new Flight("https://www.vivacolombia.co/upload/co/avion.png",
                "Cartagena", "Cali", new Long("400000"),
                new Date(new Long("1525651200000")));
        Flight flight6 = new Flight("https://www.vivacolombia.co/upload/co/avion.png",
                "Bogotá", "Cartagena", new Long("400000"),
                new Date(new Long("1540396800000")));
        Flight flight7 = new Flight("https://media.metrolatam.com/2017/05/03/captura-de-pantalla-20170503-a-las-13.11.29-1200x600.png",
                "Cartagena", "Cali", new Long("400000"),
                new Date(new Long("1545678000000")));
        ArrayList<Flight> vivaColombiaFlights = new ArrayList();
        vivaColombiaFlights.add(flight2);
        vivaColombiaFlights.add(flight6);
        vivaColombiaFlights.add(flight7);
        Airline vivaColombia = new Airline("VivaColombia", vivaColombiaFlights);
        //LATAM population
        Flight flight3 = new Flight("http://www.airhighways.com/images/new/latam.png",
                "Medellin", "Cali", new Long("500000"),
                new Date(new Long("1525824000000")));

        Flight flight4 = new Flight("https://i2.wp.com/www.noticiaslatamsales.com/files/cache/c3bff6bd74246ae63e70d72aa49b5bb2_f1019.png",
                "Montería", "Cali", new Long("500000"),
                new Date(new Long("1533668400000")));
        Flight flight5 = new Flight("https://i2.wp.com/www.noticiaslatamsales.com/files/cache/c3bff6bd74246ae63e70d72aa49b5bb2_f1019.png",
                "Cali", "Medellin", new Long("500000"),
                new Date(new Long("1536346800000")));
        Flight flight8 = new Flight("http://aviacionaldia.com/wp-content/uploads/2016/06/Latam.png",
                "Cali", "Medellin", new Long("500000"),
                new Date(new Long("1536346800000")));
        Flight flight9 = new Flight("http://imagenes.montevideo.com.uy/imgnoticias/201605/_W933_80/561070.jpg",
                "Cali", "Medellin", new Long("500000"),
                new Date(new Long("1536346800000")));
        ArrayList<Flight> latamFlights = new ArrayList();
        latamFlights.add(flight3);
        latamFlights.add(flight4);
        latamFlights.add(flight5);
        latamFlights.add(flight8);
        latamFlights.add(flight9);
        Airline latam = new Airline("LATAM", latamFlights);
        airlines.add(avianca);
        airlines.add(vivaColombia);
        airlines.add(latam);

    }



    @Override
    public List<Airline> getAllFlights() {
        return airlines;
    }

    @Override
    public List<Airline> getFlightsByOriginLocation(String location) {
        List<Airline> airlinesByLocation = new ArrayList<>();
        for (Airline airline :
                airlines) {

            Airline airlineBylocation = Airline.clone(airline);
            CollectionUtils.filter(airlineBylocation.getFlightList(), (Object o) -> {
                        return ((Flight) o).getOrigin().equals(location);
                    }
            );
            airlinesByLocation.add(airlineBylocation);


        }
        return airlinesByLocation;
    }
}
