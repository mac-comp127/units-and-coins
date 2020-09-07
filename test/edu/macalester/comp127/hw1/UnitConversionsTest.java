package edu.macalester.comp127.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitConversionsTest {
    @Test
    public void testSheppeyToMiles() {
        // The last argument, the 0.00001, specifies a margin of error. This is useful
        // with floating point numbers, where rounding errors can produce results that
        // are off by just a tiny amount.
        assertEquals(28.0, UnitConversions.sheppeyToMiles(32), 0.00001);
        assertEquals(86.2749999, UnitConversions.sheppeyToMiles(98.6), 0.00001);
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

}
