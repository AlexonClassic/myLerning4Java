package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * 1. Задать массив целых чисел длинной 10 эл.
 * 2. Отсортировать числа в массиве
 * 3. Вывести на экран результат
 */

import java.util.Arrays;
import java.util.Scanner;

public class Lesson_3_Task_1 {
    public static void main(String[] args) {
        int[] x1 = {5, 7, 8, 4, 2, 12, 85, 150, 17, 27};

        System.out.println(Arrays.toString(x1));
        System.out.println("-------------");
        Arrays.sort(x1);
        System.out.println(Arrays.toString(x1));
        System.out.println("-------------");

        // 4. Сделать возможность наполнения массива с клавиатуры *.

        int[] x2 = new int[3];
        Scanner x3 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        x2[0] = x3.nextInt();
        System.out.print("Вы ввели: " + x2[0] + "\n\n");
        System.out.println("Введите второе число: ");
        x2[1] = x3.nextInt();
        System.out.print("Вы ввели: " + x2[1] + "\n\n");
        System.out.println("Введите третье число: ");
        x2[2] = x3.nextInt();
        System.out.println("Вы ввели: " + x2[2] + "\n\nСпасибо!\n\nДля проверки, Вы ввели: " + Arrays.toString(x2) + "\n\nВсе верно?");
    }
}