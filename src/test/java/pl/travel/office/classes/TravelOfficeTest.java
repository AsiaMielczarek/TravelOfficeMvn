package pl.travel.office.classes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TravelOfficeTest {


    private TravelOffice travelOffice;
    @Before
    public void createTravelOffice(){
        travelOffice = new TravelOffice();
    }

    private Customer customer;
    @Before
    public void createCustomer(){
        customer = new Customer("Anonim");
    }

    private Trip trip;
    @Before
    public void createTrip(){
        trip = new AbroadTrip("1.1.2019", "3.1.2019", "Bali");
    }

    // -------------------------------------------------------------------------------- //


    @Test
    public void shouldAddCustomer() {
        assertEquals(0, travelOffice.getCustomerCount());
        travelOffice.addCustomer(customer);
        assertEquals(1, travelOffice.getCustomerCount());
    }

    @Test
    public void shouldCountCustomers() {
        travelOffice.addCustomer(customer);
        assertEquals(1, travelOffice.getCustomerCount());
    }

    @Test
    public void shouldFindCustomerByName() {
        travelOffice.addCustomer(customer);
        assertEquals(customer, travelOffice.findCustomerByName(customer.getName()));
    }

    @Test
    public void shouldRemoveCustomer() {
        travelOffice.addCustomer(customer);
        assertTrue(travelOffice.removeCustomer(customer));
    }

    @Test
    public void shouldReturnAllCustomers() {
        travelOffice.addCustomer(customer);
        assertEquals(customer.getName() + "\n", travelOffice.findAllCustomers());
    }

    @Test
    public void shouldAddTrip() {
        assertFalse(travelOffice.findAllTrips().contains("Bali"));
        travelOffice.addTrip("Bali",trip);
        assertTrue(travelOffice.findAllTrips().contains("Bali"));
    }

    @Test
    public void shouldRemoveTrip() {
        travelOffice.addTrip("Bali", trip);
        assertTrue(travelOffice.removeTrip("Bali"));
    }

    @Test
    public void shouldReturnAllTrips() {
        travelOffice.addTrip("Bali", trip);
        assertEquals("Bali" + "\n", travelOffice.findAllTrips());
    }
}