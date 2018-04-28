package com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.controller;

import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "flight" )
public class FlightController {

    @Autowired
    private FlightService flightService;

    @RequestMapping( value = "/", method = RequestMethod.GET )
    public ResponseEntity<?> getUsers () {
        return new ResponseEntity<>(flightService.getAllFlights(), HttpStatus.ACCEPTED);
    }
}
