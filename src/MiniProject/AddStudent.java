package MiniProject;

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

    public AddStudent() {
        DBManager db = new DBManager();
        db.connect();


        setSize(500, 500);
        setLayout(null);

        label = new JLabel("NAME: ");
        label.setSize(300, 30);
        label.setLocation(30, 100);
        add(label);

        label = new JLabel("SURNAME: ");
        label.setSize(300, 30);
        label.setLocation(30, 150);
        add(label);


        label = new JLabel("AGE: ");
        label.setSize(300, 30);
        label.setLocation(30, 200);
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
        tf3.setLocation(100, 200);
        add(tf3);


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
                students.setName(tf1.getText());
                students.setSurname(tf2.getText());
                students.setAge(Integer.parseInt(tf3.getText()));
                if (!tf1.equals("") && !tf2.equals("") && !tf3.equals("")) {
                    Students students1 = new Students(null, tf1.getText(),tf2.getText(),Integer.parseInt(tf3.getText()));
                    db.addStudents(students1);
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                }
            }
        });
    }
}