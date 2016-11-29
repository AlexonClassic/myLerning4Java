package OtherTasks.JavaBeginRu.Lesson21.Start;

import OtherTasks.JavaBeginRu.Lesson21.Objects.Camry50;
import OtherTasks.JavaBeginRu.Lesson21.Objects.Camry60;

/**
 * -------------------------------------------------------------------- <br />
 * Created by Олександр Шаповал on 29.11.2016.<br />
 * -------------------------------------------------------------------- <br />
 * Урок:
 *<a href="https://youtu.be/yymquRbmnfo?list=PLwwk4BHih4fg8e6-dUMveq3LIDZouwoqz">21 - Основы ООП. Наследование 2 </a><br />
 * -------------------------------------------------------------------- <br />
 */

public class Main {
    public static void main(String[] args) {
        Camry50 camry50 = new Camry50();

        camry50.drive();
        camry50.stop();
        camry50.light();

        Camry60 camry60 = new Camry60();
        camry60.drive();
    }
}