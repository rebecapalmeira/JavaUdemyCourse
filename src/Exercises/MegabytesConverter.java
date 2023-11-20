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

    public static void askForKilobytes() {
        System.out.println("Type the kilobytes quantity you want to convert: ");
    }

    private static int convertToMegabytes(int kilobytes) {
        return kilobytes / 1024;
    }

    private static int remainingKilobytes(int kilobytes) {
        return kilobytes % 1024;
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        /*
        printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB = 2 MB and 452 KB"
        printMegaBytesAndKiloBytes(5000); → should print the following text: "5000 KB = 4 MB and 904 KB"
         */
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.printf("%d KB = %d MB and %d KB", kilobytes, convertToMegabytes(kilobytes), remainingKilobytes(kilobytes));
        }
    }

}
