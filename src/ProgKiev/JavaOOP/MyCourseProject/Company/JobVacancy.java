package ProgKiev.JavaOOP.MyCourseProject.Company;

import ProgKiev.JavaOOP.MyCourseProject.Utils.IDGenerator;

/**
 * Created by andy and Олександр Шаповал on 22.10.2016.
 *
 * Курсовой проект
 */

public class JobVacancy {
    IDGenerator idGenerator = new IDGenerator();

    private long userId = idGenerator.generateID();
    private String vacancyName;
    private CategoryJobs categoryJobs;
    private String vacancyDescription;
    private int telephoneNumber;
    private String region;
    private int salary;

    public String getVacancyName() {
        return vacancyName;
    }

    public void setVacancyName(String vacancyName) {
        this.vacancyName = vacancyName;
    }

    public CategoryJobs getCategoryJobs() {
        return categoryJobs;
    }

    public void setCategoryJobs(CategoryJobs categoryJobs) {
        this.categoryJobs = categoryJobs;
    }

    public String getVacancyDescription() {
        return vacancyDescription;
    }

    public void setVacancyDescription(String vacancyDescription) {
        this.vacancyDescription = vacancyDescription;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "JobVacancy{" +
                "vacancyName='" + vacancyName + '\'' +
                ", categoryJobs=" + categoryJobs +
                ", vacancyDescription='" + vacancyDescription + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", region='" + region + '\'' +
                ", salary=" + salary +
                '}';
    }
}