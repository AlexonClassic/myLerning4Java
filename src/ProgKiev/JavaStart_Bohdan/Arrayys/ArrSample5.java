package ProgKiev.JavaStart_Bohdan.Arrayys;

/**
 * Created by Олександр Шаповал on 11.07.2016.
 *
 * Одна звезда:
 * Написать метод для вывода в консоль ИНДЕКСЫ тех эл-тов которые < 100
 *
 * Вывод (индексы): 0, 1, 3, 5
 */

public class ArrSample5 {
    public static void main(String[] args) {
        //int[] array = {10, 20, 100, -30, 150, -10, -130, 200};
        int[] array = {10, 20, 100, -30, 150, -10, -130, 200, 99, 150, 7};

        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            if (array[i] < 100){
                System.out.print(i + " ");
            }
        }
    }
}