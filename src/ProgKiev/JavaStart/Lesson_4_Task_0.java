package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * Вывести на экран 0-й, 14-й и 27-й элементы массива.
 */

public class Lesson_4_Task_0 {
    public static void main(String[] args) {
        int[] x = new int[28];

        for (int i = 0; i < x.length; i++) {
            x[i] = i * 635;
        }

        System.out.println("Это 0-й элемент: " + x[0]);
        System.out.println("Это 14-й элемент: " + x[14]);
        System.out.println("Это 27-й элемент: " + x[27]);
    }
}