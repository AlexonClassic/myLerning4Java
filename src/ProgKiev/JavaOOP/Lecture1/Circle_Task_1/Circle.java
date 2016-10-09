package ProgKiev.JavaOOP.Lecture1.Circle_Task_1;

/**
 * Created by Олександр Шаповал on 10.10.2016.
 *
 * Лекция 1. Задача 1:
 * Написать класс Circle_Task_1 (круг) по аналогии с Rectangle и метод,
 * который будет возвращать его площадь.
 */

public class Circle {
//  First variant
    public static final String NAME = "Square circle is";
    private double circleRadius;

    public Circle (double radius) {
        circleRadius = radius;
    }

    public double squareCircle() {
        return Math.PI * circleRadius * circleRadius;
    }

/* Second variant
    private double circleRadius;

    public Circle (double radius){
        this.circleRadius = radius;
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public double squareCircle(){
        return (double) (Math.PI * circleRadius * circleRadius);
    }
*/
}