package ProgKiev.JavaOOP.Lecture2.ImmutablePointLine;

/**
 * Created by Олександр Шаповал on 11.10.2016.
 *
 * Лекция 2. Задача 1 - Одна звезда - Immutable Point, Line:
 * Написать классы:
 * 1. Point: int x, int y.
 * 2. Line: Point start, Point end.
 * Точка и линия должны быть неизменяемыми объектами (Immutable).
 *
 * Выполнить задачи:
 * 1. Создать список разных линий.
 * 2. Посчитать суммарный размер всех линий.
 * 3. Найти самую длинную линию.
 */

public class ImmutablePointLineMain {
    public static void main(String[] args) {
        Point points = new Point(0, 0);

        System.out.println("----------------------");
        System.out.print("How many line you wont create? ");
        points.pointsCreator();
    }
}
