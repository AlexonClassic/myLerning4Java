package ProgKiev.JavaStart;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Олександр Шаповал on 10.06.2016.
 *
 * Написать метод для зеркального переворота элементов в массиве
 * ([1, 2, 3, 4] -> [4, 3, 2, 1])
 *
 */

public class Lesson_4_Task_9 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(arr1));
        perevorot(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void perevorot(int... n) {
        int tmp;

        for (int i = 0; i < n.length / 2; i++) {
            tmp = n[n.length - 1 - i];
            n[n.length - 1 - i] = n[i];
            n[i] = tmp;
        }
        return;
    }
}

// Второй вариант с заполнением массива случайными числами
class Test {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);
        }
        System.out.println("\n" + Arrays.toString(arr));
        zerkaloPerevorot(arr);
        System.out.println("\n" + Arrays.toString(arr));
    }

    static void zerkaloPerevorot(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
    }
}