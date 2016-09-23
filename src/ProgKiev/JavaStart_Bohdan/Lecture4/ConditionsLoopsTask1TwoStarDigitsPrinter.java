package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 30.06.2016.
 *
 * Лекция 4. Задача 1. Conditions + Loops - Две звезды:
 * Вывод в консоль цифр целого числа
 * Если число отрицательное, вывести знак "-". Использование
 * преобразования числа в строку запрещено.
 */

public class ConditionsLoopsTask1TwoStarDigitsPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваше число: ");
        int number = scanner.nextInt();
        int y = (number < 0) ? -number : number;
        int r = (int) Math.log10(y) + 1;

        System.out.println(r);

        if (number < 0) {
            System.out.println("Ваше число: " + (Math.abs(number)));
            System.out.println("Ваше число: " + (Math.incrementExact(number)));
            System.out.println("Ваше число: " + (StrictMath.pow((double) number, (double) 2)));
        } else {
            System.out.println("Ваше число: " + (Math.abs(number)));
            System.out.println("Ваше число: " + (Math.incrementExact(number)));
            System.out.println("Ваше число: " + (Math.pow(number,2)));
        }

        scanner.close();
    }
}