package OtherTasks.GMByte.Lesson9;

/**
 * Created by Олександр Шаповал on 11.11.2016
 *
 * Lesson - 9
 *
 * https://youtu.be/UmKVu4xz33o?list=PLk95cAdGYXN1GYSm1NIMHJuyq_kk9Obg9
 *
 * 1) Создайте пакет и в нём класс. В классе создайте три переменные и три
 * метода: с модификатороми: public, private, без модификатора(default).
 *
 * В главном классе, в главном методе, создайте объект этого класса и
 * попробуйте обратится к его методам и переменным. Пронаблюдайте, к
 * каким из них можно обратится, а к каким нет.
 *
 * 2) Проделайте тоже самое, что и в первом задании, но создайте этот
 * класс не в отдельном пакете, а в том же, что и главный класс.
 *
 * https://docviewer.yandex.ua/?url=ya-disk-public%3A%2F%2FWRJzA1WIPQGSpsK1qOgpikP07Sl4LwzEVcat7oIksDQ%3D&name=Domashnie_zadania_k_urokam_1-_15.txt&page=2&c=5826337a13af
 */

public class AccessModifiersClassNoPackage {
    byte a = 7;
    byte b = 3;
    byte c = 5;

    public byte AccessModifiersClassPublicModifier(){
        byte summ = (byte) (a + b + c);
        return summ;
    }

    private byte AccessModifiersClassPrivateModifier(){
        byte summ = (byte) (a + b + c);
        return summ;
    }

    byte AccessModifiersClassNoModifier(){
        byte summ = (byte) (a + b + c);
        return summ;
    }
}