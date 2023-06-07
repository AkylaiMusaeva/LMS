package service;

import model.Company;
import model.Group;
import model.Instructor;

public interface InstructorService {
    Instructor[]saveInstructor(Long companyId,Instructor ... instructors);
    Instructor getInstructorById(Long instructorId,Instructor[]instructors);
    Instructor [] getAllInstructorsByCompanyId(Long companyId);
    Instructor updateInstructorByName(Long oldInstructorId, Instructor newInstructor);
    String deleteInstructorByCompanyId(Long companyId,Long InstructorId);



}
