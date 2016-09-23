package OtherTasks;

/* Created by Олександр Шаповал on 21.06.2016.
*
* Создайте массив из 15 случайных целых чисел из отрезка [0;9]
* Выведите массив на экран.
* Подсчитайте сколько в массиве чётных элементов и выведете это
* количество на экран
* */

import java.util.Random;

public class Lesson_1_Task_4 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] arr = new int[15];
        int summa = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0 && arr[i] > 0) {
                summa++;
            }
        }
        System.out.println("\nСумма: " + summa);
    }
}
