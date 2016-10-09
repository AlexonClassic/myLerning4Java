package ProgKiev.JavaOOP.Lecture1.Circle_Task_1;

/**
 * Created by Олександр Шаповал on 10.10.2016.
 *
 * Лекция 1. Задача 1:
 * Написать класс Circle_Task_1 (круг) по аналогии с Rectangle и метод,
 * который будет возвращать его площадь.
 */

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.print(Circle.NAME + ": ");
        System.out.println(circle.squareCircle());
    }
}