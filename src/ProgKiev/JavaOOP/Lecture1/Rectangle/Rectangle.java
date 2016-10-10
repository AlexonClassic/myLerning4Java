package ProgKiev.JavaOOP.Lecture1.Rectangle;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 28.09.2016.
 *
 * Лекция 1. Задача 4 - Одна звезда:
 * Написать класс Rectangle (Прямоугольник), содержащий размеры
 * (высоту и ширину), и умеющий подсчитывать свои периметр и площадь.
 *
 * Написать клиентский класс RectangleRunner, создающий список
 * прямоугольников и подсчитывающий их суммарную площадь.
 */

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void RectengleCreate(int height, int width) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter rectangle height: ");
        height = scanner.nextInt();

        System.out.print("Enter rectangle width: ");
        width = scanner.nextInt();

        calculationAndPrintPerimetrOfRectangle(height, width);
        calculationAndPrintAreaOfRectangle(height, width);
    }

    public static void calculationAndPrintPerimetrOfRectangle(int height, int width) {
        int rectanglePerimetr = (height + width) * 2;

        System.out.println("---------------");
        System.out.print("Rectangle perimetr equals: " + rectanglePerimetr);
    }

    public static void calculationAndPrintAreaOfRectangle(int height, int width) {
        int rectangleArea = height * width;

        System.out.println();
        System.out.print("Rectangle area equals: " + rectangleArea);
        System.out.println();
    }
}