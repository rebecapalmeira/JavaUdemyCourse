package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BarkingDog {
    /*
    We have a dog that likes to bark.  We need to wake up if the dog is barking at night!

    Write a method shouldWakeUp that has 2 parameters.

    1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
    2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.

    We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.

    In all other cases return false.

    If the hourOfDay parameter is less than 0 or greater than 23 return false.

    Examples of input/output:

    shouldWakeUp (true, 1); → should return true

    shouldWakeUp (false, 2); → should return false since the dog is not barking.

    shouldWakeUp (true, 8); → should return false, since it's not before 8.

    shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            isDogBarking();
            boolean dogBarking = scanner.nextBoolean();

            whatTimeIsIt();
            int hourOfDay = scanner.nextInt();

            printShouldWakeUp(dogBarking, hourOfDay);
        } catch (InputMismatchException e) {
            System.out.println("Not a valid input.");
        }
    }

    private static void isDogBarking() {
        System.out.println("Is the dog barking right now? ");
    }

    private static void whatTimeIsIt() {
        System.out.println("What time is it now? ");
    }

    private static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }

    private static void printShouldWakeUp(boolean barkingDog, int hourOfDay) {
        boolean shouldWakeUp = shouldWakeUp(barkingDog, hourOfDay);

        if (shouldWakeUp) {
            System.out.println("Yes, you should wake up");
        } else {
            System.out.println("No need to do anything");
        }
    }
}
