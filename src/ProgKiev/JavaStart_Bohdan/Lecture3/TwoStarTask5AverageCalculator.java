package ProgKiev.JavaStart_Bohdan.Lecture3;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 24.06.2016.
 *
 * Лекция 3. Задача 5 - Две звезды:
 * С клавиатуры вводятся 2 числа типа int: a,  b.
 * Написать программу вычисления среднего арифметического двух чисел а,  Ь.
 * Аргументы и результат принимают любые значения из диапазона int!
 * Поэтому программа должна работать и для граничных чисел.
 */

public class TwoStarTask5AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваше первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите Ваше второе число: ");
        int b = scanner.nextInt();

        int averageSumma = (a / 2) + (b / 2) + (a % 2) + (b % 2) / 2;
        //int averageSumma = (a / 2) + (b / 2) ;

        System.out.println(averageSumma);
    }
}