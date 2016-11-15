package OtherTasks.GMByte.Lesson15;

/**
 * Created by Олександр Шаповал on 15.11.2016.
 *
 * Lesson - 15 - Перегрузка методов:
 *
 * https://youtu.be/p0abqFopCQk?list=PLk95cAdGYXN1GYSm1NIMHJuyq_kk9Obg9
 *
 * 1) Создайте метод с тремя аргументами. Типа byte, int и long и дайте
 * ему любое название. Создайте все вариации этого
 * метода.
 *
 * Примечание: Из типов аргументов можно использовать только эти три
 * типа, в разном порядке!
 *
 * https://docviewer.yandex.ua/?url=ya-disk-public%3A%2F%2FWRJzA1WIPQGSpsK1qOgpikP07Sl4LwzEVcat7oIksDQ%3D&name=Domashnie_zadania_k_urokam_1-_15.txt&c=582b57c83221&page=3
 */

public class OverloadingMethods {
    void test(){
        System.out.println("In thise methot, no parameters");
    }

    void test(byte a, int b, long c){
        System.out.println("In thise methot, parameter is: \"byte a\", \"int b\", \"long c\": " + a + ", " + b + ", " + c);
    }

    void test (int b, byte a, long c){
        System.out.println("In thise methot, parameter is: \"int b\", \"byte a\", \"long c\": " + b + ", " + a + ", " + c);
    }

    void test (long c, byte a, int b){
        System.out.println("In thise methot, parameter is: \"long c\", \"byte a\", \"int b\": " + c + ", " + a + ", " + b);
    }
}