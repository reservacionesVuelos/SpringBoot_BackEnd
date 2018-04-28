package com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model;

import java.util.Calendar;
import java.util.Date;

public class Flight {

    private String enterpriseName;
    private String enterpriseImageUrl;
    private String origin;
    private String destiny;
    //midle cost
    private final static Long MORNING_COST=new Long("2");
    //lower cost
    private final static Long AFTERNOON_COST=new Long("1");
    //maximum cost
    private final static Long WEEKENDS_COST=new Long("3");

    private Date flightDay;

    private Long cost;


    public Flight() {
    }

    public Flight(String enterpriseName, String enterpriseImageUrl, String origin, String destiny, Long cost, Date flightDay) {
        this.enterpriseName = enterpriseName;
        this.enterpriseImageUrl = enterpriseImageUrl;
        this.origin = origin;
        this.destiny = destiny;
        this.flightDay = flightDay;

        Calendar cal = Calendar.getInstance();
        cal.setTime(flightDay);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        Long costToReplace = cost;
        //check if the flight is in the morning
        if(hour < 12) costToReplace = cost*MORNING_COST;
        //check if the cost is in the weekends
        if(dayOfWeek>5) costToReplace = cost*WEEKENDS_COST;
        this.cost = costToReplace;

    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseImageUrl() {
        return enterpriseImageUrl;
    }

    public void setEnterpriseImageUrl(String enterpriseImageUrl) {
        this.enterpriseImageUrl = enterpriseImageUrl;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }


    public Date getFlightDay() {
        return flightDay;
    }

    public void setFlightDay(Date flightDay) {
        this.flightDay = flightDay;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "enterpriseName='" + enterpriseName + '\'' +
                ", enterpriseImageUrl='" + enterpriseImageUrl + '\'' +
                ", origin='" + origin + '\'' +
                ", destiny='" + destiny + '\'' +
                ", flightDay=" + flightDay +
                ", cost=" + cost +
                '}';
    }
}
