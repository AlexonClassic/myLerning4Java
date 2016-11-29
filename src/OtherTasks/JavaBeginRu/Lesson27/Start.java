package OtherTasks.JavaBeginRu.Lesson27;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * -------------------------------------------------------------------- <br />
 * Created by Олександр Шаповал on 27.11.2016.<br />
 * -------------------------------------------------------------------- <br />
 * Урок:
 *<a href="https://youtu.be/68pssD9Dqj8?list=PLwwk4BHih4fi8LTppXzTrCBgMJjC7FX7t">27 - Основы java. Реализация Set</a><br />
 * -------------------------------------------------------------------- <br />
 */

public class Start {
    public static void main(String[] args) {
        hashSetExample();
    }

    public static void hashSetExample(){
        Set cars = new HashSet();

        Car car0 = new Car("BMW");
        Car car1 = new Car("Niva");
        Car car2 = new Car("Nissan");
        Car car3 = new Car("Volvo");
        Car car4 = new Car("Nissan");

        cars.add(car0);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4); // добавляем дубликаты

        // проход по коллекции с помощью иттератора
        Iterator iterator = cars.iterator();

        // not ordered - порядок получения, не такой же, как порядок вставки
        while (iterator.hasNext()){
            Car car = (Car) iterator.next();
            System.out.println("Car Name is: " + car.getName());
        }
    }
}