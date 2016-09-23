package ProgKiev.JavaStart_Bohdan.Lecture4;

/**
 * Created by Олександр Шаповал on 16.07.2016.
 *
 * Лекция 4. Задача 4. Arrays - Одна звезда:
 * Написать метод подсчета количества положительных чисел в массиве,
 * int countPositives(int[] array)
 */

public class ArraysTask4OneStarArrayPositivesCounter {
    public static void main(String[] args) {
        int[] array = {-3, 0, -1, 4, -2, 5};

        countPositives(array);
    }

    public static void countPositives (int[] array){
        int tempCounter = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] > 0){
                tempCounter += 1;
            }
        }

        System.out.println(tempCounter);
    }
}