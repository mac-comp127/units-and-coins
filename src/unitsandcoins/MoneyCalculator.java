package unitsandcoins;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoneyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount of money: $");
        double amount = scanner.nextDouble();  // Grab first number on input line
        scanner.nextLine();  // Ignore remainder of line

        List<String> cashDenominations = convertToCash(amount);

        System.out.println("In currency, this is:");
        for (String denomination : cashDenominations) {
            System.out.println("  " + denomination);  // Each denomination on a separate line
        }

        scanner.close();
    }

    /**
     * Lists the minimal combination of US bills and coins that add up to a given dollar amount.
     * 
     * @param amount An amount in US dollars. Must be a multiple of 0.01.
     * @return A list of counts of cash denomations, e.g. "2 dimes", with one denomination
     *         per list element.
     */
    public static List<String> convertToCash(double amount) {
        double amountRemaining = amount;  // Tracks amount left after applying each denomination
        List<String> results = new ArrayList<>();  // Accumulates denominations

        int hundreds = (int) (amountRemaining / 100);  // How many hundreds in amountRemaining?
        if (hundreds == 1) {  // Singular, plural, or none?
            results.add(hundreds + " hundred");
        } else if (hundreds != 0) {
            results.add(hundreds + " hundreds");
        }
        amountRemaining %= 100;  // Compute amount left after removing hundreds

        int fifties = (int) (amountRemaining / 50);
        if (fifties == 1) {
            results.add(fifties + " fifty");
        } else if (fifties != 0) {
            results.add(fifties + " fifties");
        }
        amountRemaining %= 50;

        int twenties = (int) (amountRemaining / 20);
        if (twenties == 1) {
            results.add(twenties + " twenty");
        } else if (twenties != 0) {
            results.add(twenties + " twenties");
        }
        amountRemaining %= 20;

        int tens = (int) (amountRemaining / 10);
        if (tens == 1) {
            results.add(tens + " ten");
        } else if (tens != 0) {
            results.add(tens + " tens");
        }
        amountRemaining %= 10;

        int fives = (int) (amountRemaining / 5);
        if (fives == 1) {
            results.add(fives + " five");
        } else if (tens != 0) {
            results.add(fives + " fives");
        }
        amountRemaining %= 5;

        int ones = (int) (amountRemaining / 1);
        if (ones == 1) {
            results.add(ones + " one");
        } else if (ones != 0) {
            results.add(ones + " ones");
        }
        amountRemaining %= 1;

        int quarters = (int) (amountRemaining / 0.25);
        if (quarters == 1) {
            results.add(quarters + " quarter");
        } else if (quarters != 0) {
            results.add(quarters + " quarters");
        }
        amountRemaining %= 0.25;

        int dimes = (int) (amountRemaining / 0.10);
        if (dimes == 1) {
            results.add(dimes + " dime");
        } else if (dimes != 0) {
            results.add(dimes + " dimes");
        }
        amountRemaining %= 0.10;

        int nickels = (int) (amountRemaining / 0.05);
        if (nickels == 1) {
            results.add(nickels + " nickel");
        } else if (nickels != 0) {
            results.add(nickels + " nickels");
        }
        amountRemaining %= 0.05;

        int pennies = (int) (amountRemaining / 0.01);
        if (pennies == 1) {
            results.add(pennies + " penny");
        } else if (pennies != 0) {
            results.add(pennies + " pennies");
        }
        amountRemaining %= 0.01;

        return results;
    }
}
