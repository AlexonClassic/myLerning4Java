package ProgKiev.JavaOOP.MyCourseProject.User.CV;

import ProgKiev.JavaOOP.MyCourseProject.User.Profile.User;

/**
 * Created by Олександр Шаповал on 23.09.2016.
 *
 * Курсовой проект
 */

public class CV extends User{
    private String userVacancy;
    private int userSavary;

//    private String userVacancy = "Buhgalter";
//    private int userSavary = 12_000;

//    public CV(long userId, String userName, String userLastName, String userBirthday, int userAge, String userGender, String userCitizenship, String userLive) {
//        super(userId, userName, userLastName, userBirthday, userAge, userGender, userCitizenship, userLive);
//    }

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

    void say(){
        System.out.println("User create thise CV in class CV, method Say");
    }

    @Override
    public String toString() {
        return "User Vacancy is: " + userVacancy + ", User Savary is: " + userSavary;
    }
}
