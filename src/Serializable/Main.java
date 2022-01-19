package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void saveStudents(ArrayList students){
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("memory.dat"));
            outStream.writeObject(students);
            outStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList readStudents(){
        ArrayList students = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("memory.dat"));
            students = (ArrayList)inputStream.readObject();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Subject> subjects = new ArrayList<>();
        while (true) {
            System.out.println("[1] TO ADD STUDENT");
            System.out.println("[2] TO LIST STUDENT");
            System.out.println("[0] TO EXIT");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Surname: ");
                String surname = sc.next();
                System.out.println("[1] TO ADD SUBJECT");
                System.out.println("[0] GO TO MAIN MENU");
                int sub_choice = sc.nextInt();
                if (sub_choice == 1) {
                    System.out.println("Name:");
                    String name_subject = sc.next();
                    System.out.println("Credits: ");
                    int credits = sc.nextInt();
                    Subject subject = new Subject(name_subject, credits);
                    subjects.add(subject);
                    Students students = new Students(name, surname, subjects);
                    ArrayList students1 = readStudents();
                    students1.add(students);
                    saveStudents(students1);
                } else if (sub_choice == 0) {
                    continue;
                }
            } else if (choice == 2) {
                    ArrayList students = readStudents();
                for (int i = 0; i < students.size(); i++) {
                    System.out.println((i+1) + ")" + students.get(i).toString());
                }
            } else if (choice == 0) {
                System.exit(0);
            }
        }
    }
}

