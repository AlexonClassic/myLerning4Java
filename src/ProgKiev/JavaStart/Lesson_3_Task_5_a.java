package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1)
 */

import java.util.Arrays;

public class Lesson_3_Task_5_a {
    public static void main(String[] args) {
        // Первый вариант:
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("\nПервый вариант:\n" + Arrays.toString(arr1));
        int tmp;
        for (int i = 0; i < arr1.length / 2; i++) {
            tmp = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = arr1[i];
            arr1[i] = tmp;
        }
        System.out.println(Arrays.toString(arr1));

        // Второй вариант:
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("\nВторой вариант:\n" + Arrays.toString(arr2));
        int temp;

        for (int i = 0; i < arr2.length; i++) {
            temp = arr2.length - 1 - i;
            arr2[i] = temp + 1;
        }
        System.out.println(Arrays.toString(arr2));
    }
}