package OtherTasks;

/**
 * Created by Олександр Шаповал on 22.10.2016.
 *
 * Вывод массива треугольником (два направления)
 */

public class TriangleArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }

// Revers
        for (int i = array.length - 1; i >= 0; i--) {
            for (int k = i; k >= 0; k--) {
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }
    }
}