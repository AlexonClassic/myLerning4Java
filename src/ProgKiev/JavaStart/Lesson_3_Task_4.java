package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * 1. Среднее арифметическое элементов массива
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_3_Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите длину массива: ");
        int x = scanner.nextInt();

        int[] arr1 = new int[x];
        int summa = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100);
            summa += arr1[i];
        }

        System.out.println("\nВаш массив: " + Arrays.toString(arr1));
        System.out.println("Его среднее арифметическое равно: " + summa / arr1.length);

        // Второй вариант:
        int summa1 = 0;
        int arrRandomLength = random.nextInt(20);
        int[] arr = new int[arrRandomLength];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            summa1 += arr[i];
        }

        Arrays.sort(arr);
        summa1 /= arr.length;
        System.out.println("\nВаш массив: " + Arrays.toString(arr));
        System.out.println("Среднее арифметическое элементов массива: " + summa1);

    }
}