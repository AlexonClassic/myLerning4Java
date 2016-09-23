package ProgKiev.JavaStart_Bohdan.Arrayys;

/**
 * Created by Олександр Шаповал on 10.07.2016.
 */

public class ArrSample1 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 100, 200, 300};

//        System.out.println(array[array.length - 1]);
//        System.out.println(array[array.length - 2]);
//        System.out.println(array[array.length - 3]);
//        System.out.println(array[array.length - 4]);

        for (int i = array.length - 1; i >= array.length / 2; i--){
            System.out.println(array[i]);
        }
    }
}
