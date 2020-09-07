# Comp 127: Units and Coins

## Setup

1. Make sure you have completed the [Installfest instructions](https://docs.google.com/document/d/1RJuwG1kIlrMOu8zurt7vIXsyJJwpuaTZSJqE8J6R_sc/edit#).
1. Follow the steps in the [“Start the assignment” section](https://docs.google.com/document/d/1zbYG1SOJvar52_XmtKRq0yOuDNIHS5jjaDn8Rz3_m7Y/edit#) of the Homework / Lab Procedures document.

## Problem 1: Unit Conversions

This problem is a warm-up to give you more practice using and writing unit tests.

We have created a `UnitConversions` class that converts between Sheppey and miles. A Sheppey is a measure of distance equal to (7/8) of a mile. It is defined as the closest distance at which sheep remain picturesque! More information on the definition can be found at Wikipedia's [List of Humorous Units of Measure](https://en.wikipedia.org/wiki/List_of_humorous_units_of_measurement#Sheppey). Unfortunately, the UnitConversion class is broken: it always returns zero!

1. Implement the conversion methods correctly, so that the tests in `UnitConversionsTest` all pass.
   (**The tests are already correct.** You only need to change the code in `UnitConversions`.) 
   Note that the code you are given for each method returns 0.0. This is designed for you to replace 
   this with the propoer converted value.
2. Using the sheppey methods as an example, add your own **pair** of methods to convert back
   and forth between two units of your choice.
3. Add tests for your new methods to `UnitConversionsTest`.

### Acknowledgements:

Paul Cantrell developed the unit conversions assignment using Fahrenheit and Celsius. Bret Jackson updated it to use Sheppy. :stuck_out_tongue_winking_eye:


## Problem 2: Minimize Bills and Coins

You will be writing a new class called **MoneyCalculator**. Follow the coding guidelines document provided on moodle when documenting this class and choosing variable names. Remember that you should create a main method as the starting point for your program.

The purpose of your program is to take a float value from the user that represents a monetary amount, such as 17.89, and print back out the least number of each type of US bill and coin needed to represent that amount, starting with the highest. As a simplification, assume that the ten dollar bill is the maximum size bill that you have to work with.

For example, if the user enters 47.63, your program should print:

    4 ten dollar bills
    1 five dollar bill
    2 one dallar bills
    2 quarters
    1 dime
    0 nickels
    3 pennies

You must use a read-until-sentinel loop pattern to keep asking the user if they wish to enter a new value (Y/N). Your program will always complete one calculation as above before asking whether they want to try again.

Note that there are no coins for fractions of a cent. You can give somebody $3.50, but not $3.501. 

**Note:** Floating point numbers are approximations, and subject to surprising rounding errors. Because of this, you should **never use floating point types to perform monetary calculations that need to be precise** — not in this assignment, not ever! Instead, for this assignment, represent money using an int that records the number of cents. For example, a dollar would be represented as 100, and $3.50 would be represented as 350. 

**Testing your program**: Because this program takes its input straight from the user typing and prints its output straight back to the screen, it does not lend itself to unit testing. Instead, you will need to use manual interactive testing. Test out your program by trying various amounts to insure that it is correct. Be sure that you try enough cases to ensure that all parts of your code solution execute. This means that you choose examples so that all parts of conditional if statements get tried and the possible range of amounts for each bill and coin get used.

(Something to think about: How could it be possible to make it so that it is possible to write automated unit tests for this code? You don’t need to for this assignment, but it is a useful question to ponder.)

### High-level pseudocode for this problem
For this homework we will provide some pseudocode, so that you can see how writing out pseudocode can help you write code:

- While not done:
    - Ask user to input monetary value (assume no more than two decimal places)
    - Convert double input to int cents
        - Be sure to round properly! For example, `1.05` represented as a float comes out to `1.04999995`
    - Determine bill breakdown of dollars, and print a line for each bill (ten, five, one)
    - Determine coin breakdown of cents, and print a line for each coin (quarter, dime, nickel, penny)
    - Get user input whether they wish to continue with another value
    - If user says no, set done

For future homework, you may find it useful to practice writing your own pseudocode in a style similar to this. Preudocode can help you think about what your program should do, and can help prevent you from getting lost in the details of your own code.

### Acknowledgements:

This is based on problem PP2.9 on page 71 in the Java Foundations book, with some additions for Macalester COMP 127.

## Submitting your assignment

Follow the steps in the [“Save your progress with a commit” and “Submit the assignment by pushing”](https://docs.google.com/document/d/1zbYG1SOJvar52_XmtKRq0yOuDNIHS5jjaDn8Rz3_m7Y/edit#bookmark=id.ok7hybpqu919) sections of the homework procedure document.
