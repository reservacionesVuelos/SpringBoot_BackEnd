package com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.controller;

import com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "flight" )
public class FlightController {

    @Autowired
    private FlightService flightService;

    @RequestMapping( value = "/", method = RequestMethod.GET )
    @CrossOrigin
    public ResponseEntity<?> getAllFlights () {
        return new ResponseEntity<>(flightService.getAllFlights(), HttpStatus.ACCEPTED);
    }

    @RequestMapping( value = "/origin/{location}", method = RequestMethod.GET )
    @CrossOrigin
    public ResponseEntity<?> getFlightsByOriginLocation (@PathVariable String location) {
        return new ResponseEntity<>(flightService.getFlightsByOriginLocation(location), HttpStatus.ACCEPTED);
    }
}
