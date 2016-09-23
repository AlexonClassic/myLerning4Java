package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * С помощью консоли пользователь вводит математическое выражение типа
 * "1+33-4*7". Написать программу для подсчета его значения.
 * Приоритет операций не учитывается
 */

import java.util.Arrays;
import java.util.Scanner;

public class Lesson_4_Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mathEquation;

        System.out.print("Введите Ваше уравнение: ");
        mathEquation = scanner.nextLine();
        String parts[] = mathEquation.split(" ");
        System.out.println(Arrays.toString(parts));
    }
}