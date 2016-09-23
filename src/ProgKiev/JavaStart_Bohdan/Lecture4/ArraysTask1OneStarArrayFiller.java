package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 12.07.2016.
 *
 * Лекция 4. Задача 1. Arrays - Одна звезда:
 * Написать метод заполнения массива array указанным
 * значением filler, void fill(int[]  array,   int filler)
 */

public class ArraysTask1OneStarArrayFiller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int arrayLengthNumber = scanner.nextInt();

        System.out.println("Enter filler number: ");
        int filler = scanner.nextInt();

        int[] array = new int[arrayLengthNumber];

        ArrayFiller(array, filler);
        PrintArray(array);
    }

    public static void ArrayFiller (int[] array, int filler){
        for (int i = 0; i < array.length; i++){
            array[i] = filler;
        }
    }

    public static void PrintArray (int[] array){
        System.out.println(Arrays.toString(array));
    }
}