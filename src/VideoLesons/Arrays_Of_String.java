package VideoLesons;

/**
 * Created by Олександр Шаповал on 20.05.2016.
 */

public class Arrays_Of_String {
    // https://youtu.be/8AD55r64yNw?list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak
    public static void main(String[] args) {
        /* int [] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]); */

        String[] string_arr = new String[3];
        string_arr[0] = "Привет";
        string_arr[1] = "Пока";
        string_arr[2] = "Вот и все";

        /* System.out.println(string_arr[0]);
        System.out.println(string_arr[1]);
        System.out.println(string_arr[2]); */

        /* for (int i=0; i< string_arr.length; i++){
            System.out.println(string_arr[i]);
        } */

        /* for (String string : string_arr) { // Цикл (Loop) - For Each
            System.out.println(string);
        }  */

        int numbers1[] = {1, 2, 3};
        int sum = 0;
        for (int x : numbers1) {
            sum = sum + x;
        }
        System.out.println(sum);
    }
}