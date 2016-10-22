package ProgKiev.JavaOOP.CourseProject.Utils;

/**
 * Created by Олександр Шаповал on 23.09.2016.
 *
 * Курсовой проект
 */

public class Errors {
    public void WrongChoiceTypeRegistration(byte choiceTypeRegistration) {
        if (choiceTypeRegistration > 2) {
            System.out.println("----------------------");
            System.out.print("Yor choice must by from 1 to 2. You enter - " + choiceTypeRegistration + ". It's wrong number! Please, re-enter your choice: ");
        }
    }
}
