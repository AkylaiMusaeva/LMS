package model;

public class Instructor {
    private Long id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private Group groups;
    public Instructor(){

    }

    public Instructor(Long id, String name, String surname, int age, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public Instructor(Long id, String name, String surname, int age, String email, Group groups) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.groups = groups;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Group getGroups() {
        return groups;
    }

    public void setGroups(Group groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "\nInstructor:" +
                "\nid:" + id +
                "\nname: " + name + '\'' +
                "\nsurname: " + surname + '\'' +
                "\nage: " + age +
                "\nemail: " + email + '\'' +
                "\ngroups: " + groups;
    }
}
