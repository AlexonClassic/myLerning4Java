package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * Вывести на экран числа от 10 до 20 с помощью всех известных циклов
 */

public class Lesson_4_Task_1 {
    public static void main(String[] args) {
        int varWhile = 10;
        int varDoWhile = 10;
        int varFor = 10;
        //int varForEach = 10;

        System.out.println("\n---------------------------------\nЦикл While:");
        while (varWhile <= 20) {
            System.out.println(varWhile++);
        }

        System.out.println("\n---------------------------------\nЦикл Do While:");
        do {
            System.out.println(varDoWhile++);
        } while (varDoWhile <= 20);

        System.out.println("\n---------------------------------\nЦикл For:");
        for (; varFor <= 20; varFor++) {
            System.out.println(varFor);
        }

        System.out.println("\n---------------------------------\nЦикл For Each:");

        System.out.println("---------------------------------\n");
    }
}