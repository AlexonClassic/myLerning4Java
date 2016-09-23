package ProgKiev.JavaStart_Bohdan.Lecture3;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 23.06.2016.
 *
 * Лекция 3. Задача 2 - Одна звезда:
 * С клавиатуры вводятся данные:
 * 1.    Число X в 2-ой системе счисления.
 * 2.    Число Y в 8-ой системе счисления.
 * 3.    Число Z в 16-ой системе счисления.
 *
 * Нужно вывести сумму (X + Y + Z).
 * Все введенные данные являются корректными.
 */

public class OneStarTask2DiffRadixSummator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int summa = 0;

        System.out.print("Введите число в 2-ой системе счисления: ");
        int x = scanner.nextInt(2);

        System.out.print("Введите число в 8-ой системе счисления: ");
        int y = scanner.nextInt(8);

        System.out.print("Введите число в 16-ой системе счисления: ");
        int z = scanner.nextInt(16);

        summa = x + y + z;

        System.out.println("\nСумма введенных чисел равна: " + summa);

        scanner.close();
    }
}