package com.carlos.reservaciones_vuelos.reservaciones_vuelos_api;

import com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.model.Flight;
import com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.model.User;
import com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.service.UserService;
import com.carlos.reservaciones_vuelos.reservaciones_vuelos_api.service.UserServiceImp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.ServletException;

import java.util.Date;

import static junit.framework.TestCase.fail;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReservacionesVuelosApplicationTests {


	@Test
	public void shouldCreateTheUserCorrectly() {
	    UserService userService = new UserServiceImp();
        try {
            userService.createUser(new User((new Long("21055342"))));
        } catch (ServletException e) {
            fail();
        }
    }

	@Test
	public void shouldntCreateTwoUsersWithTheSameCedule() {
        UserService userService = new UserServiceImp();
        try {
            userService.createUser(new User((new Long("21055342"))));
            userService.createUser(new User((new Long("21055342"))));
            fail();
        } catch (ServletException e) {

        }

	}

    @Test
    public void shouldCreateTheUserCorrectly2() {
        UserService userService = new UserServiceImp();
        try {
            User user = new User((new Long("21055342")));
            userService.createUser(user);
            Assert.assertTrue(userService.getUsers().contains(user));
        } catch (ServletException e) {
            fail();
        }
    }

    @Test
    public void shouldObtainUserCorrectly() {
        UserService userService = new UserServiceImp();
        try {
            User user = new User((new Long("21055342")));
            userService.createUser(user);
            Assert.assertTrue(userService.getUser(new Long("21055342")).equals(user));
        } catch (ServletException e) {
            fail();
        }
    }

    @Test
    public void shouldJoinFlightCorrectly() {
        UserService userService = new UserServiceImp();
        try {
            User user = new User((new Long("21055342")));
            userService.createUser(user);
            Flight flight = new Flight("http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                    "Bogotá","Cartagena",new Long("750000"),
                    new Date(new Long("1525683600000")));
            userService.joinFlight(new Long("21055342"),flight);
            Assert.assertTrue(userService.getUser(new Long("21055342")).getReservationList().get(0).getFlight().equals(flight));
        } catch (ServletException e) {
            fail();
        }
    }

}
