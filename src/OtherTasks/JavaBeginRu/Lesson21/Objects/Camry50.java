package OtherTasks.JavaBeginRu.Lesson21.Objects;

/**
 * -------------------------------------------------------------------- <br />
 * Created by Олександр Шаповал on 29.11.2016.<br />
 * -------------------------------------------------------------------- <br />
 * Урок:
 *<a href="https://youtu.be/yymquRbmnfo?list=PLwwk4BHih4fg8e6-dUMveq3LIDZouwoqz">21 - Основы ООП. Наследование 2</a><br />
 * -------------------------------------------------------------------- <br />
 */

public class Camry50 extends Camry30{
    public void light(){
        System.out.println("Camry 50 - Light");
    }

    @Override
    public void drive() {
        System.out.println("Camry 50 - Drive");
    }
}