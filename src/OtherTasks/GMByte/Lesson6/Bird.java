package OtherTasks.GMByte.Lesson6;

/**
 * Created by Олександр Шаповал on 11.11.2016
 *
 * Lesson - 6
 * https://youtu.be/8XIZKdjZJSc?list=PLk95cAdGYXN1GYSm1NIMHJuyq_kk9Obg9
 *
 * https://docviewer.yandex.ua/?url=ya-disk-public%3A%2F%2FWRJzA1WIPQGSpsK1qOgpikP07Sl4LwzEVcat7oIksDQ%3D&name=Domashnie_zadania_k_urokam_1-_15.txt&c=5826246cfe03
 */

public class Bird {
    byte weight = 0;
    byte wingspan = 0;
    int maxFlightSpeed = 0;
    int maxAltitude = 0;

    void fly(){
        System.out.println("I can fly.");
    }

    void eat(){
        System.out.println("I can eat.");
    }

    void go(){
        System.out.println("I can go.");
    }

    void toLayEggs() {
        System.out.println("I can lay eggs");
    }
}