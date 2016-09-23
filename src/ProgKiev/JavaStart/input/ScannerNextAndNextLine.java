package ProgKiev.JavaStart.input;

import java.util.Scanner;

/**
 * Created on 20.04.2015
 *
 * @author Bohdan Vanchuhov
 */

public class ScannerNextAndNextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 2 strings: ");
        String s1 = scanner.next();
        String s2 = scanner.next();
        String lastLine = scanner.nextLine();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(lastLine);
    }
}