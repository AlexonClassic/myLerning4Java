package ProgKiev.JavaStart;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Олександр Шаповал on 12.06.2016.
 *
 * Написать метод, который заполнит массив произвольного размера числами по
 * возрастанию, начиная с центра массива, например, [5,4,3,2,1,0,1,2,3,4,5]
 */

public class Lesson_4_Task_10 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int arrLengthNumber = rnd.nextInt(10);

        int[] arr = new int[arrLengthNumber];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));
        perevorotOtCentra(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void perevorotOtCentra(int[] arr) {
        final int len = arr.length;
        int n = (len % 2 == 0) ? 1 : 0;

        for (int i = len / 2; i < len; i++)
            arr[i] = arr[arr.length - i - 1] = n++;
    }
}