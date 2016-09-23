package VideoLesons;

// https://youtu.be/ayUbY2sB-IU?list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        String usernamevar = "Толик";
        int useragevar = 17;
        person1.setName(usernamevar, useragevar);
        //person1.name = "Вася";
        //person1.age = 17;
        person1.sayHello();
        person1.speek();
        System.out.println();
        int x = person1.calculateYarsToPensija();
        //person1.calculateYarsToPensija();
        //System.out.println("\n\nПривет.\nМеня зовут " + person1.name + ". Мне - " + person1.age + " лет.\n");
        Person person2 = new Person();
        person2.name = "Таня";
        person2.age = 12;
        person2.sayHello();
        person2.speek();
        System.out.println("\n");
        int x1 = person2.calculateYarsToPensija();
        System.out.println(x1);
        //person2.calculateYarsToPensija();
        //System.out.println("Привет.\nМеня зовут " + person2.name + ". Мне - " + person2.age + " года.");
    }
}

class Person {
    String name;
    int age;

    void setName(String username, int userage) {
        name = username;
        age = userage;
    }

    //void calculateYarsToPensija() {
    int calculateYarsToPensija() {
        int x = 65 - age;
        return x;
        /* if (age >= 5 && age <= 20) {
            System.out.println(" До пенсии мне осталось: " + x + " лет");
        } else {
            System.out.println(" До пенсии мне осталось: " + x + " года");
        }  */
    }

    void speek() {
        if (age >= 5 && age <= 20) {
            System.out.print("Меня зовут " + name + ". Мне, " + age + " лет.");
        } else {
            System.out.print("Меня зовут " + name + ". Мне, " + age + " года.");
        }
    }

    void sayHello() {
        System.out.print("Привет. ");
    }
}