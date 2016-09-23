package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 29.06.2016.
 *
 * Лекция 4. Задача 4. Loops - Одна звезда:
 * Определение факториала заданного числа n (1...20). Если число не
 * соответствует диапазону, бросить исключение IlegalArgumentException
 */

public class LoopsTask4OneStarFactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите чило факториал которго нужно узнать: ");
        long n = scanner.nextLong();
        long temp = 1;

        if (n < 1 || n > 20) {
            throw new IllegalArgumentException("\n\nЧисло не соответствует диапазону. Введите от 1 до 20\n");
        } else {
            for (int i = 1; i <= n; i++) {
                temp *= i;
            }
            System.out.print(temp + " ");
        }
    }
}