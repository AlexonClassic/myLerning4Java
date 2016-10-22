package OtherTasks;

/**
 * Created by Олександр Шаповал on 22.10.2016.
 *
 * Change var. Var 'a' to 'b' and 'b', to 'a'
 */

public class ChangeVar {
    public static void main(String[] args) {
        int a = 1_500_000_001;
        int b = 1_500_000_002;

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

        ChangeVarExampleTwo();
    }

    public static void ChangeVarExampleTwo(){
        int temp;
        int a = 1_500_000_001;
        int b = 1_500_000_002;

        System.out.println("----------------------");
        System.out.println();
        System.out.println("Next example:");
        System.out.println("Begin a = " + a);
        System.out.println("Begin b = " + b);
        System.out.println("----------------------");

        temp = a;
        System.out.println("temp: " + temp);
        a = b;
        System.out.println("a = b: " + a);
        b = temp;
        System.out.println("b = temp: " + b);

        System.out.println("----------------------");
        System.out.println("After a = " + a);
        System.out.println("After b = " + b);
    }
}