package com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.controller;

import com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.model.Flight;
import com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.service.UserService;
import com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.service.UserServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "user" )
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping( value = "/", method = RequestMethod.GET )
    @CrossOrigin
    public ResponseEntity<?> getUsers () {
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.ACCEPTED);
    }

    @RequestMapping( value = "/{cedule}/joinFlight", method = RequestMethod.POST )
    @CrossOrigin
    public ResponseEntity<?> joinFlight (@PathVariable Long cedule, @RequestBody Flight flight) {
        return new ResponseEntity<>(userService.joinFlight(cedule,flight), HttpStatus.ACCEPTED);
    }


    @RequestMapping( value = "/{cedule}/reservedFlights", method = RequestMethod.GET )
    @CrossOrigin
    public ResponseEntity<?> obtainReservedFlights (@PathVariable Long cedule) {
        try {
            return new ResponseEntity<>(userService.obtainReservedFlights(cedule), HttpStatus.ACCEPTED);
        } catch (UserServiceException e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.FORBIDDEN);
        }
    }



}
