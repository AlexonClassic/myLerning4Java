package OtherTasks.JavaBeginRu.Lesson27;

/**
 * -------------------------------------------------------------------- <br />
 * Created by Олександр Шаповал on 27.11.2016.<br />
 * -------------------------------------------------------------------- <br />
 * Урок:
 *<a href="https://youtu.be/68pssD9Dqj8?list=PLwwk4BHih4fi8LTppXzTrCBgMJjC7FX7t">27 - Основы java. Реализация Set</a><br />
 * -------------------------------------------------------------------- <br />
 */

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        return getName().equals(car.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}