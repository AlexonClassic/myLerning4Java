package OtherTasks;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 20.07.2016
 *
 * Вывести числа Фибоначи
 */

public class Fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printer("Какое количество цифр вывести? ");
        int count = scanner.nextInt();

        fibonachiDigitFiller(count);
    }

    public static void fibonachiDigitFiller(int count) {
        int a = 1;
        int b = 1;
        int fibo;

        printer("0 " + a + " " + b + " ");

        for (int i = 3; i < count; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
            printer(fibo + " ");
        }
    }

    public static void printer(String s) {
        System.out.print(s);
    }
}