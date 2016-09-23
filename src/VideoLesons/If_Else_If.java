package VideoLesons;

/**
 * Created by Олександр Шаповал on 18.05.2016.
 */

public class If_Else_If {
    public static void main(String[] args) {
        int x = 5;
        if (x == 0) {
            System.out.println("Да, верно: х равен нулю: " + "\"" + x + "\"");
        } else if (x == 0 || x < 15) {
            System.out.println("Нет - не верно: x - больше нуля: " + "\"" + x + "\"");
        } else {
            System.out.println(x);
        }
    }
}