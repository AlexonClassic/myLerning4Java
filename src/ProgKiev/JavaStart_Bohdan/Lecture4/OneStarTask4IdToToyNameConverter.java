package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 27.06.2016.
 *
 * Лекция 4. Задача 4 - Одна звезда:
 * Определение названия детской игрушки по ее идентификатору.
 * Если данной игрушки нет, бросить исключение illegalArgumentException
 *
 * Реализовать с помощью if-else цепочки.
 *
 * Виды игрушек:
 *      О - Саг.
 *      1 - Lego.
 *      2 - Doll.
 *      3 - Puzzle.
 */

public class OneStarTask4IdToToyNameConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Пожалуйста, укажите ID игрушки: ");
        int idToy = scanner.nextInt();

        if (idToy == 0) {
            System.out.println("Это машина");
        } else if (idToy == 1) {
            System.out.println("Это Lego");
        } else if (idToy == 2) {
            System.out.println("Это кукла");
        } else if (idToy == 3) {
            System.out.println("Это пазлы");
        } else {
            throw new IllegalArgumentException("Вы ввели ID, которого нет в базе...");
        }
    }
}