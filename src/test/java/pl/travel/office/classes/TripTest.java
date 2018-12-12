package pl.travel.office.classes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TripTest {

    @Mock
    private AbroadTrip at;

    @Mock
    private DomesticTrip dt;

    @InjectMocks
    private Trip trip;

    @Test
    public void shouldReturnPriceWithInsurance() {

    }

    @Test
    public void shouldReturnPriceWithDiscount() {

    }
}