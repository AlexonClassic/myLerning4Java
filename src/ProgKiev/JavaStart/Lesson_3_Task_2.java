package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * Задать массив целых чисел длинной N эл.
 * Поменять 1-й и последний элемент местами
 * Вывести массив на экран
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_3_Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int x1 = 0;
        int x2 = 0;

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        scanner.close();

        int[] arr = new int[n];
        System.out.print("\nВаш массив, будет содержать " + arr.length + " элементов:\n");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            x2 = arr[i];
        }

        System.out.println(Arrays.toString(arr) + "\n");

        x1 = arr[0];
        arr[0] = x2;
        arr[arr.length - 1] = x1;

        System.out.println(Arrays.toString(arr));
    }
}