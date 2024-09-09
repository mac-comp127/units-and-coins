package unitsandcoins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UnitConversionsTest {
    @Test
    public void testSheppeysToMiles() {
        // The last argument, the 0.00001, specifies a margin of error. This is useful
        // with floating point numbers, where rounding errors can produce results that
        // are off by just a tiny amount.
        assertEquals(0.0, UnitConversions.sheppeysToMiles(0), 0.00001);
        assertEquals(70.0, UnitConversions.sheppeysToMiles(80), 0.00001);
        assertEquals(-86.275, UnitConversions.sheppeysToMiles(-98.6), 0.00001);
    }
}
