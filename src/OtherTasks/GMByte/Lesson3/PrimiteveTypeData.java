package OtherTasks.GMByte.Lesson3;

/**
 * Created by Олександр Шаповал on 11.11.2016.
 *
 * Lesson - 3
 *
 * https://youtu.be/x82BOGrO310?list=PLk95cAdGYXN1GYSm1NIMHJuyq_kk9Obg9
 *
 * 1) Создайте две переменные типа byte и запишите в них любые числа
 * (помните про диапазон от -128 до +127).
 *
 * 1.1) Выведите на экран строку: "Первая переменная хранит значение
 * (значение Вашей первой переменной)" и ещё одну строку "Вторая
 * переменная хранит значение (значение Вашей второй переменной)."
 *
 * 1.2) Сложите эти переменные и выведите на экран строку: "Сумма
 * переменных = (сумма Ваших переменных)".
 *
 * Дополнительно: Выполните с этими переменными все четыре операции(+,
 * - , \ , *) и каждый раз выводите результат на экран.
 *
 * https://docviewer.yandex.ua/?url=ya-disk-public%3A%2F%2FWRJzA1WIPQGSpsK1qOgpikP07Sl4LwzEVcat7oIksDQ%3D&name=Domashnie_zadania_k_urokam_1-_15.txt&page=1&c=5829b3df2c26
 */

public class PrimiteveTypeData {
    public static void main(String[] args) {
        byte a = 25;
        byte b = 5;
        byte summ = 0;

        System.out.println();
        System.out.println("Первая переменная \"a\" хранит значение: " + a);
        System.out.println("Вторая переменная \"b\" хранит значение: " + b);
        System.out.println("---------------------------");

        summ = (byte) (a + b);
        System.out.println("Сумма переменных \"a\" и \"b\" после прибавления, равна: " + summ);
        System.out.println("---------------------------");

        summ = (byte) (a - b);
        System.out.println("Сумма переменных \"a\" и \"b\" после отнимания, равна: " + summ);
        System.out.println("---------------------------");

        summ = (byte) (a / b);
        System.out.println("Сумма переменных \"a\" и \"b\" после деления, равна: " + summ);
        System.out.println("---------------------------");

        summ = (byte) (a * b);
        System.out.println("Сумма переменных \"a\" и \"b\" после умножения, равна: " + summ);
    }
}