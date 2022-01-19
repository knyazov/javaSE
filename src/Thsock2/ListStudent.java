package Thsock2;

import GUIsecond.Main;
import GUIsecond.Students;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListStudent extends Container {
    JTextArea area;
    public ListStudent(){
        setSize(500,500);
        setLayout(null);

        area = new JTextArea();
        area.setSize(300, 100);
        area.setLocation(100, 100);
        add(area);

        JButton back = new JButton("BACK");
        back.setSize(100, 30);
        back.setLocation(100,250);
        add(back);

        Students s = new Students();

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.mainFrame.showMenu();
            }
        });
    }
}
