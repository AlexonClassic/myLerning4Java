package ProgKiev.JavaStart_Bohdan.Arrayys;

/**
 * Created by Олександр Шаповал on 10.07.2016.
 *
 * Одна звезда:
 * Есть массив: 10, 20, 100, -30, 150, -10, -130, 120,
 * написать метод, который выводит в консоль все элементы
 * от 100 до 200 включительно начиная с конца
 *
 * Вывести: 160, 120, 10
 */

public class ArrSample4 {
    public static void main(String[] args) {
        int[] array = {10, 20, 100, -30, 150, -10, -130, 120, 160, 200};

        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] >= 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] <= 0) {
                System.out.print(array[i] + " ");
            }
        }

    }
}