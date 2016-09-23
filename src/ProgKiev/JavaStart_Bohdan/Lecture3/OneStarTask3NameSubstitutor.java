package ProgKiev.JavaStart_Bohdan.Lecture3;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 23.06.2016.
 *
 * Лекция 3. Задача 3 - Одна звезда:
 * С клавиатуры вводятся 2 строки: message,  name.
 * Написать программу подстановки в сообщение message
 * имени name, вместо шаблона ${name}.
 *
 * Использовать метод из класса String.
 */

public class OneStarTask3NameSubstitutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите Ваше сообщение: ");
        String message = scanner.nextLine();

        System.out.println(message.replace("${name}", name));

        scanner.close();
    }
}