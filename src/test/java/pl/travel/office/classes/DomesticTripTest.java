package pl.travel.office.classes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
import static pl.travel.office.classes.Date.setDate;

@RunWith(MockitoJUnitRunner.class)
public class DomesticTripTest {

    private Trip trip;

    @Test
    public void shouldReturnPriceOfDomesticTrip() {
        trip = new DomesticTrip(new Date(setDate("2-4-2019", "-")), new Date(setDate("10-4-2019","-")), "Łódź");
        ((DomesticTrip) trip).setOwnArrivalDiscount(new BigDecimal(10));
        trip.setPrice(new BigDecimal(300));
        assertEquals(new BigDecimal(290), trip.getPrice());
    }
}