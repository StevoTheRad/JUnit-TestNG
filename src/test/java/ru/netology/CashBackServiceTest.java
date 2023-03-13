package ru.netology;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashBackServiceTest {

    @Test
    public void ShouldReturnDifferenceIfBoundaryIsBigger() {
        CashBackService service = new CashBackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturnZeroIfAmountEqualBoundary() {
        CashBackService service = new CashBackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturnDifferenceIfAmountIsBigger() {
        CashBackService service = new CashBackService();

        int actual = service.remain(1600);
        int expected = 400;

        assertEquals(actual, expected);
    }
}


