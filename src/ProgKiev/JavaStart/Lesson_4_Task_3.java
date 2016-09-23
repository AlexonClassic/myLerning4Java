package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * Заполнить массив числами от 100 до 0
 */

public class Lesson_4_Task_3 {
    public static void main(String[] args) {
        int[] numbers = new int[101];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers.length - i - 1;
            System.out.print(numbers[i] + " ");
        }
    }
}