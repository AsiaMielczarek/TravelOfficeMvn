package pl.travel.office.classes;

import java.math.BigDecimal;

public class AbroadTrip extends Trip {

    private BigDecimal insurance;

    public AbroadTrip(Date start, Date end, String destination) {
        super(start, end, destination);
    }

    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }

    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(insurance);
    }
}
