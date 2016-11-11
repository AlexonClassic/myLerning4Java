package OtherTasks.GMByte.Lesson3;

/**
 * Created by Олександр Шаповал on 11.11.2016
 *
 * Lesson - 3
 * https://youtu.be/x82BOGrO310?list=PLk95cAdGYXN1GYSm1NIMHJuyq_kk9Obg9
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