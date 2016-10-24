package ProgKiev.JavaOOP.MyCourseProject.Company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andy on 04.10.2016.
 *
 * Курсовой проект
 */

public class CompanyUtils {
    List<Company> companyList = new ArrayList<>();
    List<JobVacancy> jobVacancyList = new ArrayList<>();

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

    public List<JobVacancy> getJobVacancyList() {
        return jobVacancyList;
    }

    public void setJobVacancyList(List<JobVacancy> jobVacancyList) {
        this.jobVacancyList = jobVacancyList;
    }
}