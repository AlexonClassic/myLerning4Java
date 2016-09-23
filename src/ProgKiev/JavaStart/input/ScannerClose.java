package ProgKiev.JavaStart.input;

import java.util.Scanner;

/**
 * @author Bohdan Vanchuhov
 */

public class ScannerClose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st line: ");
        scanner.nextLine();

        scanner.close();

        //----------------------------------

        scanner = new Scanner(System.in);

        System.out.print("Enter 2nd line: ");
        scanner.next();

        scanner.close();
    }
}