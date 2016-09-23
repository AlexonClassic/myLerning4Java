package ProgKiev.JavaStart_Bohdan;

/**
 * Created by Олександр Шаповал on 10.07.2016.
 *
 * Пример использования цикла For
 */

public class ForSample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 9; i >= 0; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i <=100; i= i + 5){
            System.out.print(i + " ");
        }

        System.out.println();

        int[] a = {12, 9, 0, 13, -12, 0, -13, 13};

        for (int i = 0; i < a.length; i++) {
            if (a[i] > i) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}