package edu.macalester.comp124.hw1;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitConversionsTest {
    @Test
    public void testSheppeyToMiles() {
        assertEquals(28.0, UnitConversions.sheppeyToMiles(32), 0.00001);
        assertEquals(86.2749999, UnitConversions.sheppeyToMiles( 98.6), 0.00001);
        assertEquals(185.5, UnitConversions.sheppeyToMiles(212), 0.00001);
        assertEquals(100, UnitConversions.sheppeyToMiles(114.285714), 0.00001);
    }

    @Test
    public void testMilesToSheppy() {
        assertEquals(0.0, UnitConversions.milesToSheppey(0), 0.00001);
        assertEquals(42.285714, UnitConversions.milesToSheppey(37), 0.00001);
        assertEquals(114.285714, UnitConversions.milesToSheppey(100), 0.00001);
        assertEquals(212, UnitConversions.milesToSheppey(185.5), 0.00001);
    }

    // This is just one example of a unit they might choose. If you want to be sure the student didn't make the unit up
    // then you will likely have to google it.
    @Test
    public void testBeardSecondsToNanoMeters() {
        assertEquals(0.0, UnitConversions.beardSecondsToNanoMeters(0.0), 0.00001);
        assertEquals(5, UnitConversions.beardSecondsToNanoMeters(1.0), 0.00001);
        assertEquals(25, UnitConversions.beardSecondsToNanoMeters(5.0), 0.00001);
        assertEquals(50, UnitConversions.beardSecondsToNanoMeters(10.0), 0.00001);
        assertEquals(51, UnitConversions.beardSecondsToNanoMeters(10.2), 0.00001);
    }

    @Test
    public void testNanoMetersToBeardSeconds() {
        assertEquals(0.0, UnitConversions.nanoMetersToBeardSeconds(0.0), 0.00001);
        assertEquals(0.2, UnitConversions.nanoMetersToBeardSeconds(1.0), 0.00001);
        assertEquals(1.0, UnitConversions.nanoMetersToBeardSeconds(5.0), 0.00001);
        assertEquals(20.02, UnitConversions.nanoMetersToBeardSeconds(100.1), 0.00001);
    }
}
