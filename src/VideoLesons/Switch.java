package VideoLesons;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 18.05.2016.
 */

public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = s.nextInt();
        switch (age) {
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Не одно не подошло");
        }

        /* Scanner s = new Scanner(System.in);
        System.out.println("Введи возраст");
        String age = s.nextLine();
        switch (age) {
            case "Ноль":
                System.out.println("Ты родился");
                break;
            case "Семь":
                System.out.println("Ты пошел в школу");
                break;
            case "Восемьнадцать":
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Не одно не подошло");
        } */
    }
}