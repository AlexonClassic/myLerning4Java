package ProgKiev.JavaOOP.Lecture1.Rectangle;

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

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(0, 0);
        rectangle.RectengleCreate(0, 0);

        RectangleRunner rectangleRunner = new RectangleRunner();
        rectangleRunner.RectanglesCreater();
    }
}