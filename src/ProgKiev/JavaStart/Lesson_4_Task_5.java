package ProgKiev.JavaStart;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * Написать игру «Крестики нолики» используя двухмерные массивы
 */

import java.util.Scanner;

public class Lesson_4_Task_5 {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        /*int[][] nums = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < nums.length; i++){
            for(int j=0; j < nums[i].length; j++){

                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }*/

        byte[][] krestNol = new byte[3][3];

        for (int i = 0; i < krestNol.length; i++) {
            for (int j = 0; j < krestNol[i].length; j++) {
            }
            System.out.println();
        }
        for (int i = 0; i < 9; i++) {
            System.out.print("\nСделайте Ваш ход, используя клавиши от 1 до 9... ");
            byte point = scanner.nextByte();
            if (point == 1) {
                krestNol[0][0] = 1;
            } else if (point == 2) {
                krestNol[0][1] = 1;
            } else if (point == 3) {
                krestNol[0][2] = 1;
            } else if (point == 4) {
                krestNol[1][0] = 1;
            } else if (point == 5) {
                krestNol[1][1] = 1;
            } else if (point == 6) {
                krestNol[1][2] = 1;
            } else if (point == 7) {
                krestNol[2][0] = 1;
            } else if (point == 8) {
                krestNol[2][1] = 1;
            } else if (point == 9) {
                krestNol[2][2] = 1;
            }
            for (int i1 = 0; i1 < krestNol.length; i1++) {
                for (int j = 0; j < krestNol[i1].length; j++) {
                    /*if (krestNol[0][0] && krestNol[0][1] && krestNol[0][2] = 1 ||
                            krestNol[1][0] && krestNol[1][1] && krestNol[1][2] = 1 ||
                            krestNol[2][0] && krestNol[2][1] && krestNol[2][2] = 1 ||
                            krestNol[0][0] && krestNol[1][1] && krestNol[2][2] = 1 ||
                            krestNol[0][2] && krestNol[1][1] && krestNol[2][0] = 1 ||
                            krestNol[0][1] && krestNol[1][1] && krestNol[2][1] = 1) {
                        System.out.println("Вы победили!");
                    }*/
                    System.out.print(krestNol[i1][j] + " ");
                }

                System.out.println();
            }
        }

    }
}