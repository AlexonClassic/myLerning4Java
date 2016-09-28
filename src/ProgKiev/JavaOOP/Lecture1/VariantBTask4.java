package ProgKiev.JavaOOP.Lecture1;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 28.09.2016.
 *
 * Лекция 1. Задача 2: Блинов. Глава 2. Вариант B. 4
 * Ввести число от 1 до 12. Вывести на консоль название месяца,
 * соответствующего данному числу. Осуществить проверку
 * корректности ввода чисел.
 */

public class VariantBTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int montsNumber = 0;

        System.out.print("Enter month number: ");
        montsNumber = scanner.nextInt();

        if (montsNumber > 12){
            System.out.println();
            System.out.println("You enter very big number. Max monts number is 12. Please, enter number from 1 to 12...");
            System.out.println();
            System.out.print("Enter month number: ");
            montsNumber = scanner.nextInt();
        }

        switch (montsNumber){
            case 1:
                System.out.println("it's January");
                break;
            case 2:
                System.out.println("It's February");
                break;
            case 3:
                System.out.println("It's March");
                break;
            case 4:
                System.out.println("It's April");
                break;
            case 5:
                System.out.println("It's May");
                break;
            case 6:
                System.out.println("It's June");
                break;
            case 7:
                System.out.println("It's July");
                break;
            case 8:
                System.out.println("It's August");
                break;
            case 9:
                System.out.println("It's September");
                break;
            case 10:
                System.out.println("It's October");
                break;
            case 11:
                System.out.println("It's November");
                break;
            case 12:
                System.out.println("It's December");
        }
    }
}
