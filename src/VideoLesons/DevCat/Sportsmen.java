package VideoLesons.DevCat;

import VideoLesons.DevPeople.CatPeople;

/**
 * Created by Олександр Шаповал on 21.09.2016.
 */

public class Sportsmen extends CatPeople {

    private String typeSport;

    public Sportsmen(String name, String lastName, int age, Cat cat) {
        super(name, lastName, age, cat);
    }

    public String getTypeSport() {
        return typeSport;
    }

    public void setTypeSport(String typeSport) {
        this.typeSport = typeSport;
    }
}
