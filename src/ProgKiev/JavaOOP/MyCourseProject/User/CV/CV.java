package ProgKiev.JavaOOP.MyCourseProject.User.CV;

/**
 * Created by Олександр Шаповал on 23.09.2016.
 *
 * Курсовой проект
 */

public class CV{
    private String userVacancy;
    private int userSavary;

//    UserCreateCV userCreateCV = new UserCreateCV();

    public String getUserVacancy() {
        return userVacancy;
    }

    public void setUserVacancy(String userVacancy) {
        this.userVacancy = userVacancy;
    }

    public int getUserSavary() {
        return userSavary;
    }

    public void setUserSavary(int userSavary) {
        this.userSavary = userSavary;
    }

    @Override
    public String toString() {
        return " User Vacancy is: " + getUserVacancy() + ", User Savary is: " + getUserSavary();
    }
}