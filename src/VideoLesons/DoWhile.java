package VideoLesons;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println("Введите \"5\"");
        do {
            value = scanner.nextInt();
            if (value != 5) {
                System.out.println("Вы ввели: \"" + value + "\"... Введите \"5\"");
            }
        } while (value != 5);

        /* while (value != 5) {
        System.out.println("Вы ввели: \"" + value + "\"... Введите \"5\"");
        value = scanner.nextInt();
        } */

        System.out.println("Вы ввели \"5\". Все верно!");
    }
}