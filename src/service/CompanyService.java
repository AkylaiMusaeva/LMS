package service;

import model.Company;

public interface CompanyService {
    //CRUD
    //Create-createCompany()
    String createCompany(Company...company);
    //Read-getAllCompanies(),getById()
    Company []getAllCompanies();
    Company getCompanyById(Long id);
    //Update
    Company updateCompany(Long oldCompanyId,Company newCompany);
    //D-delete
    Company []deleteCompany(Long id);

}
