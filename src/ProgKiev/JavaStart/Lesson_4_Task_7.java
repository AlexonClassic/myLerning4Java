package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * Найти в массиве число, которое повторяется наибольшее количество раз.
 * Не использовать коллекции
 */

public class Lesson_4_Task_7 {
    public static void main(String[] args) {

        int[] arr1 = {1, 5, 5, 7, 7, 7, 9, 7, 8, 5, 6, 7, 2, 2, 1, 3, 4, 5};
        int maxRepeatNumber = 0;
        int iterationCounter = 0;
        int arrMaxNumber = 0;

        for (int i : arr1) {
            for (int j : arr1) {
                if (arr1[i] == arr1[j]) {
                    iterationCounter++;
                }
            }

            if (iterationCounter > arrMaxNumber) {
                arrMaxNumber = iterationCounter;
                maxRepeatNumber = arr1[i];
            }
        }
        System.out.println(maxRepeatNumber);
    }
}