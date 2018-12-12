package pl.travel.office.classes;

import java.math.BigDecimal;

public abstract class Trip {

    private Date start;
    private Date end;
    private String destination;
    private BigDecimal price;
    private Customer customer;

    public Trip(Date start, Date end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }

    public BigDecimal getPrice() { return price; }

    public void setPrice(BigDecimal price) { this.price = price; }

    public void setCustomer(Customer customer) { this.customer = customer; }

    @Override
    public String toString(){
        return "from: " + start.toString() + " to: " + end.toString() + ", destination: " + destination + ", price: " + getPrice();
    }
}

