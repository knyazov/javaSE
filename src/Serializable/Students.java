package Serializable;

import java.io.Serializable;
import java.util.ArrayList;

public class Students implements Serializable {
        protected String name;
        protected String surname;
        ArrayList subjects = new ArrayList();

        public Students(){

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

    public ArrayList getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList subjects) {
        this.subjects = subjects;
    }

    public Students(String name, String surname, ArrayList subjects) {
        this.name = name;
        this.surname = surname;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
