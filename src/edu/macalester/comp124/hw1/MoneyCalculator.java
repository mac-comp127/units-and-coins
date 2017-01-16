package edu.macalester.comp124.hw1;

import java.util.Scanner;

/**
 *  A solution for PP2.9 from 4th edition of Java Foundations, 4th ed.
 *
 * Created by shoop on 1/13/17.
 */
public class MoneyCalculator {

    public static void main(String[] args) {
        String reply = "";
        float moneyInput;

        boolean done = false;             // sentinel

        while (!done) {                    // read until sentinel pattern
            // get input amount
            Scanner inputValue = new Scanner(System.in);
            System.out.print("Please enter a monetary value with no more than 2 places after the decimal: ");
            moneyInput = inputValue.nextFloat();

            //debug
            System.out.println("You entered: " + moneyInput);

            //determine bill and coin breakdown
            int dollars = (int)moneyInput;

            float fCents = (moneyInput - (float)dollars) * 100;  // casting to an int could round the wrong way

            int cents =  Math.round(fCents);  // this is the part that will cause confusion

            System.out.println("debug: cents = " + cents);


            /////////////////////////////////////
            // the bills: tens, fives, and ones
            /////////////////////////////////////
            int tens = dollars/10;
            int tensRemainder = dollars % 10;

            int fives = tensRemainder / 5;
            int ones = tensRemainder % 5;

            if (tens == 1) {
                System.out.println(tens + " ten dollar bill");
            } else {
                System.out.println(tens + " ten dollar bills");
            }

            if (fives == 1) {
                System.out.println(fives + " five dollar bill");
            } else {
                System.out.println(fives + " five dollar bills");
            }

            if (ones == 1) {
                System.out.println(ones + " one dollar bill");
            } else {
                System.out.println(ones + " one dollar bills");
            }

            /////////////////////////////////////////////////
            // the change: quarters, dimes, nickels, pennies
            ////////////////////////////////////////////////
            int quarters = cents / 25;
            int remain = cents % 25;

            if (quarters == 1) {
                System.out.println("1 quarter");
            } else {
                System.out.println(quarters + " quarters");
            }

            int dimes = remain /10;
            if (dimes == 1 ) {
                System.out.println("1 dime");
            } else {
                System.out.println(dimes + " dimes");
            }

            remain = remain % 10;
            int nickels = remain / 5;
            if (nickels == 1) {
                System.out.println("1 nickel");
            } else {
                System.out.println(nickels + " nickels");
            }

            int pennies = remain % 5;
            if (pennies == 1 ) {
                System.out.println("1 penny");
            } else {
                System.out.println(pennies + " pennies");
            }


            System.out.println();

            // ask for another Y/N
            // if answered N or n, set sentinel
            Scanner yesNo = new Scanner(System.in);
            System.out.println("Do you wish to enter another monetary value? [Y/N] ");
            reply = yesNo.nextLine();
            if (reply.equalsIgnoreCase("N")) {        ///!!!!! This is in Ch. 3, p. 81
                done = true;
            }
        }

        System.out.println("Money Calculator completed.");

    }
}
