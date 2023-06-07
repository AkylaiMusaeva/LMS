package model;

import java.util.Arrays;

public class Company {
    private Long id;
    private String name;
    private String country;
    private String address;
    private Group[]groups;
    private Instructor[]instructors;
    private Student[]students;
    public Company(){

    }

    public Company(String name, String country, String address) {
        this.name = name;
        this.country = country;
        this.address = address;
    }

    public Company(Long id, String name, String country, String address) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.address = address;
    }

    public Company(Long id, String name, String country, String address, Group[] groups, Instructor[] instructors, Student[] students) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.address = address;
        this.groups = groups;
        this.instructors = instructors;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "\nCompany:" +
                "\nid: " + id +
                "\nname: " + name  +
                "\ncountry: " + country  +
                "\naddress: " + address +
                "\ngroups: " + Arrays.toString(groups) +
                "\ninstructors: " + Arrays.toString(instructors) +
                "\nstudents: " + Arrays.toString(students)+
                "\n";
    }
}
