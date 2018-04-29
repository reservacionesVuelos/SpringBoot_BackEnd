package com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.service;

import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model.Airline;

import java.util.List;

public interface FlightService {

    /**
     * return all the airlines
     * @return, a list of the airlines
     */
    List<Airline> getAllFlights();

    /**
     * return a list of airlines filtered by the given location
     * @param location, origin location to filter
     * @return, the list of airlines with flight where the origin location is the location given
     */
    List<Airline> getFlightsByOriginLocation(String location);
}
