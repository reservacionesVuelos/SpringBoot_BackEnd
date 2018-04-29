package com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Flight {

    private String flightImageUrl;
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

    private int id;

    private static AtomicInteger globalId = new AtomicInteger(0);

    public Flight() {
    }

    public Flight(String flightImageUrl, String origin, String destiny, Long cost, Date flightDay) {
        this.id= generateId();
        this.flightImageUrl = flightImageUrl;
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
        if(dayOfWeek==Calendar.SUNDAY || dayOfWeek == Calendar.SATURDAY) costToReplace = cost*WEEKENDS_COST;
        this.cost = costToReplace;

    }

    /**
     * this method should be thread-save
     */
    private static int generateId(){
        return globalId.addAndGet(1);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightImageUrl() {
        return flightImageUrl;
    }

    public void setFlightImageUrl(String flightImageUrl) {
        this.flightImageUrl = flightImageUrl;
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

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightImageUrl='" + flightImageUrl + '\'' +
                ", origin='" + origin + '\'' +
                ", destiny='" + destiny + '\'' +
                ", flightDay=" + flightDay +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return id == flight.id &&
                Objects.equals(flightImageUrl, flight.flightImageUrl) &&
                Objects.equals(origin, flight.origin) &&
                Objects.equals(destiny, flight.destiny) &&
                Objects.equals(flightDay, flight.flightDay) &&
                Objects.equals(cost, flight.cost);
    }

    @Override
    public int hashCode() {

        return Objects.hash(flightImageUrl, origin, destiny, flightDay, cost, id);
    }
}
