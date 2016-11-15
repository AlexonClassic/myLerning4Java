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

public class OverloadingMethodsRunner {
    public static void main(String[] args) {
        OverloadingMethods overloadingMethods = new OverloadingMethods();

        overloadingMethods.test();
        overloadingMethods.test((byte)5, 2525, 1_000_000_000L);
        overloadingMethods.test(7575, (byte)127, 2_000_000_000L);
        overloadingMethods.test(3_000_000_000L, (byte)12, 2475);
    }
}