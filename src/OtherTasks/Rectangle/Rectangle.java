package OtherTasks.Rectangle;

/**
 * Created by Олександр Шаповал on 09.10.2016.
 *
 * Rectangle Example
 */

public class Rectangle {
    public static final String NAME = "Rectangle";

    private int width, height;

    public static Rectangle combine(Rectangle r1, Rectangle r2) {
        return new Rectangle(r1.width + r2.width, r1.height + r2.height);
    }

    public Rectangle() {
        width = 10;
        height = 5;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int square() {
        return height * width;
    }
}