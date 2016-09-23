package OtherTasks;

import java.util.*;

public class Cycles {
    public static void main(String[] args) {
        int[] arr = {};

        // Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
        showBy3(range(1, 100));
        System.out.println("");

        // Заполнить массив числами от 100 до 0.
        System.out.println(Arrays.toString(range(100, 0)));
        System.out.println("");

        // Зеркальное заполнение массива от центра
        System.out.println(Arrays.toString(mirror(11)));
    }

    /**
     * Написать метод, который заполнит массив произвольного размера
     * числами по возрастанию, начиная с центра массива,
     * например, [5,4,3,2,1,0,1,2,3,4,5].
     *
     * @param iLength
     * @return
     */
    private static int[] mirror(int iLength) {
        int[] a = new int[iLength];

        for (int i = 0; i < iLength >> 1; i++) {
            a[i] = a[iLength - i - 1] = (iLength >> 1) - i;
        }
        return a;
    }

    /**
     * Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
     */
    private static void showBy3(int[] a) {
        for (int i : a) {
            if (0 == i % 3) {
                System.out.print(" " + i);
            }
        }
    }

    /**
     * Метод, который заполняет массив начиная от стартового элемента (iStart) до конечного (iEnd)
     * Если iStart больше iEnd массив заполняется в обратном порядке
     */
    private static int[] range(int iStart, int iEnd) {
        int[] a = new int[Math.abs(iEnd - iStart) + 1];
        int iTmp = iStart;
        for (int i = 0; i < a.length; i++) {
            a[i] = iTmp;
            if (iEnd > iStart) {
                iTmp++;
            } else {
                iTmp--;
            }
        }
        return a;
    }

    private static int[] rand(int iLength) {
        Random r = new Random();
        int[] a = new int[iLength];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(255);
        }

        return a;
    }

}