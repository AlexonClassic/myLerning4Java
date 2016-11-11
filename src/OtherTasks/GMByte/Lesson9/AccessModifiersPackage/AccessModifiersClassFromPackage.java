package OtherTasks.GMByte.Lesson9.AccessModifiersPackage;

/**
 * Created by Олександр Шаповал on 11.11.2016
 *
 * Lesson - 9
 * https://youtu.be/UmKVu4xz33o?list=PLk95cAdGYXN1GYSm1NIMHJuyq_kk9Obg9
 *
 * https://docviewer.yandex.ua/?url=ya-disk-public%3A%2F%2FWRJzA1WIPQGSpsK1qOgpikP07Sl4LwzEVcat7oIksDQ%3D&name=Domashnie_zadania_k_urokam_1-_15.txt&page=2&c=5826337a13af
 */

public class AccessModifiersClassFromPackage {
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