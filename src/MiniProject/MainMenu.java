package MiniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {



    protected JButton add_btn;
    protected JButton list_btn;
    protected JButton exitButton;

    public MainMenu(){
        DBManager db = new DBManager();
        db.connect();
        setSize(500,500);
        setLayout(null);
        add_btn = new JButton("ADD STUDENT");
        add_btn.setSize(250, 30);
        add_btn.setLocation(100, 100);

        list_btn = new JButton("LIST STUDENT");
        list_btn.setSize(250, 30);
        list_btn.setLocation(100, 150);

        exitButton = new JButton("EXIT");
        exitButton.setSize(250, 30);
        exitButton.setLocation(100, 200);

        add(add_btn);
        add(list_btn);
        add(exitButton);

        add_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.mainFrame.showAddStudent();
            }
        });

        list_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.mainFrame.showlistStudent();
                Main.mainFrame.getSecondPage().generateTable(db.getAllStudents());
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }


}
