package Thsock2;

import GUIsecond.Main;
import GUIsecond.Students;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudent extends Container {
    JLabel label;
    JButton btn, back;
    JTextField tf1, tf2, tf3;
    JComboBox faculties_cbx;
    JTextArea area;
    String[] faculties = {"Engineering", "Medicine", "Economy", "IT"};

    public AddStudent() {
        setSize(500, 500);
        setLayout(null);

        label = new JLabel("Name: ");
        label.setSize(300, 30);
        label.setLocation(30, 100);
        add(label);

        label = new JLabel("Surname: ");
        label.setSize(300, 30);
        label.setLocation(30, 150);
        add(label);

        label = new JLabel("Faculty");
        label.setSize(300, 30);
        label.setLocation(30, 200);
        add(label);

        label = new JLabel("Group: ");
        label.setSize(300, 30);
        label.setLocation(30, 250);
        add(label);

        tf1 = new JTextField();
        tf1.setSize(300, 30);
        tf1.setLocation(100, 100);
        add(tf1);

        tf2 = new JTextField();
        tf2.setSize(300, 30);
        tf2.setLocation(100, 150);
        add(tf2);
        tf3 = new JTextField();
        tf3.setSize(300, 30);
        tf3.setLocation(100, 250);
        add(tf3);

        faculties_cbx = new JComboBox(faculties);
        faculties_cbx.setSize(300, 30);
        faculties_cbx.setLocation(100, 200);
        add(faculties_cbx);


        btn = new JButton("ADD CONTACT");
        btn.setSize(180, 30);
        btn.setLocation(100, 300);
        add(btn);

        back = new JButton("BACK");
        back.setSize(100, 30);
        back.setLocation(300, 300);
        add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.mainFrame.showMenu();
            }
        });
        int index = 0;
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Students students = new Students();
                String faculty = (String) faculties_cbx.getSelectedItem();
                students.setName(tf1.getName());
                students.setFaculty(faculty);
                students.setGroup(tf2.getName());
                students.setSurname(tf3.getName());
                if (!tf1.equals("") && !tf2.equals("") && !tf3.equals("")) {
//                    students = new Students(tf1.getName(), tf3.getName(), faculty, tf2.getName());
//                    students.add_stud_list(students);
                    Students.list_student[index] = new Students(tf1.getName(), tf3.getName(), faculty, tf2.getName());
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    faculties_cbx.setSelectedIndex(0);
                }
            }
        });
    }
}