package service.serviceImpl;

import model.Company;
import model.Group;
import model.Instructor;
import service.CompanyService;
import service.InstructorService;

public class InstructorServiceImpl implements InstructorService {
    private Instructor[]instructors;
    private Company[]companies;
    private CompanyServiceImpl companyService;
    private GroupServiceImpl groupService;
    public InstructorServiceImpl(CompanyServiceImpl companyService){
        this.companyService=companyService;
    }
    @Override
    public Instructor[] saveInstructor(Long companyId, Instructor... instructors) {
        Company company =companyService.getCompanyById(companyId);
        company.setInstructors(instructors);
        return company.getInstructors();
    }

    @Override
    public Instructor getInstructorById(Long instructorId, Instructor[] instructors) {
        for(int i=0;i<instructors.length;i++){
            if (instructorId == instructors[i].getId()) {
                System.out.println(instructors[i]);
            }
        }
        return null;
    }

    @Override
    public Instructor[] getAllInstructorsByCompanyId(Long companyId) {
        return companyService.getCompanyById(companyId).getInstructors();
    }

    @Override
    public Instructor updateInstructorByName(Long oldInstructorId, Instructor newInstructor) {
        Instructor oldInstructor=getInstructorById(oldInstructorId,instructors);
        oldInstructor.setName(newInstructor.getName());
        oldInstructor.setSurname(newInstructor.getSurname());
        oldInstructor.setAge(newInstructor.getAge());
        oldInstructor.setEmail(newInstructor.getEmail());
        oldInstructor.setGroups(newInstructor.getGroups());
        return oldInstructor;
    }

    @Override
    public String deleteInstructorByCompanyId(Long companyId, Long InstructorId) {
        return null;
    }
}
