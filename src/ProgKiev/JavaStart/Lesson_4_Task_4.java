package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * Дано массив из 10 целых чисел.
 * Вывести на экран сумму всех его элементов кроме
 * первого и последнего
 */

public class Lesson_4_Task_4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int summa = 0;

        for (int i = 1; i < numbers.length - 1; i++) {
            summa += numbers[i];
        }

        System.out.println(summa);
    }
}