package ProgKiev.JavaStart_Bohdan.Lecture3;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 23.06.2016.
 *
 * Лекция 3. Задача 1 - Одна звезда:
 * С клавиатуры вводятся данные:
 * 1.   Имя.
 * 2.   Фамилия.
 * 3.   Возраст
 *
 * Нужно вывести эту информацию в приветственной форме от первого лица. Все
 * введенные данные являются корректными.
 */

public class OneStarTask1SimpleAboutMeSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите Вашу фамилию: ");
        String lastName = scanner.nextLine();

        System.out.print("Введите Ваш возраст: ");
        int age = scanner.nextInt();

        System.out.println("Привет! Я " + name + " " + lastName + ", мне " + age + " лет.");

        scanner.close();
    }
}