package ProgKiev.JavaOOP.Lecture2.ImmutablePointLine;

import java.util.Arrays;
import java.util.Scanner;

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

public class Point {
    private int lineCount;
    private final int x;
    private final int y;

    Point[] points = new Point[lineCount];

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void pointsCreator() {
        Scanner scanner = new Scanner(System.in);
        lineCount = scanner.nextInt();

        System.out.println("----------------------");
        System.out.println("enter points for first line: ");
        points[0] = pointerFiller(scanner);

        for (int i = 1; i < lineCount; i++){
            System.out.println("----------------------");
            System.out.println("enter points for next line:");
            points[i] = pointerFiller(scanner);
        }

        System.out.println("----------------------");
        System.out.println(Arrays.toString(points));
    }

    public static Point pointerFiller(Scanner scanner) {
        System.out.print("     - enter x: ");
        int x = scanner.nextInt();

        System.out.print("     - enter y: ");
        int y = scanner.nextInt();

        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Points for line {x = " + x + ", y = " + y + '}';
    }
}