package OtherTasks.GMByte.Lesson10;

/**
 * Created by Олександр Шаповал on 11.11.2016
 *
 * Lesson - 10 - Конструкторы:
 *
 * https://youtu.be/WAeT1eW4mr4?list=PLk95cAdGYXN1GYSm1NIMHJuyq_kk9Obg9
 *
 * 1) Создайте класс. В нём создайте четыре переменных.
 * При создании объекта все переменные должны инициализироватся
 * (получать значения) и на экран должен быть выведен текст:
 * "Меня создали!".
 *
 * 2) Подумайте, можно ли с помощью конструктора инициализировать
 * статическую переменную?
 *
 * https://docviewer.yandex.ua/?url=ya-disk-public%3A%2F%2FWRJzA1WIPQGSpsK1qOgpikP07Sl4LwzEVcat7oIksDQ%3D&name=Domashnie_zadania_k_urokam_1-_15.txt&page=2&c=5826337a13af
 */

public class ConstructorsRunner {
    public static void main(String[] args) {
        Constructors constructors = new Constructors((byte)5, (byte)7, (byte)10, (byte)-100, (byte)70);
    }
}