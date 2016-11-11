package OtherTasks.GMByte.Lesson6;

/**
 * Created by Олександр Шаповал on 11.11.2016
 *
 * Lesson - 6
 * https://youtu.be/8XIZKdjZJSc?list=PLk95cAdGYXN1GYSm1NIMHJuyq_kk9Obg9
 *
 * https://docviewer.yandex.ua/?url=ya-disk-public%3A%2F%2FWRJzA1WIPQGSpsK1qOgpikP07Sl4LwzEVcat7oIksDQ%3D&name=Domashnie_zadania_k_urokam_1-_15.txt&c=5826246cfe03
 */

public class LinkedVar {
    public static void main(String[] args) {
        Bird bird = new Bird();

        bird.weight = 7;
        bird.wingspan = 25;
        bird.maxFlightSpeed = 125;
        bird.maxAltitude = 200;

        System.out.println("---------------------------");
        System.out.println("Hi! I bird");

        System.out.println();
        System.out.println("My weight: " + bird.weight);
        System.out.println("---------------------------");

        System.out.println("My wingspan: " + bird.wingspan);
        System.out.println("---------------------------");

        System.out.println("My max. flight speed: " + bird.maxFlightSpeed);
        System.out.println("---------------------------");

        System.out.println("My max. flight altitude: " + bird.maxAltitude);
        System.out.println("---------------------------");
        System.out.println();

        bird.fly();
        bird.go();
        bird.eat();
        bird.toLayEggs();
    }
}