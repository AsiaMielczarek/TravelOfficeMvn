package pl.travel.office;

import pl.travel.office.classes.*;
import pl.travel.office.interfaces.UserInterface;

import java.math.BigDecimal;
import java.util.Scanner;

import static pl.travel.office.classes.Date.setDate;

public class MainHandler implements UserInterface {

    private TravelOffice travelOffice;
    private Scanner sc = null;

    public MainHandler(TravelOffice travelOffice) {
        this.travelOffice = travelOffice;
        sc = new Scanner(System.in);
        sc.useDelimiter("\r\n");
    }

    @Override
    public Customer addCustomer() {
        System.out.println("Customers name: ");
        String cName = sc.nextLine();
        System.out.println("Customers surname: ");
        String cSurname = sc.nextLine();
        Customer customer = new Customer(cName + " " + cSurname);

        System.out.println("Customers street: ");
        String aStreet = sc.nextLine();
        System.out.println("Customers zip: ");
        String aZip = sc.nextLine();
        System.out.println("Customers city: ");
        String aCity = sc.nextLine();

        Address a = new Address(aStreet, aZip, aCity);
        customer.setAddress(a);

        travelOffice.addCustomer(customer);
        System.out.println("New customer has been created.");

        return customer;
    }

    @Override
    public Trip addTrip() {

        Trip trip = null;

        System.out.println("Enter id: ");
        String id = sc.nextLine();

        System.out.println("Enter the date of start trip (dd-mm-yyyy): ");
        String start = sc.nextLine();
        Date startDate = new Date(setDate(start, "-"));

        System.out.println("Enter the date of end trip (dd-mm-yyyy): ");
        String end = sc.nextLine();
        Date endDate = new Date(setDate(end, "-"));

        System.out.println("Enter the destination of trip: ");
        String destination = sc.nextLine();

        System.out.println("Enter the price of trip: ");
        BigDecimal price = sc.nextBigDecimal();
        trip.setPrice(price);

        System.out.println("Choose the type of trip. /AT/ for Abroad Trip and /DT/ for domestic trip.");
        String type = sc.nextLine();

        if(type.equals("AT")){
            trip = new AbroadTrip(startDate, endDate, destination);
            System.out.println("Enter the insurance price: ");
            BigDecimal insurance = sc.nextBigDecimal();
            ((AbroadTrip) trip).setInsurance(insurance);

        } else if(type.equals("DT")){
            trip = new DomesticTrip(startDate, endDate, destination);
            System.out.println("Enter the discount value: ");
            BigDecimal discount = sc.nextBigDecimal();
            ((DomesticTrip) trip).setOwnArrivalDiscount(discount);

        } else {
            System.out.println("Please, choose one of them.");
        }

        travelOffice.addTrip(id, trip);
        System.out.println("New trip has been created.");
        return trip;
    }

    @Override
    public void assignTripToCustomer() {
        System.out.println("Enter customer name to assign him to trip: ");
        String customerName = sc.nextLine();

        System.out.println("Enter trip id: ");
        String tripId = sc.nextLine();

        Customer customer = null;
        if(travelOffice.findCustomerByName(customerName) != null){
            customer =  travelOffice.findCustomerByName(customerName);
            customer.assignTrip(travelOffice.findTripById(tripId));
            System.out.println("Trip assigned to customer.");
        }
        System.out.println("Operation failed.");
    }

    @Override
    public boolean removeCustomer() {
        System.out.println("Enter customer name:");
        String customerName = sc.nextLine();

        if(travelOffice.findCustomerByName(customerName) != null){
            travelOffice.removeCustomer(travelOffice.findCustomerByName(customerName));
            System.out.println("Customer has been removed.");
            return true;
        }
        System.out.println("Operation failed");
        return false;
    }

    @Override
    public boolean removeTrip() {
        System.out.println("Enter trip id: ");
        String tripId = sc.nextLine();
        if(travelOffice.findTripById(tripId) != null){
            travelOffice.removeTrip(tripId);
            System.out.println("Trip has been removed.");
            return true;
        }
        System.out.println("Operation failed.");
        return false;
    }

    @Override
    public void showCustomers() {
        System.out.println(travelOffice.findAllCustomers());
    }

    @Override
    public void showTrips() {
        System.out.println(travelOffice.findAllTrips());
    }

}
