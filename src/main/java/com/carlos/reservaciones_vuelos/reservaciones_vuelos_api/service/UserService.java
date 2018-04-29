package com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.service;

import com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.model.Flight;
import com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.model.User;

import javax.servlet.ServletException;
import java.util.List;

public interface UserService {

    /**
     * give the user
     * @param cedule, the cedule of the user
     * @return the user if is in the DataBase, null if not
     */
    User getUser(Long cedule);

    /**
     * returns all the users in the database
     * @return, the users
     */
    List<User> getUsers();

    /**
     * Create a new user
     * @param user, the new user
     * @throws ServletException, if the user already exist (his cedule is already registered)
     */
    void createUser(User user) throws ServletException;

    /**
     * join a person into the flight
     * @param cedule, the cedule of the person
     * @param flight, the flight
     * @return, true if the person joined succesfully, false otherwise
     */
    boolean joinFlight(Long cedule, Flight flight);

    /**
     * Give the reserved flight list of a given person
     * @param cedule, the cedule of the person
     * @return the list of flight of that person
     * @throws UserServiceException if the user doesnt exist
     */
    List<Flight> obtainReservedFlights(Long cedule) throws UserServiceException;
}
