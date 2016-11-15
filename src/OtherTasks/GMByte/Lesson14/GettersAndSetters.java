package OtherTasks.GMByte.Lesson14;

/**
 * Created by Олександр Шаповал on 14.11.2016.
 *
 * Lesson - 14 - Геттеры и сеттеры (get, set):
 *
 * https://youtu.be/0avmK_ltOfA?list=PLk95cAdGYXN1GYSm1NIMHJuyq_kk9Obg9
 *
 * 1) Создайте класс с двумя полями(переменными) типа byte. Создайте
 *      геттеры и сеттеры для этих полей.
 *          1.1) В сеттерах должна быть проверка - если переданное значение
 *                  меньше двадцати, должно выводится: "Введено не верное
 *                  значение".
 *
 *          1.2) То же самое условие, но теперь в геттерах. Т. е. если значение
 *                  переменной не прошло проверку, должно выводиться: "Сначала
 *                  измените значение переменной".
 *
 * https://docviewer.yandex.ua/?url=ya-disk-public%3A%2F%2FWRJzA1WIPQGSpsK1qOgpikP07Sl4LwzEVcat7oIksDQ%3D&name=Domashnie_zadania_k_urokam_1-_15.txt&page=3&c=5829cf1218a7
 */

public class GettersAndSetters {
    byte a;
    byte b;

    public byte getA() {
        if (a < 20 || a > 127){
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("First change the variable value for variable \"byte a\"");
        }
            return a;
    }

    public byte getB() {
        if (b < 20 || a > 127){
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("First change the variable value for variable \"byte b\"");
        }
        return b;
    }

    public void setA(byte a) {
        if(a < 20 || a > 127){
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("You enter - " + a + ". It's wrong value for variable \"byte a\". Plz, enter more 20");
        } else {
            this.a = a;
        }
    }

    public void setB(byte b) {
        if(b < 20 || a > 127){
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("You enter - " + b + ". It's wrong value for variable \"byte b\". Plz, enter more 20");
        } else {
            this.b = b;
        }
    }
}