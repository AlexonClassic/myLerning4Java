package ProgKiev.JavaOOP.MyCourseProject.User.Profile;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 23.09.2016.
 *
 * Курсовой проект
 */

public class UserCreateProfile {
    Scanner scanner = new Scanner(System.in);
    int unitRegistrationNumber;

    public void UserCreateProfile(){
        System.out.println("----------------------");
        System.out.println("Yor choice is user. Welcome!");
        System.out.println("----------------------");
        System.out.print("How many users you want create? ");
        unitRegistrationNumber = scanner.nextInt();

        User[] users = new User[unitRegistrationNumber];

        System.out.println("----------------------");
        System.out.println("Please, fill profile for user(s):");
        for (int i = 0; i < unitRegistrationNumber; i++) {
            users[i] = new User();
            users[i].UserCreateProfile();
        }

        System.out.println(Arrays.toString(users));
    }
}