package com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.service;

import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model.Airline;

import java.util.List;

public interface FlightService {

    List<Airline> getAllFlights();
}
