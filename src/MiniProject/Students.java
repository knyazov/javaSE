package MiniProject;

import java.util.ArrayList;

public class Students {

    private Long id;
    private String name;
    private String surname;
    private int age;
    public Students() {
    }

    public Students(Long id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Students(String name, String surname, int age) {
        //this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;

//        Students s = new Students(this.name, this.surname, this.faculty, this.group);
//        list_students.add(s);
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

    public void setAll(String name, String surname, String faculty, String group){

    }
}
