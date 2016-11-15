package OtherTasks.GMByte.Lesson13;

/**
 * Created by Олександр Шаповал on 14.11.2016.
 *
 * Lesson - 13 - Циклы:
 *
 * https://youtu.be/83APFViB7WQ?list=PLk95cAdGYXN1GYSm1NIMHJuyq_kk9Obg9
 *
 * 1) С помощью цикла while выведите на консоль числа в порядке
 *      убывания от 100 до 0.
 *          1.1) Числа должны выводится с пропуском одного числа.
 *              Пример:
 *                  100
 *                  98
 *                  96
 *                  94
 *                  92
 *                  90
 *
 *          1.2) Сделайте тоже самое с помощью всех остальных видов цикла.
 *
 * 2) С помощью цикла while выведите на консоль числа в порядке
 *      увиличения от 10 до 50.
 *          2.1) Числа должны выводится с пропуском двух чисел.
 *              Пример:
 *                  10
 *                  13
 *                  16
 *                  19
 *
 *          2.2) Сделайте это с помощью всех остальных видов цикла.
 *
 * https://docviewer.yandex.ua/?url=ya-disk-public%3A%2F%2FWRJzA1WIPQGSpsK1qOgpikP07Sl4LwzEVcat7oIksDQ%3D&name=Domashnie_zadania_k_urokam_1-_15.txt&page=3&c=5829cf1218a7
 */

public class Loops {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        int c = 10;
        int d = 50;
        int e = 10;
        int f = 50;

        while (a >= 0){
            System.out.print(a + " ");
            a--;
        }

        System.out.println();
        System.out.println("---------------------------");

        do {
            System.out.print(b + " ");
            b--;
        }while (b >= 0);

        System.out.println();
        System.out.println("---------------------------");

        for (int i = 100; i >= 0; i--){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("---------------------------");

        while (c <= d){
            System.out.print(c + " ");
            c += 3;
        }

        System.out.println();
        System.out.println("---------------------------");

        do {
            System.out.print(e + " ");
            e += 3;
        }while (e <= f);

        System.out.println();
        System.out.println("---------------------------");

        for (int i = 10; i <= 50; i+=3){
            System.out.print(i + " ");
        }
    }
}