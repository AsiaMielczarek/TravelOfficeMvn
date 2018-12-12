package pl.travel.office.interfaces;

import pl.travel.office.classes.Customer;
import pl.travel.office.classes.Trip;

public interface UserInterface {

    Customer addCustomer();

    Trip addTrip();

    void assignTripToCustomer();

    boolean removeCustomer();

    boolean removeTrip();

    void showCustomers();

    void showTrips();

}


