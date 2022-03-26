package com.tdea.parcial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTests {

    @Test
    public void shouldReturnNightBetweenZeroAndSix() {
        int hora = 4;
        assertEquals("Night", Utils.getTimeOfDay(hora));

    }
    @Test
    public void shouldReturnMorningBetweenTwelveAndSix() {

        int hora = 9;
        assertEquals("Morning", Utils.getTimeOfDay(hora));
    }
    @Test
    public void shouldReturnAfternoonBetweenEighteenAndTwelve() {

        int hora = 13;
        assertEquals("Afternoon", Utils.getTimeOfDay(hora));
    }

    @Test
    public void shouldReturnEveningHigherEighteen() {

        int hora = 20;
        assertEquals("Evening", Utils.getTimeOfDay(hora));
    }

    @Test
    public void shouldReturnInvalidHourHigherTwentyFourHours() {

        int hora = 50;
        assertEquals("Invalid hour", Utils.getTimeOfDay(hora));
    }



}
