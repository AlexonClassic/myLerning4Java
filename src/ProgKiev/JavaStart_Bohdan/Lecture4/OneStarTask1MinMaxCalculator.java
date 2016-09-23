package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 23.06.2016.
 *
 * Лекция 4. Задача 1 - Одна звезда
 * Нахождение минимума/максимума двух чисел
 */

public class OneStarTask1MinMaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую цифру: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите вторую цифру: ");
        int secondNumber = scanner.nextInt();

        // Вариант через "If / Else"
        if (firstNumber > secondNumber) {
            System.out.println("\nМаксимальное число: " + firstNumber + "\nМинимальное число: " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("\nМаксимальное число: " + secondNumber + "\nМинимальное число: " + firstNumber);
        } else {
            System.out.println("\nЦифры не могут быть одинаковыми! Попробуйте еще раз...");
        }

        // Вариант через "Тернальный оператор"
        System.out.println("-------------------------------");

        System.out.println("Максимальное число: " + (firstNumber > secondNumber ? firstNumber : secondNumber));
        System.out.println("Минимальное число: " + (firstNumber < secondNumber ? firstNumber : secondNumber));
    }
}