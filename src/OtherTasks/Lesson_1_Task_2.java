package OtherTasks;

// Создайте массив из всех нечётных чисел от 1 до 99
// выведите его на экран в строку
// затем этот же массив выведите на экран тоже в строку,
// но в обратном порядке (99 97 95 93 … 7 5 3 1).

import java.util.Arrays;

public class Lesson_1_Task_2 {
    public static void main(String[] args) {
        int[] arr1 = new int[99];
        int temp = 0;  // переменная для хранения счетчика индекса массива

        /*
            1) инициализируем счетчик (i = 0)
            2) сверяем условие выхода из цикла (i <= arr1.length)
            3) запускаем итерацию (i++)
        */
        for (int i = 0; i <= arr1.length; i++) {
            /*
                1) проверяем остаток от деления числа на 2 равен ли нулю
                2) если равен, выходим из If и возвращаемся в цикл For
                3) итерация увеличивается и i = 1
             */
            if (i % 2 != 0) {
                /*
                    1) если остаток от деления на 2 не равен нулю
                    2) записываем в arr1[temp] единицу, которая хранится в i (arr1[temp] = i)
                */
                arr1[temp] = i;
                // выводим на экран
                // на экран, выводится ТОЛЬКО! то, что есть в массиве (без незаполненных нулей, которыми был заполнен массив при создании)
                System.out.print(arr1[temp] + " ");
                // увеличиваем значение переменной temp на единицу для продолжения заполнения следующего индекса массива
                temp++;
            }
        }
        // выводим на экран
        // на экран, выводится все, что есть в массиве (включая незаполненные нули, которыми был заполнен массив при создании)
        System.out.println("\n" + Arrays.toString(arr1));
    }
}