package ProgKiev.JavaStart_Bohdan.Arrayys;

/**
 * Created by Олександр Шаповал on 10.07.2016.
 */

public class ArrSample3 {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 100, 200, 300};

//        printArray(array, 1, 3);
//        System.out.println();
//        printArray(array, 0, array.length);
//        System.out.println();
//        printTriangle(array);
//        System.out.println();
        printReverseTriangle(array);

    }

    public static void printArray(int[] array, int from, int to) {
        for (int i = from; i < to; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printTriangle(int[] array) {
//        printArray(array, 0, 1);
//        printArray(array, 0, 2);
//        printArray(array, 0, 3);
//        printArray(array, 0, 4);
//        printArray(array, 0, 5);
//        printArray(array, 0, 6);
//        printArray(array, 0, 7);

        for (int i = 1; i <= array.length; i++) {
            printArray(array, 0, i);
        }
    }

    //int[] array = {10, 20, 30, 40, 100, 200, 300};

    public static void printReverseTriangle(int[] array) {
//        printArray(array, 6, 7); // i = array.length - 1;
//        printArray(array, 5, 7); // i = array.length - 2;
//        printArray(array, 4, 7);
//        printArray(array, 3, 7); // ...
//        printArray(array, 2, 7);
//        printArray(array, 1, 7);
//        printArray(array, 0, 7); // i = 0

        for (int i = array.length - 1; i >= 0; i--) {
            printArray(array, i, array.length);
        }
    }
}