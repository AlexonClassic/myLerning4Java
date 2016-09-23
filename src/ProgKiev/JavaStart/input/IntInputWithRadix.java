package ProgKiev.JavaStart.input;

import java.util.Scanner;

/**
 * Created on 20.04.2015
 *
 * @author Bohdan Vanchuhov
 */

public class IntInputWithRadix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int: ");
        int x = scanner.nextInt(32);

        System.out.println(x);
    }
}