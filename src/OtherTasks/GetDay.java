package OtherTasks;

import java.util.Date;

/**
 * Created by Олександр Шаповал on 10.10.2016.
 *
 * Получение текущего дня недели
 */

public class GetDay {
    public static void main(String[] args) {
        System.out.println("Today is " + DayGetter.TODAY);
    }
}

class DayGetter {
    static public String TODAY;

    static { // статический конструктор
        Date d = new Date();
        if (d.getDay() == 0) {
            TODAY = "Sunday";
        } else if (d.getDay() == 1) {
            TODAY = "Monday";
        }
    }
}