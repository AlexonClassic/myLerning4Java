package ProgKiev.JavaOOP.MyCourseProject;

import ProgKiev.JavaOOP.MyCourseProject.Company.Company;
import ProgKiev.JavaOOP.MyCourseProject.User.Profile.UserCreateProfile;
import ProgKiev.JavaOOP.MyCourseProject.Utils.Errors;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 23.09.2016.
 *
 * Курсовой проект
 */

public class Registration {
    public void Registration() {
        Scanner scanner = new Scanner(System.in);
        byte choiceTypeRegistration;

        UserCreateProfile userCreateProfile = new UserCreateProfile();
        Errors errors = new Errors();

        System.out.println();
        System.out.println("What type registration you want? ");
        System.out.println("       1. User");
        System.out.println("       2. Company");
        System.out.println("----------------------");
        System.out.print("Make your choice: ");

        do {
            choiceTypeRegistration = scanner.nextByte();

            errors.WrongChoiceTypeRegistration(choiceTypeRegistration);

        } while (choiceTypeRegistration < 1 || choiceTypeRegistration > 2);

        switch (choiceTypeRegistration) {
            case 1:
                userCreateProfile.UserCreateProfile();
                break;
            case 2:
                System.out.println("----------------------");
                System.out.print("Yor choice is company. Welcome! Please, fill your company profile:");
                Company company = new Company();
                break;
        }
    }
}