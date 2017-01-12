# Comp 124: Homework 1

## Setup

Follow the "Cloning a repo" section of the [IntelliJ setup doc](https://docs.google.com/a/macalester.edu/document/d/15F5NFm5hoibSV9E5IDO8icvp3ddiJ4cjQ-dXgCP6S9Y/edit?usp=sharing) to fork this repository.
Use your browser to get the URL for this repo as you read this page.


## Problem 1: Unit Conversions


I have created a `UnitConversions` class that converts between Sheppey and miles. A Sheppey is a measure of distance equal to (7/8) of a mile. It is defined as the closest distance at which sheep remain picturesque! More information on the definition can be
  found at Wikipedia's [List of Humorous Units of Measure](https://en.wikipedia.org/wiki/List_of_humorous_units_of_measurement#Sheppey). Unfortunately, the UnitConversion class is broken: it always returns zero!

1. Implement the conversion methods correctly, so that the tests in `UnitConversionsTest` all pass.
   (**The tests are already correct.** You only need to change the code in `UnitConversions`.)
2. Using the sheppey methods as an example, add your own **pair** of methods to convert back
   and forth between two units of your choice.
3. Add tests for your new methods to `UnitConversionsTest`.

### Acknowledgements:

Paul Cantrell developed the unit conversions assignment using Fahrenheit and Celsius. Bret Jackson updated it to use Sheppy. :stuck_out_tongue_winking_eye:


## Problem 2: Minimize Bills and Coins


You will be writing a new class called **MoneyCalculator**. Follow the coding guidelines document provided on moodle when documenting this class and choosing variable names. Remember that you should create a main method as the starting point for your program.

The purpose of your program is to take a double value from the user that represents a monetary amount, such as 17.89, and print back out the least number of each type of US bill and coin needed to represent that amount, starting with the highest. As a simplification, assume that the ten dollar bill is the maximum size bill that you have to work with.

For example, if the user enters 47.63, your program should print:

    4 ten dollar bills
    1 five dollar bill
    2 one dallar bills
    2 quarters
    1 dime
    0 nickels
    3 pennies

**Testing your program**: This program is an example of a program that must be tested using what we call *functional* testing, as opposed to the unit testing that you have done one previous problems. In this case, you test out your program by trying various amounts to insure that it is correct. Be sure that you try enough cases to ensure that all parts of your code solution execute. This means that you choose examples so that all parts of conditional if statements get tried and the possible range of amounts for each bill and coin get used. If you want to use the read-until-sentinal looping pattern in your main() so that you can continually try various amounts, you may certainly do that.

### Acknowledgements:

This is problem PP2.9 on page 71 in the Java Foundations book

## Submitting your assignment

Make sure you add, commit, and push all your code for both problems to your private repo. Come back here to github and check your fork's code to see that it has been updated.

