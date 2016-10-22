package ProgKiev.JavaOOP.CourseProject.Company;

/**
 * Created by andy on 07.10.2016.
 *
 * Курсовой проект
 */

public enum CategoryJobs {
    IT("IT"),
    AUDIT("audit"),
    RETAIL("retail"),
    INSURANCE("Insurance"),
    FINANCE("finance"),
    OTHER("other");

    private final String categoryJob;

    CategoryJobs(String categoryJob) {
        this.categoryJob = categoryJob;
    }

    public String getCategoryJob() {
        return categoryJob;
    }

    @Override
    public String toString() {
        return "categoryJob='" + categoryJob;
    }
}