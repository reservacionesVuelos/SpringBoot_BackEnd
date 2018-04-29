package com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.service;

import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model.Flight;
import com.carlos.reservaciones_vuelos.reservacionesVuelosAPI.model.User;

import javax.servlet.ServletException;
import java.util.List;

public interface UserService {

    User getUser(Long cedule);

    List<User> getUsers();

    void createUser(User user) throws ServletException;

    boolean joinFlight(Long cedule, Flight flight);
}
