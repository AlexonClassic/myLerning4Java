package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Arrays;

/**
 * Created by Олександр Шаповал on 16.07.2016.
 *
 * Лекция 4. Задача 3. Arrays - Одна звезда:
 * Написать методы поиска индекса первого и последнего
 * положительного числа.
 * Если положительных чисел нет, вернуть -1.
 * int findFirstPositive(int[] array)
 * int findLastPositive(int[] array)
 */

public class ArraysTask3OneStarArrayPositiveFinder {
    public static void main(String[] args) {
        int[] array = {-3, -2, -1, -1, -2, -5};

        System.out.println();
        System.out.println("Our array: " + Arrays.toString(array));
        System.out.println();

        findFirstPositive(array);
        findLastPositive(array);

    }

    public static void findFirstPositive(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            int firstArrayIndex = 0;

            if (array[i] > 0) {
                firstArrayIndex = i;
                temp = 1;

                printFirstArrayIndex(firstArrayIndex);
                break;
            }
        }

        if (temp == 0) {
            System.out.println("-1");
        }
    }

    public static void findLastPositive(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int lastArrayIndex = 0;

            if (array[i] > 0) {
                lastArrayIndex = i;

                printLastArrayIndex(lastArrayIndex);
                break;
            }
        }
    }

    public static void printFirstArrayIndex(int firstArrayIndex) {
        System.out.println("First positive index in our array: " + firstArrayIndex);
    }

    public static void printLastArrayIndex(int lastArrayIndex) {
        System.out.println("Last positive index in our array: " + lastArrayIndex);
    }
}