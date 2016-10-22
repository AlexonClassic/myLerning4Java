package OtherTasks;

/**
 * Created by Олександр Шаповал on 22.10.2016.
 */
public class ChangeVar {
    public static void main(String[] args) {
// Change var. Var 'a' to 'b' and 'b', to 'a'
        int a = 89;
        int b = 72;

        System.out.println("----------------------");
        System.out.println("Begin a = " + a);
        System.out.println("Begin b = " + b);
        System.out.println("----------------------");

        a = a + b;
        System.out.println("a = a + b: " + a);
        b = a - b;
        System.out.println("b = a - b: " + b);
        a = a - b;
        System.out.println("a = a - b: " + a);

        System.out.println("----------------------");
        System.out.println("After a = " + a);
        System.out.println("After b = " + b);
    }
}