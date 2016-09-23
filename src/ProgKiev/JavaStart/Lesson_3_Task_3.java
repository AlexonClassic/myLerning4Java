package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * 1. Ввести с клавиатуры массив из 10 чисел.
 * 2. Разбить его на 2 массива равной длинны.
 * 3. Отсортировать каждую из половинок и вывести их содержимое на экран.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_3_Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите длину массива: ");
        int arrLength = scanner.nextInt();
        int[] arrParrent = new int[arrLength];
        int[] arrChield1;
        int[] arrChield2;

        for (int i = 0; i < arrParrent.length; i++) {
            arrParrent[i] = random.nextInt(100);
        }
        arrChield1 = Arrays.copyOfRange(arrParrent, 0, arrParrent.length / 2);
        arrChield2 = Arrays.copyOfRange(arrParrent, arrParrent.length / 2, arrParrent.length);

        Arrays.sort(arrChield1);
        Arrays.sort(arrChield2);
        System.out.println("\nЭто массив arrParrent: " + Arrays.toString(arrParrent) + "\n");
        System.out.println("Это массив arrChield1: " + Arrays.toString(arrChield1) + "\n");
        System.out.println("Это массив arrChield2: " + Arrays.toString(arrChield2));
    }
}