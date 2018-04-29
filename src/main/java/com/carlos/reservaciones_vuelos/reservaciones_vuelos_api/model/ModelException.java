package com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.model;

public class ModelException extends Exception {

    public static final String RESERVATION_COST="The cost of the afternoonCost is lower than the morningCost and the morning cost lower than weekendsCost";
    public ModelException(String message) {
        super(message);
    }
}
