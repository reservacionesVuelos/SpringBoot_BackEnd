package com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.controller;

import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model.User;
import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.service.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping( "user" )
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping( value = "/", method = RequestMethod.GET )
    public ResponseEntity<?> getUsers () {
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.ACCEPTED);
    }



}
