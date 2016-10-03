package VideoLesons.CatAndPeople;

import VideoLesons.CatAndPeople.DevCat.Cat;
import VideoLesons.CatAndPeople.DevCat.Sportsmen;
import VideoLesons.CatAndPeople.DevPeople.CatPeople;

/**
 * Created by Олександр Шаповал on 21.09.2016.
 *
 * https://youtu.be/yoFRDSh6lWI?list=PLIU76b8Cjem48KXIy83YIm-QM6SwvzjQd
 */

public class CatMain {
    public static void main(String[] args) {
        Cat cat;
        CatPeople catPeople;

        cat = new Cat(2, "Tom", "Pitbul");
        catPeople = new CatPeople("Igor", "Petrov", 52, cat);
        catPeople.getCat().setName("Hren");

        System.out.println(catPeople);

        System.out.println("-----------");

        System.out.print("Cat say: ");
        for (int i = 0; i < 3; i++) {
            cat.SayMjau();
            System.out.print("! ");
        }

        System.out.println("");

        Sportsmen sportsmen = new Sportsmen("Sasha", "Shapoval", 41, null);
        sportsmen.setTypeSport("Tennis");

        System.out.println("-----------");
        System.out.println(sportsmen + " " + sportsmen.getTypeSport());

//        System.out.println(cat.getName());
//        System.out.println(cat.getPoroda());
//        System.out.println(cat.getAge());
//
//        // Peaple have cat
//        catPeople.setCat(cat);
//        catPeople.getCat().SayMjau();
//        System.out.println();
//        System.out.println("-----------");
//
//        System.out.println(catPeople.getName());
//        System.out.println(catPeople.getLastName());
//        System.out.println(catPeople.getAge());
//
//        System.out.println(cat);
//
//        System.out.println("");
    }
}