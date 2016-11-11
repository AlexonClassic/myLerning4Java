package OtherTasks.GMByte.Lesson8;

/**
 * Created by Олександр Шаповал on 11.11.2016
 *
 * Lesson - 8
 * https://youtu.be/3r5Hjo03J3E?list=PLk95cAdGYXN1GYSm1NIMHJuyq_kk9Obg9
 *
 * https://docviewer.yandex.ua/?url=ya-disk-public%3A%2F%2FWRJzA1WIPQGSpsK1qOgpikP07Sl4LwzEVcat7oIksDQ%3D&name=Domashnie_zadania_k_urokam_1-_15.txt&page=2&c=5826337a13af
 */

public class ArgumentsInMethods {
    public static void main(String[] args) {
        byte a = 7;
        byte b = 15;
        byte c = 25;

        System.out.println("---------------------------");
        System.out.println("В метод \"ArgumentsInMethodsReceiver\", передаются значения:");
        System.out.println("       - первый аргумент (переменная \"byte a\"): " + a + ".");
        System.out.println("       - второй аргумент (переменная \"byte b\"): " + b + ".");
        System.out.println("       - третий аргумент (переменная \"byte c\"): " + c + ".");
        System.out.println("---------------------------");

        System.out.println("А в метод \"ArgumentsInMethodsCalculator\", передается значение:");
        System.out.println("       - переменной \"byte a\", котоорое равно: " + a + ".");

        argumentsInMethodsReceiver(a, b, c);

        System.out.println("Метод \"ArgumentsInMethodsCalculator\", после своей работы, вернул значение: " + argumentsInMethodsCalculator(a) + ".");
    }

    static void argumentsInMethodsReceiver(byte a, byte b, byte c){
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Привет! Я метод \"ArgumentsInMethodsReceiver\", и в качестве аргументов, мне передали:");
        System.out.println("       - первый аргумент (переменная \"byte a\"): " + a + ".");
        System.out.println("       - второй аргумент (переменная \"byte b\"): " + b + ".");
        System.out.println("       - третий аргумент (переменная \"byte c\"): " + c + ".");
        System.out.println("---------------------------");
    }

    static byte argumentsInMethodsCalculator(byte a){
        byte summ = (byte) (a + 5);

        System.out.println("Привет! А я метод \"ArgumentsInMethodsCalculator\", и в качестве аргумента, мне передали:");
        System.out.println("       - всего один аргумент (переменная \"byte a\"): " + a + ".");
        System.out.println();
        System.out.println("       К переданному аргументу (из переменной \"byte a\"): " + a + ", прибавляется 5.");
        System.out.println();
        System.out.println("       После чего, в главный метод (\"Main\"), должно быть передано: " + summ + ".");
        System.out.println();
        System.out.println("---------------------------");

        return summ;
    }
}