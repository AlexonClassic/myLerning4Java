package OtherTasks;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * Создайте массив из 8 случайных целых чисел из отрезка [1;10]
 * Выведите массив на экран в строку
 * Замените каждый элемент с нечётным индексом на ноль
 * Снова выведете массив на экран на отдельной строке
 */

import java.util.Arrays;
import java.util.Random;

public class Lesson_1_Task_5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10);
            System.out.print(arr[i] + " ");

            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println("\n" + Arrays.toString(arr));
    }
}
