package OtherTasks;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * Программа загадывает случайное целое число из отрезка (1;10)
 * и просит пользователя его угадать, вводя варианты с клавиатуры
 * пока пользователь не угадает число, программа будет ему подсказывать
 * сообщая больше или меньше число загаданное, чем то, что ввёл пользователь.
 */

import java.util.Random;
import java.util.Scanner;

public class Ugadayka {
    public static void main(String[] args) {
        int prog = 0;
        int user = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        prog = random.nextInt(10);

        System.out.println(prog);

        System.out.print("Программа загадала число. Попробуйте его отгадать.\nВведите число от 0 до 10: ");
        user = scanner.nextInt();

        while (user < prog || user > prog) {
            while (user > 10) {
                System.out.print("Вы ввели слишком большое чило. Введите число от 0 до 10");
                user = scanner.nextInt();
            }

            while (user <= 0) {
                System.out.println("Вы ввели слишком маленькое чило. Введите число от 0 до 10");
                user = scanner.nextInt();
            }

            System.out.print("Вы не угадали :( Мое число - ");
            if (user < prog) {
                System.out.print("больше\nВведите новое число: ");
                user = scanner.nextInt();
            } else if (user > prog) {
                System.out.print("меньше\nВведите новое число: ");
                user = scanner.nextInt();
            }
        }

        if (user == prog) {
            System.out.println("\n---------------------\nВы угадали! Поздравляю! Пока!");
        }
    }
}