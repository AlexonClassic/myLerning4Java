package VideoLesons.TV;

/**
 * Created by Олександр Шаповал on 27.09.2016.
 *
 * Ключевое слово static - https://youtu.be/tJ8N4pafRl8
 */

public class Main {
    public static void main(String[] args) {
        // Call static function
        Panasonic.function();

        Panasonic panasonic = new Panasonic();

        panasonic.tornOn();
        panasonic.showChannel();
        panasonic.tornOff();

        System.out.println("-------------");
        System.out.println(panasonic.wight);
        System.out.println(panasonic.height);
    }
}
