package pl.travel.office.classes;

import java.math.BigDecimal;

public abstract class Trip {

    private String start;
    private String end;
    private String destination;
    private BigDecimal price;
    private Customer customer;

    public Trip(String start, String end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }

    public BigDecimal getPrice() { return price; }

    public void setPrice(BigDecimal price) { this.price = price; }

    public void setCustomer(Customer customer) { this.customer = customer; }

    @Override
    public String toString(){
        return "from: " + start + " to: " + end + ", destination: " + destination + ", price: " + getPrice();
    }
}

