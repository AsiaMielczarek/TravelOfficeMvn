package pl.travel.office.classes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TravelOfficeTest {

    private TravelOffice travelOffice;

    @Before
    public void createTravelOffice(){
        travelOffice = new TravelOffice();
    }

    @Mock
    private Customer customer;

    @Mock
    private Trip mockTrip;

    // -------------------------------------------------------------------------------- //

    @Test
    public void shouldAddCustomer() {
        int customerCounter = travelOffice.getCustomerCount();
        travelOffice.addCustomer(customer);
        assertEquals(customerCounter + 1, travelOffice.getCustomerCount());
    }

    @Test
    public void shouldFindCustomerByName() {
        when(customer.getName()).thenReturn("Mock");
        travelOffice.addCustomer(customer);
        assertEquals(travelOffice.findCustomerByName("Mock"), travelOffice.findCustomerByName(customer.getName()));
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
        assertEquals(null, travelOffice.findTripById("1"));
        travelOffice.addTrip("1", mockTrip);
        assertEquals(mockTrip, travelOffice.findTripById("1"));
    }

    @Test
    public void shouldRemoveTrip() {
        travelOffice.addTrip("1", mockTrip);
        assertTrue(travelOffice.removeTrip("1"));
    }

    @Test
    public void shouldReturnAllTrips() {
        travelOffice.addTrip("1", mockTrip);
        assertEquals(mockTrip.toString() + "\n", travelOffice.findAllTrips());
    }
}