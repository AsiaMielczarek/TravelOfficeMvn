package pl.travel.office.interfaces;

import pl.travel.office.classes.Customer;
import pl.travel.office.classes.Trip;

public interface UserInterface {

    void start();

    void addCustomer(Customer customer);

    void addTrip(String tripName, Trip trip);

    void addCustomerToTrip(Customer customer, Trip trip);

    void removeCustomer(Customer customer);

    void removeTrip(String tripName);

    void showCustomers();

    void showTrips();

    void exit();
}


