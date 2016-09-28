package OtherTasks;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Олександр Шаповал on 23.09.2016.
 *
 * TimeHelper - помощник в работе с датой и временем
 */

public class TimeHelper {
    public static long getTimelnMs() {
        Date date = new Date();
        return date.getTime();
    }

    public static int getPOSIX() {
        Date date = new Date();

        int millislnSecond = 1000;
        return (int) (date.getTime() / millislnSecond);
    }

    public static String getUserDateFull(Locale locale) {
        Date date = new Date();
        DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.FULL, locale);
        return dateFormatter.format(date);
    }
}
