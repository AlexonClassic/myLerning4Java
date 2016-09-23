package OtherTasks;

/**
 * Created by Олександр Шаповал on 08.06.2016.
 *
 * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
 * массива на экран сначала в строку, отделяя один элемент от другого
 * пробелом, а затем в столбик (отделяя один элемент от другого началом
 * новой строки). Перед созданием массива подумайте, какого он будет размера
 */

public class Lesson_1_Task_1 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int temp = 0;

        for (int i = 2; i <= arr.length; i++) {
            if (i % 2 == 0) {
                arr[temp] = i;
                System.out.print(arr[temp] + " ");
                temp++;
            }
        }
    }
}