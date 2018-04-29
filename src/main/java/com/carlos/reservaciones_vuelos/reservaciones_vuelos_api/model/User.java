package com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.model;

import java.util.ArrayList;
import java.util.List;

public class User {


    private Long cedule;
    private List<Reservation> reservationList;

    public User() {
    }

    public User(Long cedule) {
        this.cedule = cedule;
        reservationList = new ArrayList<>();
    }

    public User(Long cedule, List<Reservation> reservationList) {
        this.cedule = cedule;
        this.reservationList = reservationList;
    }


    public Long getCedule() {
        return cedule;
    }

    public void setCedule(Long cedule) {
        this.cedule = cedule;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    @Override
    public String toString() {
        return "User{" +
                "cedule=" + cedule +
                ", reservationList=" + reservationList +
                '}';
    }
}
