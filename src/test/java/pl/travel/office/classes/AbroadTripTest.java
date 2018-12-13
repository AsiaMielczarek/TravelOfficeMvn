package pl.travel.office.classes;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;
import static pl.travel.office.classes.Date.setDate;

public class AbroadTripTest {

    private Trip trip;

    @Test
    public void shouldReturnPriceOfAbroadTrip() {
        trip = new AbroadTrip(new Date(setDate("2-4-2019", "-")), new Date(setDate("10-4-2019","-")), "Bali");
        ((AbroadTrip) trip).setInsurance(new BigDecimal(100));
        trip.setPrice(new BigDecimal(300));
        assertEquals(new BigDecimal(400), trip.getPrice());
    }
}