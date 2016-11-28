package ProgKiev.JavaStart.Bohdan.Lecture7;

/**
 * Created by Олександр Шаповал on 29.11.2016.
 *
 * Лекция 7. Задача 5. Conditions + Loops - Две звезды:
 * Вывод в консоль ромба размера size (нечетное число).
 * Если size - четное или отрицательное, бросить исключение IllegalArgumentException.
 */

public class ConditionsLoopsTask5TwoStarsRhombusPrinter {
    public static void main(String[] args) {
        int size = 5;

        if (size <= 0 || size % 2 == 0) {
            errorPrinter();
        }

        System.out.println();
        System.out.println("First solution:");
        // Более компактное
        rhombusPrinter1(size);

        System.out.println("--------------------------");

        System.out.println("Second solution:");
        // Менее компактное и мне кажется, менее правильное
        rhombusPrinter2(size);
    }

    public static void rhombusPrinter1(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (
                        i == 1 && j == 3 ||
                        i == 2 && j == 2 ||
                        i == 2 && j == 4 ||
                        i == 3 && j == 1 ||
                        i == 3 && j == 5 ||
                        i == 4 && j == 2 ||
                        i == 4 && j == 4 ||
                        i == 5 && j == 3
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void rhombusPrinter2(int size) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            if (i == 2 || i == 4) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            if (i == 1 || i == 5) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            if (i == 2 || i == 4) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void errorPrinter() {
        throw new IllegalArgumentException("The size cannot be negative or an even number!");
    }
}