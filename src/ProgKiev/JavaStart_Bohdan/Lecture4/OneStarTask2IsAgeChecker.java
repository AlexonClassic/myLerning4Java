package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 23.06.2016.
 *
 * Лекция 4. Задача 2 - Одна звезда:
 * Определение корректности заданного возраста.
 * Возраст может принимать значения в диапазоне 1 ... 120
 */

public class OneStarTask2IsAgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Чтобы войти на этот сайт, введите Ваш возраст: ");
        int age = scanner.nextInt();

        if (age == 0) {
            System.out.println("Вы еще не родились, а уже цифры вводите...");
        } else if (age < 18) {
            System.out.println("Вы слишком молоды, чтобы посещать данный сайт");
        } else if (age >= 80 && age <= 120) {
            System.out.println("А не позновато ли Вам для таких сайтов? Ок. Заходите!");
        } else if (age > 120) {
            System.out.println("Люди столько не живут! Введите Ваш настоящий вораст...");
        } else {
            System.out.println("Ваш вораст - коректен. Вы можете посетить этот сайт. Смотри аккуратней!");
        }
    }
}