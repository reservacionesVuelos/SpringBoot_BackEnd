package com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.model;

import java.util.ArrayList;
import java.util.List;

public class Airline{

    private String name;
    private List<Flight> flightList;

    public Airline() {
    }

    public Airline(String name, List<Flight> flightList) {
        this.name = name;
        this.flightList = flightList;
    }


    public static Airline clone(Airline toClone){
        return new Airline(toClone.getName(),new ArrayList<>(toClone.flightList));
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
