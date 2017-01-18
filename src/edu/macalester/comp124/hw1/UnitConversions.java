package edu.macalester.comp124.hw1;

/**
 * Unit Conversions for humorous units of measurement.
 *
 * Original Author: Bret Jackson
 *
 * Acknowledgements:
 *   The Sheppy unit can be found on:
 *   https://en.wikipedia.org/wiki/List_of_humorous_units_of_measurement#Sheppey
 *
 *   The original idea for this assignment was by Paul Cantrell.
 *   Bret Jackson converted to the Sheppy, and Libby Shoop added this header.
 *
 */
public class UnitConversions {

    public static double sheppeyToMiles(double sheppey) {
        return sheppey * 7.0/8;
    }

    public static double milesToSheppey(double miles) {
        return miles / (7.0/8);
    }

    // This is just one example of a unit they might choose. If you want to be sure the student didn't make the unit up
    // then you will likely have to google it. The key to grading this is consistency (*5 matches up with /5)
    public static double beardSecondsToNanoMeters(double beardSeconds) {
        return beardSeconds*5;
    }

    public static double nanoMetersToBeardSeconds(double nanoMeters) {
        return nanoMeters/5;
    }
}
