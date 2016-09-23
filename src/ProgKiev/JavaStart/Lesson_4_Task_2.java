package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка
 */

public class Lesson_4_Task_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        for (int i = 3; i <= 100; i += 3) { // вариант с презентации
            System.out.print(i + " ");
        }
    }
}