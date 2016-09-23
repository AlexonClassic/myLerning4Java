package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 27.06.2016.
 *
 * Лекция 4. Задача 5 - Одна звезда:
 * Определение идентификатора детской игрушки по ее названию
 * (задача, обратная к Лекция 4. Задача 4 - Одна звезда).
 *
 * Если данной игрушки нет, бросить исключение illegalArgumentException
 *
 * Реализовать с помощью switch-case.
 *
 * Виды игрушек:
 *      О - Саг.
 *      1 - Lego.
 *      2 - Doll.
 *      3 - Puzzle.
 */

public class OneStarTask5ToyNameToldConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Пожалуйста, укажите название игрушки: ");
        String nameToy = scanner.nextLine();

        int idToy = 0;

        switch (nameToy) {
            case "Машина":
                idToy = 0;
                System.out.println("ID этой игрушки: " + idToy);
                break;
            case "Lego":
                idToy = 1;
                System.out.println("ID этой игрушки: " + idToy);
                break;
            case "Кукла":
                idToy = 2;
                System.out.println("ID этой игрушки: " + idToy);
                break;
            case "Пазлы":
                idToy = 3;
                System.out.println("ID этой игрушки: " + idToy);
                break;
            default:
                throw new IllegalArgumentException("Вы ввели название, которого нет в базе...");
        }
    }
}