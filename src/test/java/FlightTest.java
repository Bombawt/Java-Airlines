import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "BA765", "New York",
                "London Heathrow", "18.00");
    }

    @Test
    public void checkFlightPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void checkFlightNumber(){
        assertEquals("BA765", flight.getFlightNumber());
    }

    @Test
    public void checkFlightDestination(){
        assertEquals("New York", flight.getDestination());
    }

    @Test
    public void checkFlightDepartureAirport(){
        assertEquals("London Heathrow", flight.getDepartureAirport());
    }

    @Test
    public void checkFlightDepartureTime(){
        assertEquals("18.00", flight.getDepartureTime());
    }

    @Test
    public void checkFlightCapacity(){
        assertEquals();
    }
}
