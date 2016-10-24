package ProgKiev.JavaOOP.MyCourseProject.User.Profile;

import ProgKiev.JavaOOP.MyCourseProject.Utils.IDGenerator;
import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 23.09.2016.
 *
 * Курсовой проект
 */

public class User {
    Scanner scanner = new Scanner(System.in);
    IDGenerator idGenerator = new IDGenerator();

    private long userId = idGenerator.generateID();
    private String userName;
    private String userLastName;
    private String userBirthday;
    private int userAge;
    private String userGender;
    private String userLive;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserLive() {
        return userLive;
    }

    public void setUserLive(String userLive) {
        this.userLive = userLive;
    }

    public void UserCreateProfile(){
        System.out.print("       - enter your name: ");
        setUserName(scanner.next());
        System.out.print("       - enter your last name: ");
        setUserLastName(scanner.next());
        System.out.print("       - enter your birthday: ");
        setUserBirthday(scanner.next());
        System.out.print("       - enter your age: ");
        setUserAge(scanner.nextInt());
        System.out.print("       - enter your gender: ");
        setUserGender(scanner.next());
        System.out.print("       - enter where you live: ");
        setUserLive(scanner.next());
        System.out.println("----------------------");
    }

    @Override
    public String toString() {
        return "User ID: " + userId + ". User: " + userName + " " + userLastName + ". User Birthday: " + userBirthday + ", hi is " + userAge + " yars old. His gender is: " + userGender + " and user live in: " + userLive;
    }
}