package com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model;

import java.util.List;

public class Airline {

    private String name;
    private List<Flight> flightList;

    public Airline() {
    }

    public Airline(String name, List<Flight> flightList) {
        this.name = name;
        this.flightList = flightList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", flightList=" + flightList +
                '}';
    }
}
