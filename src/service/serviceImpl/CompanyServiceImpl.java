package service.serviceImpl;

import model.Company;
import service.CompanyService;

public class CompanyServiceImpl implements CompanyService {
    private Company[]companies;

    @Override
    public String createCompany(Company... company) {
        Company []companies1;
        if(companies==null){
            companies=company;
        }else {
            companies1=new Company[companies.length+ company.length];
            for (int i = 0; i < companies.length; i++) {
                companies1[i]=companies[i];
            }
            companies=companies1;
        }
        return "Company successfully saved";
    }

    @Override
    public Company[] getAllCompanies() {
        return companies;
    }

    @Override
    public Company getCompanyById(Long id) {
        for (int i = 0; i < companies.length; i++) {
            if(companies[i].getId()==id){
                return companies[i];
            }
        }
        return null;
    }

    @Override
    public Company updateCompany(Long oldCompanyId, Company newCompany) {
        Company oldCompany=getCompanyById(oldCompanyId);
        oldCompany.setName(newCompany.getName());
        oldCompany.setCountry(newCompany.getCountry());
        oldCompany.setAddress(newCompany.getAddress());
        oldCompany.setGroups(newCompany.getGroups());
        oldCompany.setInstructors(newCompany.getInstructors());
        oldCompany.setStudents(newCompany.getStudents());
        return oldCompany;
    }

    @Override
    public Company[] deleteCompany(Long id) {
        Company company=getCompanyById(id);
        for (int i = 0; i < companies.length; i++) {
            if(companies[i].equals(company)){
                companies[i]=null;
            }
        }
        return companies;
    }
}
