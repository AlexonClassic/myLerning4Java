package OtherTasks.GMByte.Lesson11;

/**
 * Created by Олександр Шаповал on 14.11.2016.
 *
 * Lesson - 11 - Условия:
 *
 * https://youtu.be/L-yV36aCSsA?list=PLk95cAdGYXN1GYSm1NIMHJuyq_kk9Obg9
 *
 * 1) Создайте переменную типа byte и присвойте ей любое значение.
 *      1.1) Если значение переменной меньше пятидесяти, должен выводится
 * текст: "Меньше чем 50", если равно "Равно 50", если больше "Больше
 * чем 50"
 *
 *      1.2) Если значение переменной 1, должен выводится текст:
 *      "Переменная равна одному", если 2, должен выводится текст:
 *      "Переменная равна двум", а если любому другому числу: "Я такого
 *      числа не знаю".
 *
 *      1.3) Если значение переменной меньше 100, выводится текст
 *      "Переменная хранит значение меньше 100". Если значение переменной
 *      больше 50, выводится текст: "Переменная хранит значение больше 50".
 *
 *      (1.3) Примечание: Оба условия должны существовать одновременно(в
 *      одной программе)!
 *
 * https://docviewer.yandex.ua/?url=ya-disk-public%3A%2F%2FWRJzA1WIPQGSpsK1qOgpikP07Sl4LwzEVcat7oIksDQ%3D&name=Domashnie_zadania_k_urokam_1-_15.txt&c=5829b3df2c26&page=2
 */

public class Conditions {
    public static void main(String[] args) {
        byte a = 37;

        System.out.println("---------------------------");
        System.out.println();
        if(a < 50){
            System.out.println("Variable \"a\" less 50");
        }else if(a == 50){
            System.out.println("Variable \"a\" equals 50");
        }else {
            System.out.println("Variable \"a\" more 50");
        }

        System.out.println("---------------------------");

        if (a == 1){
            System.out.println("Variable \"a\" equals 1");
        }else if (a == 2){
            System.out.println("Variable \"a\" equals 2");
        }else{
            System.out.println("I don't know this digit");
        }

        System.out.println("---------------------------");

        if (a < 100){
            System.out.println("Variable \"a\" hold a value less 100");
        }else if (a > 50){
            System.out.println("Variable \"a\" hold a value more 50");
        }
    }
}