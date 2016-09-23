package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 */

import java.util.Scanner;

public class Lesson_3_Task_5_b_a {
    public static void main(String[] args) {

        int varForArr = 0; // переменная для наполнения массива
        int varNumberToEnter = 1; // переменная для счетчика какую цифру нужно ввести

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int scannerVar = scanner.nextInt();

        int[] arr1 = new int[scannerVar]; // создаем массив с тем кол-вом элементов [x3], которое задал юзер

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Введите " + (i + 1) + "-е число: ");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("\nВаш массив создан. Его длина: " + arr1.length + "\n");

        // Второй вариант:
        // System.out.println("Ваш массив создан. Его длина: " + x3 + "\n\n");
        System.out.print("Какой элемент, Вы, хотите посмотреть? Введите цифру от 1 до " + arr1.length + ": ");
        int scannerVar1 = scanner.nextInt() - 1; // делам для юзера привычный ввод (не с 0, а с 1-цы)

        System.out.println("\n:) выиграшные номера на этой неделе: " + arr1[scannerVar1]);

        scanner.close();
    }
}