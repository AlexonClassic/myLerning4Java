package VideoLesons.DevCat;

/**
 * Created by Олександр Шаповал on 21.09.2016.
 *
 * https://youtu.be/yoFRDSh6lWI?list=PLIU76b8Cjem48KXIy83YIm-QM6SwvzjQd
 */

public class Cat {
    private int age;
    private String name;
    private String poroda;

    public Cat(int age, String name, String poroda) {
        this.age = age;
        this.name = name;
        this.poroda = poroda;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public void SayMjau(){
        System.out.print("Mjau");
    }

    @Override
    public String toString() {
        System.out.println("");
        //System.out.println("-----------");
        return "Cat name: " + name + ", Cat poroda: " + poroda + ", hi is " + age + " yars old";
    }
}
