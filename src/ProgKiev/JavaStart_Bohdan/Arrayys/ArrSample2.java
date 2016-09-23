package ProgKiev.JavaStart_Bohdan.Arrayys;

/**
 * Created by Олександр Шаповал on 10.07.2016.
 */

public class ArrSample2 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 100, 200, 300};

        for (int i = array.length - 1; i >= 0; i = i - 2) {
            System.out.println(array[i]);
        }
    }
}