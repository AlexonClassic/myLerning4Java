package VideoLesons.DevPeople;

import VideoLesons.DevCat.Cat;

/**
 * Created by Олександр Шаповал on 21.09.2016.
 *
 * https://youtu.be/yoFRDSh6lWI?list=PLIU76b8Cjem48KXIy83YIm-QM6SwvzjQd
 */

public class CatPeople {
    private String name;
    private String lastName;
    private int age;

    private Cat cat;

    public CatPeople(String name, String lastName, int age, Cat cat) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "People name: " + name + ", People lastname: " + lastName + ", hi is " + age + " yars old. " + name + " " + lastName + ", have " + cat;
    }
}