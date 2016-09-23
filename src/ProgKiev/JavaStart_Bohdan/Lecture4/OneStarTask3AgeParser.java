package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 27.06.2016.
 *
 * Лекция 4. Задача 3 - Одна звезда:
 * Парсинг строки возраста (в строке представлено число типа int)
 *
 * Можно пользоваться стандартными функциями.
 *
 * Если входная строка является числом,
 * что не соответствует диапазону 1 ... 120,
 * бросить исключение IllegalArgumentException
 */

public class OneStarTask3AgeParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String userName = scanner.nextLine();
        System.out.print("Введите Ваш возраст: ");
        String parseAge = scanner.nextLine();

        String tempString = "Привет! Меня зовут" + userName + ", мне " + parseAge + " лет";

        int ageString = Integer.parseInt(tempString.substring(tempString.indexOf("мне ") + 4, tempString.indexOf(" лет")));
        if (ageString < 1 || ageString > 120) {
            throw new IllegalArgumentException("Люди столько не живут...");
        }

        System.out.println(userName + " - " + ageString + " лет");
    }
}