package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiveNegativeZero {
    /*
    Positive, Negative or Zero
    Write a method called checkNumber with an int parameter named number.



    The method should not return any value, and it needs to print out:

        - "positive" if the parameter number is > 0

        - "negative" if the parameter number is < 0

        - "zero" if the parameter number is equal to 0
     */

    public static void main(String[] args) {
        int number;

        try {
            number = askForNumber();
            checkNumber(number);
        } catch (InputMismatchException e) {
            System.out.println("The input was not an integer number.");
        }
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static int askForNumber() {
        Scanner scanner = new Scanner(System.in);;

        System.out.println("Type an integer number: ");

        return scanner.nextInt();
    }
}
