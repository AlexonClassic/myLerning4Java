package OtherTasks.source_it_web.task;

/**
 * @Autor Sergey Pensov
 */

public class Task1 {
    public static void modNumber(int number) {
        int length = Integer.toString(number).length();
        /*
         * String str = Integer.toString(number);
         * length = str.length();
         * */

        int mod = (int) Math.pow(10, length - 1);

        for (int i = 0; i < length; i++) {
            System.out.println(number / mod);
            number %= mod;
            mod /= 10;

        }
    }
}