package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * Найти в массиве чисел элементы с наибольшим и наименьшим значениями
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_4_Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите длину массива: ");
        int arrN = scanner.nextInt();

        int[] numbers = new int[arrN];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Назименьшее значение: " + numbers[0] + ". A наибольшее значение: " + numbers[arrN-1]);
    }
}