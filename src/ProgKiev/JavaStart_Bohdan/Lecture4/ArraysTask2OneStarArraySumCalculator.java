package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 12.07.2016.
 *
 *  Лекция 4. Задача 2. Arrays - Одна звезда:
 *  Написать метод вычисления суммы всех элементов массива,
 *  int sum(int[] array)
 *
 *  Пример работы:
 *  sum(new int[] {2, 1, 3}) == 6
 */

public class ArraysTask2OneStarArraySumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int arrayLengthNumber = scanner.nextInt();
        int[] array = new int[arrayLengthNumber];

        ArrayFillerAndPrintArray(array);
        ArraySumCalculator(array);
    }

    public static void ArrayFillerAndPrintArray(int[] array) {
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(10);
        }

        System.out.println(Arrays.toString(array));
    }

    public static void ArraySumCalculator (int[] array){
        int summa = 0;

        for (int i = 0; i < array.length; i++){
            summa += array[i];
        }

        PrintArraySumma(summa);
    }

    public static void PrintArraySumma(int summa) {
        System.out.println();
        System.out.println("Summa all elements in array, equal: " + summa);
    }
}