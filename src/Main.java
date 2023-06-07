import model.Company;
import model.Group;
import model.Instructor;
import service.CompanyService;
import service.InstructorService;
import service.serviceImpl.CompanyServiceImpl;
import service.serviceImpl.GroupServiceImpl;
import service.serviceImpl.InstructorServiceImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        CompanyServiceImpl companyService=new CompanyServiceImpl();
        Company company1=new Company(1L, "Peaksoft", "KG", "Grajdanskaya 119");
        Company company2=new Company(2L,"Codify","KG","Moskovskaya 12");
        Company company3=new Company(3L,"Attractor","KG","Ahunbaeva 12");
        Company[]companies={company1,company2,company3};

        GroupServiceImpl groupService=new GroupServiceImpl(companyService);
        Group group1=new Group(1L, "Java-10", LocalDate.of(2023, 4, 3));
        Group group2=new Group(2L, "Java-9", LocalDate.of(2023, 1, 3));
        Group group3=new Group(3L, "Java-8", LocalDate.of(2022, 10, 3));
        Group group4=new Group(4L, "Java-7", LocalDate.of(2022, 7, 3));
        Group group5=new Group(5L, "Java-6", LocalDate.of(2022, 4, 3));

        InstructorServiceImpl instructorService=new InstructorServiceImpl(companyService);
        Instructor instructor1=new Instructor(1L,"Aigerim","Kubanychbekova",41,"aigerim@gmail.com");
        Instructor instructor2=new Instructor(2L,"Asel","Temirova",26,"aselya@gmail.com");
        Instructor instructor3=new Instructor(3L,"Myrzagul","Azizbekova",22,"azizbekova@gmail.com");
        Instructor instructor4=new Instructor(4L,"Jibek","Asanova",36,"jibeek@gmail.com");
        Instructor instructor5=new Instructor(5L,"Gulzat","Tolonbaeva",28,"gulzatt@gmail.com");


        while(true) {
            switch (num = scanner.nextInt()) {

                case 1:
                    System.out.println("~~~~~~~~~Create new company~~~~~~~");
                    System.out.println(companyService.createCompany(company1,company2,company3));
                    break;
                case 2:
                    System.out.println("~~~~~~~~~Get all companies~~~~~~~");
                    System.out.println(Arrays.toString(companyService.getAllCompanies()));
                    break;
                case 3:
                    System.out.println("~~~~~~~~~Get company by ID~~~~~~~~~~");
                    System.out.println(companyService.getCompanyById(3L));
                    break;
                case 4:
                    System.out.println("~~~~~~~~~~~Update Company~~~~~~~~~~~");
                    System.out.println(companyService.updateCompany(1L, new Company("Makers", "KG", "Manas 54")));
                    break;
                case 5:
                    System.out.println("~~~~~~~~Delete company by ID~~~~~~~~~~~~~");
                    System.out.println(Arrays.toString(companyService.deleteCompany(2L)));
                    break;
                case 6:
                    System.out.println("~~~~~~~~~Create and save new group~~~~~~~");
                    System.out.println(Arrays.toString(groupService.saveGroup(1L, group1,group2)));
                    System.out.println(Arrays.toString(companyService.getAllCompanies()));//Проверка получения всех компаний после добавления группы
                    break;
                case 7:
                    System.out.println("~~~~~~~~~Get group by ID~~~~~~~~~~");
                    Group[]groups={group1,group2,group3,group4,group5};
                    System.out.println(groupService.getById(5L,groups ));//get a group info by its ID
                    break;
                case 8:
                    System.out.println("~~~~~~~~~Get all groups by company ID~~~~~~~~~~");
                    System.out.println(Arrays.toString(groupService.getAllGroupsByCompanyId(1L)));
                    break;
                case 9:
                    System.out.println("~~~~~~~~~~~Update Group By Name~~~~~~~~~~~");
                    System.out.println(groupService.updateGroupByName("Java Script-10", group1));
                    break;
                case 10:
                    System.out.println("~~~~~~~~~~~~~~~~Delete Group By CompanyId~~~~~~~~~~~~~~~~~~");
                    System.out.println((groupService.deleteGroupByCompanyId(1L, 1L)));
                    break;
                case 11:
                    System.out.println("~~~~~~~~~Create and save new instructor~~~~~~~");
                    System.out.println(Arrays.toString(instructorService.saveInstructor(1L, instructor2)));
                    System.out.println(Arrays.toString(companyService.getAllCompanies()));
                    break;
                case 12:
                    System.out.println("~~~~~~~~~Get instructor by its ID~~~~~~~~~~");
                    Instructor []instructors={instructor1,instructor2,instructor3,instructor4,instructor5};
                    instructorService.getInstructorById(4L,instructors);
                    break;
                case 13:
                    System.out.println("~~~~~~~~~Get all instructors by company ID~~~~~~~~~~");
                    System.out.println(Arrays.toString(instructorService.getAllInstructorsByCompanyId(1L)));
                    break;
                case 14:
                    System.out.println("~~~~~~~~~~~Update Instructor By Name~~~~~~~~~~~");
                    instructorService.updateInstructorByName(1L,new Instructor(1L,"Marat","Makeshev",46,"marat@gmail.com"));
                    break;
                case 15:
                    System.out.println("~~~~~~~~Delete Instructor By CompanyId~~~~~~");





            }
        }
    }

}