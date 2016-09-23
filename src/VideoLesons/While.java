package VideoLesons;

/**
 * Created by Олександр Шаповал on 18.05.2016.
 */

public class While {
    public static void main (String [] args){
        int x = 10;
        while (x>9 && x<15){
            System.out.println("Hello - " + x);
            x++;
            System.out.println("Hello - " + x);
            //++x;
        }
        System.out.println("Конец цикла");
    }
}
