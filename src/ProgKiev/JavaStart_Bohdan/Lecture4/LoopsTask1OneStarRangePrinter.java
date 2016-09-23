package ProgKiev.JavaStart_Bohdan.Lecture4;

/**
 * Created by Олександр Шаповал on 28.06.2016.
 *
 * Лекция 4. Задача 1. Loops - Одна звезда:
 * Вывод на экран целых чисел от first до last
 */

public class LoopsTask1OneStarRangePrinter {
    public static void main(String[] args) {
        // 1 2 3 4 5
        for (int i = 1; i <= 5; i++){
            System.out.print(i + " ");
        }

        System.out.println("\n------------");

        // 5  4  3  2  1
        for (int i = 5; i >= 1; i--){
            System.out.print(i + " ");
        }

        System.out.println("\n------------");

        // 1
        for (int i = 1; i <= 1; i++){
            System.out.print(i + " ");
        }
    }
}