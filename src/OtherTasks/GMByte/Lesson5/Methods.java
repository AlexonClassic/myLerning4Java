package OtherTasks.GMByte.Lesson5;

/**
 * Created by Олександр Шаповал on 11.11.2016
 *
 * Lesson - 5
 * https://youtu.be/bbqm-fvRgAo?list=PLk95cAdGYXN1GYSm1NIMHJuyq_kk9Obg9
 *
 * https://docviewer.yandex.ua/?url=ya-disk-public%3A%2F%2FWRJzA1WIPQGSpsK1qOgpikP07Sl4LwzEVcat7oIksDQ%3D&name=Domashnie_zadania_k_urokam_1-_15.txt&c=5826246cfe03
 */

public class Methods {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println();
        firstMethod();
        secondMethod();
        System.out.println("---------------------------");

        firstByteMethod();
        secondByteMethod();

        System.out.println("Ого, метод firstByteMethod что-то вернул! Он вернул число: " + firstByteMethod());
        System.out.println("---------------------------");

        System.out.println("Ого, метод secondByteMethod что-то вернул! Он вернул число: " + secondByteMethod());
        System.out.println("---------------------------");

        int result = firstByteMethod() + secondByteMethod();
        System.out.println("Сумма возвращенных значений обоих методов, равна: " + result);
        System.out.println();
        System.out.println("---------------------------");
    }

    static void firstMethod(){
        System.out.println("Я - firstMethod. Звали?");
    }

    static void secondMethod(){
        System.out.println("Я - secondMethod. Звали?");
    }

    static byte firstByteMethod(){
        byte a = 25;
        byte b = 5;
        byte summ = 0;

        return summ = (byte) (a + b);
    }

    static byte secondByteMethod(){
        byte a = 35;
        byte b = 25;
        byte summ = 0;

        return summ = (byte) (a + b);
    }
}