package OtherTasks.GMByte.Lesson12;

/**
 * Created by Олександр Шаповал on 14.11.2016.
 *
 * Lesson - 12 - Блок switch:
 *
 * https://youtu.be/6ILnDdT6FU4?list=PLk95cAdGYXN1GYSm1NIMHJuyq_kk9Obg9
 *
 * 1) Создайте переменную типа byte и присвойте ей любое значение.
 * 1.1) Если значение переменной меньше пятидесяти, должен выводится
 * текст: "Меньше чем 50", если равно "Равно 50", если больше "Больше
 * чем 50"
 *
 * 1.2) Если значение переменной 1, должен выводится текст:
 * "Переменная равна одному", если 2, должен выводится текст:
 * "Переменная равна двум", а если любому другому числу: "Я такого
 * числа не знаю".
 *
 * https://docviewer.yandex.ua/?url=ya-disk-public%3A%2F%2FWRJzA1WIPQGSpsK1qOgpikP07Sl4LwzEVcat7oIksDQ%3D&name=Domashnie_zadania_k_urokam_1-_15.txt&c=5829b3df2c26&page=2
 */

public class SwitchBlock {
    public static void main(String[] args) {
        byte a = 50;

        System.out.println("---------------------------");
        System.out.println();

        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                System.out.println("Variable \"a\" less 50");
                break;
            case 50:
                System.out.println("Variable \"a\" equals 50");
                break;
            default:
                System.out.println("Variable \"a\" more 50");
                break;
        }
    }
}