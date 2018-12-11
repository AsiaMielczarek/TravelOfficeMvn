package pl.travel.office;

import pl.travel.office.classes.Customer;
import pl.travel.office.classes.TravelOffice;
import pl.travel.office.classes.Trip;
import pl.travel.office.interfaces.UserInterface;

public class MainHandler implements UserInterface {

    private TravelOffice travelOffice;

    public MainHandler(TravelOffice travelOffice) {
        this.travelOffice = travelOffice;
    }


    @Override
    public void start() {
    }

    @Override
    public void addCustomer(Customer customer) {
        travelOffice.addCustomer(customer);
    }

    @Override
    public void addTrip(String tripName, Trip trip) {
        travelOffice.addTrip(tripName, trip);
    }

    @Override
    public void addCustomerToTrip(Customer customer, Trip trip) {
        trip.setCustomer(customer);
    }

    @Override
    public void removeCustomer(Customer customer) {
        travelOffice.removeCustomer(customer);
    }

    @Override
    public void removeTrip(String tripName) {
        travelOffice.removeTrip(tripName);
    }

    @Override
    public void showCustomers() {
        System.out.println(travelOffice.findAllCustomers());
    }

    @Override
    public void showTrips() {
        System.out.println(travelOffice.findAllTrips());
    }

    @Override
    public void exit() {

    }
}
