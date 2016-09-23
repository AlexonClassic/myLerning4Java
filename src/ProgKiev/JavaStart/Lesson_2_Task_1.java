package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 */

import java.util.Scanner;

public class Lesson_2_Task_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите строку №1: ");
        String S1 = s.nextLine();
        System.out.println("Вы ввели: " + S1 + "\n\nВедите строку №2: ");
        String S2 = s.nextLine();
        System.out.println("Вы ввели: " + S2 + "\n\nВедите строку №3: ");
        String S3 = s.nextLine();
        System.out.println("вы ввели: " + S3 + "\n\nРезультат:\n" + S1 + S3 + "\n" + S3 + S2 + S1 + "\n" + S1 + S2 + S3);

        s.close();
    }
}