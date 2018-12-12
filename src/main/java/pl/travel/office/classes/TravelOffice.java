package pl.travel.office.classes;

import java.util.*;

public class TravelOffice {

    private Set<Customer> customers = new HashSet<>();
    private Map<String, Trip> tripMap = new HashMap<>();


    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public int getCustomerCount() {
        return customers.size();
    }

    public Customer findCustomerByName(String customerName) {
        Customer c = null;
        Iterator<Customer> iterator = customers.iterator();
        while(iterator.hasNext()){
            c = iterator.next();
            if (c.getName().equals(customerName)) {
                return c;
            }
        }
        return c;
    }

    public boolean removeCustomer(Customer customer) {
        if (customers.contains(customer)) {
            customers.remove(customer);
            return true;
        }
        return false;
    }

    public String findAllCustomers() {
        Customer c;
        StringBuilder sb = new StringBuilder();
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            c = iterator.next();
            sb.append(c.getName()).append("\n");
        }
        return sb.toString();
    }

    public void addTrip(String tripId, Trip trip) {
        tripMap.put(tripId, trip);
    }

    public boolean removeTrip(String tripId) {
        if (tripMap.containsKey(tripId)) {
            tripMap.remove(tripId);
            return true;
        }
        return false;
    }

    public Trip findTripById(String id){
        Trip trip = null;
        for(Map.Entry<String, Trip> mapEntry: tripMap.entrySet()){
            if(mapEntry.getKey().equals(id)){
                trip = mapEntry.getValue();
            }
        }
        return trip;
    }

    public String findAllTrips(){
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Trip> mapEntry: tripMap.entrySet()){
            sb.append(mapEntry.getValue().toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            Customer c = iterator.next();
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }
}

