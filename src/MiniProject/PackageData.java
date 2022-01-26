package MiniProject;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    private ArrayList<Students> students_list;
    private String operationType;
    Students students;

    public PackageData() {

    }

    public PackageData(String operationType, Students students) {
        this.operationType = operationType;
        this.students = students;
    }

    public ArrayList<Students> getStudents_list() {
        return students_list;
    }

    public void setStudents_list(ArrayList<Students> students_list) {
        this.students_list = students_list;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }
}
