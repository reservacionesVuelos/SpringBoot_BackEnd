package com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model;

import java.util.Date;
import java.util.List;

public class User {


    private Long cedule;
    private Date birthdate;
    private List<Reservation> reservationList;

    public User() {
    }

    public User(Long cedule, Date birthdate) {
        this.cedule = cedule;
        this.birthdate = birthdate;
    }

    public User(Long cedule, Date birthdate, List<Reservation> reservationList) {
        this.cedule = cedule;
        this.birthdate = birthdate;
        this.reservationList = reservationList;
    }


    public Long getCedule() {
        return cedule;
    }

    public void setCedule(Long cedule) {
        this.cedule = cedule;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
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
                ", birthdate=" + birthdate +
                ", reservationList=" + reservationList +
                '}';
    }
}
