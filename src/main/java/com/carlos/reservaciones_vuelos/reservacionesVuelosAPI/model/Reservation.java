package com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class Reservation {

    private Flight flight;
    private User user;



    public Reservation() {
    }

    public Reservation(Flight flight, User user) {
        this.flight = flight;
        this.user = user;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @JsonIgnore
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "Reservation{" +
                "flight=" + flight +
                ", user=" + user +
                '}';
    }
}
