package OtherTasks.Rectangle;

/**
 * Created by Олександр Шаповал on 09.10.2016.
 *
 * Rectangle Example
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(Rectangle.NAME + ":");

        Rectangle г1 = new Rectangle();
        Rectangle г2 = new Rectangle(3, 2);

        System.out.println("Rect1: " + г1.getHeight() + " x " + г1.getWidth());
        System.out.println("Rect2: " + г2.getHeight() + " x " + г2.getWidth());

        г2.setHeight(22);
        г2.setWidth(33);
//        г2.width  =  100;   // Ощибка
        System.out.println("Rect2: " + г2.getHeight() + " x " + г2.getWidth());

        Rectangle г3 = Rectangle.combine(г1, г2);
        System.out.println("Rect3: " + г3.getHeight() + " x " + г3.getWidth());
    }
}