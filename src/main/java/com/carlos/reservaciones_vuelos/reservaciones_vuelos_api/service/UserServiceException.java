package com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.service;

public class UserServiceException extends  Exception {
    public final static String USER_NO_EXIST = "The user no exist in the database";
    public UserServiceException(String message) {
        super(message);
    }
}
