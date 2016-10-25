package OtherTasks.CatTest;

/**
 * Created by sergey.pensov on 14.01.2016.
 */

public class Cat {
    private int old = 0;
    private String name = "";

    public Cat(int old, String name) {
        this.old = old;
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}