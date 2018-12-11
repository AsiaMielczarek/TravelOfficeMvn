package pl.travel.office;

import pl.travel.office.classes.*;
import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {

        TravelOffice travelOffice = new TravelOffice();

        // 5.2

        Customer customer1 = new Customer("Asia");
        Address address1 = new Address("Kościuszki", "90-050", "Łódź");
        customer1.setAddress(address1);
        Trip trip1 = new AbroadTrip(Date.setDate("15.7.2019", "\\."), Date.setDate("31.7.2019", "\\."), "Bali");
        trip1.setPrice(new BigDecimal(3500));
        ((AbroadTrip) trip1).setInsurance(new BigDecimal(299));
        customer1.assignTrip(trip1);

        Customer customer2 = new Customer("Bartek");
        Address address2 = new Address("Piotrkowska", "90-111", "Łódź");
        customer2.setAddress(address2);
        Trip trip2 = new AbroadTrip(Date.setDate("1-5-2019", "-"), Date.setDate("14-2-2019", "-"), "Paris");
        trip2.setPrice(new BigDecimal(1349));
        ((AbroadTrip) trip2).setInsurance(new BigDecimal(150));
        customer2.assignTrip(trip2);

        Customer customer3 = new Customer("Mokka");
        Address address3 = new Address("Politechniki", "93-411", "Łódź");
        customer3.setAddress(address3);
        Trip trip3 = new DomesticTrip(Date.setDate("5/2/2019", "/"), Date.setDate("14/2/2019", "/"), "Wrocław");
        trip3.setPrice(new BigDecimal(1999));
        ((DomesticTrip) trip3).setOwnArrivalDiscount(new BigDecimal(199));
        customer3.assignTrip(trip3);

        // 8.1

        travelOffice.addCustomer(customer1);
        travelOffice.addTrip("Bali", trip1);
        travelOffice.addCustomer(customer2);
        travelOffice.addTrip("Paris", trip2);
        travelOffice.addCustomer(customer3);
        travelOffice.addTrip("Wrocław", trip3);

        System.out.println("Customer by name: \n" + travelOffice.findCustomerByName("Bartek"));

        System.out.println("Number of customers: \n" + travelOffice.getCustomerCount());

        System.out.println("All customers: \n" + travelOffice.findAllCustomers());
        System.out.println("All trips: \n" + travelOffice.findAllTrips());

        travelOffice.removeCustomer(customer2);
        travelOffice.removeTrip("Wrocław");

        System.out.println("All customers after remove one: \n" + travelOffice.findAllCustomers());
        System.out.println("All trips after remove one: \n" + travelOffice.findAllTrips());

        // 8.2

//        MainHandler mh = new MainHandler(travelOffice);
//        mh.addCustomer(new Customer("Asia"));
//        mh.showCustomers();
//        mh.addTrip("Bali", new AbroadTrip(Date.setDate("1-5-2019", "-"), Date.setDate("14-2-2019", "-"), "Paris"));
//        mh.showTrips();

    }
}

