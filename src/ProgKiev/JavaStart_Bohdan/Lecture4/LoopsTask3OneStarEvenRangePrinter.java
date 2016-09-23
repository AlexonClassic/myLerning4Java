package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 28.06.2016.
 *
 * Лекция 4. Задача 3. Loops - Одна звезда:
 * Вывод на экран чётных чисел от first до last.
 * Если first > last, ничего не выводить
 */

public class LoopsTask3OneStarEvenRangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное значение: ");
        int first = scanner.nextInt();

        System.out.print("Введите конечное значение: ");
        int last = scanner.nextInt();

        if (first < last && first == 0) {
            for (int i = first + 2; i < last; i = i + 2) {
                System.out.print(i + " ");
            }
        } else if (first < last && first % 3 == 0 || first == 1) {
            for (int i = first + 1; i < last; i = i + 2) {
                System.out.print(i + " ");
            }
        } else if(first < last){
            for (int i = first; i < last; i = i + 2){
                System.out.print(i + " ");
            }
        } else {
            System.out.print("");
        }
    }
}