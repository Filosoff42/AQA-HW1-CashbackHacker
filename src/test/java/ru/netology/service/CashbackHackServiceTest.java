package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateIfBelow1000() {

        int actual = service.remain(648);
        assertEquals(352, actual);
    }

    @Test
    public void shouldCalculateIf1000() {

        int actual = service.remain(1000);
        assertEquals(0, actual);
    }

    @Test
    public void shouldCalculateIfOver1000() {

        int actual = service.remain(1825);
        assertEquals(175, actual);
    }
}