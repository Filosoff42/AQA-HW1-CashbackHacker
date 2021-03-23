package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateIfBelow1000() {

        int actual = service.remain(648);
        assertEquals(actual, 352);

    }

    @Test
    public void shouldCalculateIf1000() {

        int actual = service.remain(1000);
        assertEquals(actual, 1000);

    }

    @Test
    public void shouldCalculateIfOver1000() {

        int actual = service.remain(1825);
        assertEquals(actual, 175);

    }

}