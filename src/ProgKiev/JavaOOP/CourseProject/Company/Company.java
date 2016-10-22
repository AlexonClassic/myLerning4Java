package ProgKiev.JavaOOP.CourseProject.Company;

import ProgKiev.JavaOOP.CourseProject.Utils.IDGenerator;

/**
 * Created by andy on 01.10.2016.
 *
 * Курсовой проект
 */

public class Company {
    IDGenerator idGenerator = new IDGenerator();

    private int id;
    private String name;
    private String region;
    private String overview;
    private String companyAgent;
    private String email;
    private JobVacancy jobVacancy;

    public Company() {
        id = idGenerator.generateID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getCompanyAgent() {
        return companyAgent;
    }

    public void setCompanyAgent(String companyAgent) {
        this.companyAgent = companyAgent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public JobVacancy getJobVacancy() {
        return jobVacancy;
    }

    public void setJobVacancy(JobVacancy jobVacancy) {
        this.jobVacancy = jobVacancy;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", overview='" + overview + '\'' +
                ", companyAgent='" + companyAgent + '\'' +
                ", email='" + email + '\'' +
                ", jobVacancy=" + jobVacancy +
                '}';
    }
}