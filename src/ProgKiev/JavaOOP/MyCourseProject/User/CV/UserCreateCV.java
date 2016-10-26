package ProgKiev.JavaOOP.MyCourseProject.User.CV;

import ProgKiev.JavaOOP.MyCourseProject.Entity.JobsCategories;
import ProgKiev.JavaOOP.MyCourseProject.Utils.Errors;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 23.09.2016.
 *
 * Курсовой проект
 */

public class UserCreateCV{
    JobsCategories jobCategory;

//    JobsCategories jobsCategoriesAudit = JobsCategories.AUDIT;
//    JobsCategories jobsCategoriesFinance = JobsCategories.FINANCE;
//    JobsCategories jobsCategoriesInsurance = JobsCategories.INSURANCE;
//    JobsCategories jobsCategoriesIT = JobsCategories.IT;
//    JobsCategories jobsCategoriesRetail = JobsCategories.RETAIL;
//    JobsCategories jobsCategoriesOther = JobsCategories.OTHER;

    CV cv = new CV();

    public void CVCreator(){
        Scanner scanner = new Scanner(System.in);
        byte choiceJob;
        String jobsCategory;

        Errors errors = new Errors();

        System.out.print("What salary you want? ");
        cv.setUserSavary(scanner.nextInt());
        System.out.println("----------------------");

        System.out.println("What job you seek? ");
        System.out.println("       1. Audit");
        System.out.println("       2. Finance");
        System.out.println("       3. Insurance");
        System.out.println("       4. IT");
        System.out.println("       5. Retail");
        System.out.println("       6. Other");
        System.out.println("----------------------");
        System.out.print("Make your choice: ");

        do {
            choiceJob = scanner.nextByte();

            errors.WrongChoiceJob(choiceJob);

        } while (choiceJob < 1 || choiceJob > 6);

        switch (choiceJob) {
            case 1:
//                jobsCategory = JobsCategories.AUDIT;
//                cv.setUserVacancy(JobsCategories.AUDIT);
                cv.setUserVacancy(jobCategory.getJobCategory());
                System.out.println("----------------------");
                System.out.println("Yor choice is \"Audit\".");
                System.out.println("----------------------");
                break;
            case 2:
//                jobCategory = JobsCategories.FINANCE;
//                cv = new CV(jobCategory, cv.getUserSavary());
//                cv.setUserVacancy(JobsCategories.FINANCE);
                cv.setUserVacancy(jobCategory.getJobCategory());
                System.out.println("----------------------");
                System.out.println("Yor choice is \"Finance\".");
                System.out.println("----------------------");
                break;
            case 3:
//                jobCategory = JobsCategories.INSURANCE;
//                cv = new CV(jobCategory, cv.getUserSavary());
//                cv.setUserVacancy(JobsCategories.INSURANCE);
                cv.setUserVacancy(jobCategory.getJobCategory());
                System.out.println("----------------------");
                System.out.println("Yor choice is \"Insurance\".");
                System.out.println("----------------------");
                break;
            case 4:
//                jobCategory = JobsCategories.IT;
//                cv = new CV(jobCategory, cv.getUserSavary());
//                cv.setUserVacancy(JobsCategories.IT);
                cv.setUserVacancy(jobCategory.getJobCategory());
                System.out.println("----------------------");
                System.out.println("Yor choice is \"IT\".");
                System.out.println("----------------------");
                break;
            case 5:
//                jobCategory = JobsCategories.RETAIL;
//                cv = new CV(jobCategory, cv.getUserSavary());
//                cv.setUserVacancy(JobsCategories.RETAIL);
                cv.setUserVacancy(jobCategory.getJobCategory());
                System.out.println("----------------------");
                System.out.println("Yor choice is \"Retail\".");
                System.out.println("----------------------");
                break;
            case 6:
//                jobCategory = JobsCategories.OTHER;
//                cv = new CV(jobCategory, cv.getUserSavary());
//                cv.setUserVacancy(JobsCategories.OTHER);
                cv.setUserVacancy(jobCategory.getJobCategory());
                System.out.println("----------------------");
                System.out.println("Yor choice is \"Other\".");
                System.out.println("----------------------");
                break;
        }
    }
}