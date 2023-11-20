package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MegabytesConverter {
    /*
    Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.

    The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        askForKilobytes();
        try {
            printMegaBytesAndKiloBytes(scanner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Input is not valid.");
        }
    }

    private static void askForKilobytes() {
        System.out.println("Type the kilobytes quantity you want to convert: ");
    }

    private static void printMegaBytesAndKiloBytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.printf("%d KB = %d MB and %d KB", kilobytes, kilobytes / 1024, kilobytes % 1024);
        }
    }

}
