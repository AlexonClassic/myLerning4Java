package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 28.06.2016.
 *
 * Лекция 4. Задача 2. Loops - Одна звезда:
 * Вывод на экран целых чисел от first до last с шагом step.
 * Если вывод может привести к зацикливанию, бросить исключение
 * illegalArgumentException
 */

public class LoopsTask2OneStarRangeWithStepPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное значение: ");
        int first = scanner.nextInt();

        System.out.print("\nВведите конечное значение: ");
        int last = scanner.nextInt();

        System.out.println("\nВведите шаг цикла: ");
        int step = scanner.nextInt();

        if (step <= 0) {
            throw new IllegalArgumentException("\n\nНе верные входные данные!\nШаг не должн быть меньше или равен нулю\n");
        } else if (last > first) {
            for (int i = first; i <= last; i = i + step) {
                System.out.print(i + " ");
            }
        } else if (last < first) {
            for (int i = first; i >= last; i = i - step) {
                System.out.print(i + " ");
            }
        }
    }
}