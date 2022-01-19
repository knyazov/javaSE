package GUIsecond;

import java.util.ArrayList;

public class Students {
    public static Students[] list_student;
    private int id;
    private String name;
    private String surname;
    private String faculty;
    private String group;
    public ArrayList<Students> list_students = new ArrayList<>();
    public Students() {
    }

    public Students(String name, String surname, String faculty, String group) {
        //this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.group = group;

//        Students s = new Students(this.name, this.surname, this.faculty, this.group);
//        list_students.add(s);
 }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAll(String name, String surname, String faculty, String group){

    }

    public void add_stud_list(Students students){
        list_students.add(students);
    }
}
