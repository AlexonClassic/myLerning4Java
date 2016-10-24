package ProgKiev.JavaOOP.MyCourseProject.Utils;

/**
 * Created by Олександр Шаповал on 23.09.2016.
 *
 * Курсовой проект
 */

public class IDGenerator {
    private static int unitID = 1;

    public int generateID() {
        return unitID++;
    }
}