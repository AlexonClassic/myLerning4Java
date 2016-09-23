package VideoLesons;

import java.util.Arrays;

/**
 * Created by Олександр Шаповал on 19.05.2016.
 *
 * https://youtu.be/li86TEAEhYM?list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak
 */

public class ArraysExample {
    public static void main(String[] args) {
        int number = 5;
        int numbers[] = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }

        System.out.println("\n---------------------\n");

        int[] number1 = {1, 2, 3};
        for (int i = 0; i < number1.length; i++) {
            System.out.println(number1[i]);
        }

        System.out.println("\n---------------------\n");

        int catNames[] = new int[10];

        for (int i = 0; i < 10; i++) {
            catNames[i] = 10;
            System.out.println(catNames[i]);
        }

        System.out.println("\n---------------------\n");

        String[] catNames1 = new String[10];
        for (int i = 0; i < 10; i++) {
            catNames1[i] = "";
        }

        System.out.println("\n---------------------\n");

        int[] mice = {4, 8, 10, 12, 16};
        int result = 0;
        int result1 = 0;

        for (int i = 0; i < 5; i++) {
            result = result + mice[i];
            result1 = result1 + mice[i];
        }
        result = result / 5;
        System.out.println("result - Среднее арифметическое: " + result);

        System.out.println();

        result1 = result / mice.length; // общий результат делим на число элементов в массиве
        System.out.println("result1 - Среднее арифметическое: " + result);

        System.out.println("\n---------------------\n");

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[arr[i]] + " ");
            //System.out.print(arr[i] + " ");
            arr[arr[i]] += i;
        }
        System.out.println("\narr[i]: " + Arrays.toString(arr));

        System.out.println("\n---------------------\n");
    }
}