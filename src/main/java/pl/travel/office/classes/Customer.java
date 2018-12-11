package pl.travel.office.classes;

public class Customer {

    private String name;
    private Address address;
    private Trip trip;

    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name; }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void assignTrip(Trip trip){
        this.trip = trip;
    }

    @Override
    public String toString(){
        return "Name: " + name + " / Address: " + address.toString() + " / Trip " + trip.toString();
    }
}
