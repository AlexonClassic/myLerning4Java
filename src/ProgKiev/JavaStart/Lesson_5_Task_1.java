package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 13.06.2016.
 *
 * Написать функцию, которая принимает в качестве аргументов:
 * - одну строку X;
 * - целое число Y;
 * - число с плавающей точкой Z
 * и возвращает как результат строку в виде S = x + y + z
 */

public class Lesson_5_Task_1 {
    public static void main(String[] args) {
        String stringS = "Это строка S";
        int number = 55;
        double doubleNumber = 2.7;

        stringMethod(stringS, number, doubleNumber);
    }

    static String stringMethod(String x, int y, double z) {
        System.out.println(x + " = " + y + " + " + z);

        return (x);
    }
}