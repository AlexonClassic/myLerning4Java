package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 17.07.2016.
 *
 * Лекция 4. Задача 5. Arrays - Одна звезда:
 * Написать метод создания массива размера size, заполненного значениями от
 * 0 ... (size-1). Если size < 0, бросить исключение IllegalArgumentException.
 * int[] createSequenceArray(int size)
 */

public class ArraysTask5OneStarSequenceArrayCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraysize = scanner.nextInt();

        arrayFiller(arraysize);

        scanner.close();
    }

    public static void arrayFiller(int arraysize) {

        if (arraysize < 0) {
            System.out.println();
            throw new IllegalArgumentException("ERROR! Array size can't < 0");
        }

        int[] array = new int[arraysize];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        printArray(array);
    }

    public static void printArray (int[] array){
        System.out.println(Arrays.toString(array));
    }
}