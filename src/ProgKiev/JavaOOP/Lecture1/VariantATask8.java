package ProgKiev.JavaOOP.Lecture1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 24.09.2016.
 *
 * Лекция 1. Задача 1: Блинов. Глава 2. Вариант 8:
 * Ввести N чисел с консоли. Среди чисел найти число-палиндром.
 * Если таких чисел больше одного, найти второе.
 *
 * Подсказка: разделение ответственностей, - каждый независимый
 * функционал выносить в метод.
 */

public class VariantATask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("How many word or digits you wont? ");
        int numberDigits = scanner.nextInt();

        String[] array = new String[numberDigits];

        arrayFilling(scanner, array);
        printArray(array);
        reverse(array);
    }

    public static void arrayFilling(Scanner scanner, String[] array) {
        System.out.println("--------------");
        System.out.print("Enter your first word or number: ");
        array[0] = scanner.next();

        for (int i = 1; i < array.length; i++) {
            System.out.print("Enter your next word or number: ");
            array[i] = scanner.next();
        }
    }

    public static void printArray(String[] array) {
        System.out.println("--------------");
        System.out.println("Your word or digits is: " + Arrays.toString(array));
        System.out.println("--------------");
    }

    public static void reverse(String[] array) {
        String tempString = "";
        String reversString = "";
        String palindromeString = "";
        boolean havePalindrome = false;

        for (int i = 0; i < array.length; i++) {
            tempString = array[i];
            reversString = "";

            for (int j = tempString.length() - 1; j >= 0; j--) {
                reversString += tempString.charAt(j);
            }

            if (tempString.equalsIgnoreCase(reversString)) {
                palindromeString = reversString;
                havePalindrome = true;
            }
        }

        palindromePrinter(tempString, palindromeString, havePalindrome);
    }

    public static void palindromePrinter(String tempString, String palindromeString, boolean havePalindrome) {
        if (havePalindrome = true) {
            System.out.println("Word or digits " + palindromeString + " in your array is palindrome");
        } else {
            System.out.println("You don't have palindromePrinter in you word or number");
        }
    }
}