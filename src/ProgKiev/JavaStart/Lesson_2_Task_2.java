package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 */

import java.util.Scanner;

public class Lesson_2_Task_2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int x1 = x.nextInt();

        System.out.println("Введите второе число: ");
        int x2 = x.nextInt();

        System.out.print("Это простое сложение: ");
        System.out.println(x1 + x2);
        System.out.print("Это простое вычитание: ");
        System.out.println(x1 - x2);
        System.out.print("Это простое умножение: ");
        System.out.println(x1 * x2);
        System.out.print("Это простое деление: ");
        System.out.println(x1 / x2);
        System.out.print("Это простое деление по модулю: ");
        System.out.println(x1 % x2);
        System.out.println();
        System.out.print("Это сложение с присваиванием: ");
        System.out.println(x1 += x2);
        System.out.print("Это вычитание с присваиванием: ");
        System.out.println(x1 -= x2);
        System.out.print("Это умножение с присваиванием: ");
        System.out.println(x1 *= x2);
        System.out.print("Это деление с присваиванием: ");
        System.out.println(x1 /= x2);
        System.out.print("Это деление по модулю с присваиванием: ");
        System.out.println(x1 %= x2);

        x.close();
    }
}