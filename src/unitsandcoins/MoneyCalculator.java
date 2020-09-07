package unitsandcoins;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoneyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount of money: $");
        double amount = scanner.nextDouble();
        scanner.nextLine();  // Ignore remainder of line

        List<String> cash = convertToCash(amount);

        System.out.println("In currency, this is:");
        for (String message : cash) {
            System.out.println(message);
        }

        scanner.close();
    }

    public static List<String> convertToCash(double amount) {
        double amountRemaining = amount;
        List<String> cash = new ArrayList<>();

        int hundreds = (int) (amountRemaining / 100);
        if (hundreds == 1) {
            cash.add(hundreds + " hundred");
        } else if (hundreds != 0) {
            cash.add(hundreds + " hundreds");
        }
        amountRemaining %= 100;

        int fifties = (int) (amountRemaining / 50);
        if (fifties == 1) {
            cash.add(fifties + " fifty");
        } else if (fifties != 0) {
            cash.add(fifties + " fifties");
        }
        amountRemaining %= 50;

        int twenties = (int) (amountRemaining / 20);
        if (twenties == 1) {
            cash.add(twenties + " twenty");
        } else if (twenties != 0) {
            cash.add(twenties + " twenties");
        }
        amountRemaining %= 20;

        int tens = (int) (amountRemaining / 10);
        if (tens == 1) {
            cash.add(tens + " ten");
        } else if (tens != 0) {
            cash.add(tens + " tens");
        }
        amountRemaining %= 10;

        int fives = (int) (amountRemaining / 5);
        if (fives == 1) {
            cash.add(fives + " five");
        } else if (tens != 0) {
            cash.add(fives + " fives");
        }
        amountRemaining %= 5;

        int ones = (int) (amountRemaining / 1);
        if (ones == 1) {
            cash.add(ones + " one");
        } else if (ones != 0) {
            cash.add(ones + " ones");
        }
        amountRemaining %= 1;

        int quarters = (int) (amountRemaining / 0.25);
        if (quarters == 1) {
            cash.add(quarters + " quarter");
        } else if (quarters != 0) {
            cash.add(quarters + " quarters");
        }
        amountRemaining %= 0.25;

        int dimes = (int) (amountRemaining / 0.10);
        if (dimes == 1) {
            cash.add(dimes + " dime");
        } else if (dimes != 0) {
            cash.add(dimes + " dimes");
        }
        amountRemaining %= 0.10;

        int nickels = (int) (amountRemaining / 0.05);
        if (nickels == 1) {
            cash.add(nickels + " nickel");
        } else if (nickels != 0) {
            cash.add(nickels + " nickels");
        }
        amountRemaining %= 0.05;

        int pennies = (int) (amountRemaining / 0.01);
        if (pennies == 1) {
            cash.add(pennies + " penny");
        } else if (pennies != 0) {
            cash.add(pennies + " pennies");
        }
        amountRemaining %= 0.01;

        return cash;
    }
}
