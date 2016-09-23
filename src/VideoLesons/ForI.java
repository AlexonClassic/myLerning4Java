package VideoLesons;

/**
 * Created by Олександр Шаповал on 18.05.2016.
 */

public class ForI {
    public static void main(String[] args) {
        for (int i = 0, x = 15; i <= 10 && x >= 15; ++i, x++, ++x) {
            System.out.println("Hello - i - " + i);
            System.out.println("Hello - x - " + x);
        }
        System.out.println("Конец цикла");
    }
}
