package ProgKiev.JavaOOP.MyCourseProject.Entity;

/**
 * Created by Олександр Шаповал on 26.10.2016.
 *
 * Курсовой проект
 */

public enum VacanciesCategory {
    IT("IT"),
    AUDIT("Audit"),
    RETAIL("Retail"),
    INSURANCE("Insurance"),
    FINANCE("Finance"),
    OTHER("Other");

    private final String vacanciesCategory;

    VacanciesCategory(String vacanciesCategory) {
        this.vacanciesCategory = vacanciesCategory;
    }

    public String getVacanciesCategory() {
        return vacanciesCategory;
    }

    @Override
    public String toString() {
        return "Vacancy category: " + vacanciesCategory + " ";
    }
}