package ru.netology;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashBackServiceTest {

    @Test
    public void ShouldReturnDifferenceIfBoundaryIsBigger() {
        CashBackService service = new CashBackService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnZeroIfAmountEqualBoundary() {
        CashBackService service = new CashBackService();
        
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnDifferenceIfAmountIsBigger() {
        CashBackService service = new CashBackService();

        int expected = 400;
        int actual = service.remain(1600);

        assertEquals(expected, actual);
    }
}


