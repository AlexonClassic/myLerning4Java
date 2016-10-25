package OtherTasks.CatTest;

import java.util.Scanner;

/**
 * Created by sergey.pensov on 14.01.2016.
 */

public class CatTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Plz enter old and name");
        System.out.print("       - old: ");
        int old = scanner.nextInt();

        System.out.print("       - name: ");

        String name = scanner.next();
        Cat someTestCat = new Cat(old, name);

        System.out.println("Name: " + someTestCat.getName() + " old: " + someTestCat.getOld());
    }
}