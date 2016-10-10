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

public class RectangleRunner {
    private int height = 0;
    private int width = 0;
    private int rectangleCount = 0;
    private int allRectanglesTotalSquere = 0;
    private int temp = 0;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void RectanglesCreater() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------");
        System.out.print("How many rectangle you wont to create for calculation? ");
        rectangleCount = scanner.nextInt();

        RectangleRunner[] rectangles = new RectangleRunner[rectangleCount];

        for (int i = 0; i < rectangleCount; i++) {
            rectangles[i] = new RectangleRunner();
            System.out.print("Enter new rectangle height: ");
            rectangles[i].setHeight(scanner.nextInt());

            System.out.print("Enter new rectangle width: ");
            rectangles[i].setWidth(scanner.nextInt());
            System.out.println("---------------");
        }

        RectanglesTotalSquereCalc(rectangles);
    }

    public void RectanglesTotalSquereCalc(RectangleRunner[] rectangles) {
        for (RectangleRunner i: rectangles) {
            temp = i.getHeight() * i.getWidth();
        }

        allRectanglesTotalSquere = temp * rectangleCount;

        RectanglesTotalSquerePrinter(allRectanglesTotalSquere);
    }

    public void RectanglesTotalSquerePrinter(int allRectanglesTotalSquere) {
        System.out.println("Total squere " + rectangleCount + " rectangles = " + allRectanglesTotalSquere);
    }
}