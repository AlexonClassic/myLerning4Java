package ProgKiev.JavaOOP.MyCourseProject.Entity;

/**
 * Created by Олександр Шаповал on 26.10.2016.
 *
 * Курсовой проект
 */

public enum JobsCategories {
    IT("IT"),
    AUDIT("Audit"),
    RETAIL("Retail"),
    INSURANCE("Insurance"),
    FINANCE("Finance"),
    OTHER("Other");

    private final String jobCategory;

    JobsCategories(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    @Override
    public String toString() {
        return "Vacancy category: " + jobCategory + " ";
    }
}