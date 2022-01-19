package Thsocket2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends Container {

    public FirstPage(){
        setSize(500,500);

        setLayout(null);

        JLabel label1 = new JLabel("IP address: ");
        label1.setSize(300,30);
        label1.setLocation(30,100);
        add(label1);

        JTextField textField1 = new JTextField();
        textField1.setSize(300,30);
        textField1.setLocation(150, 100);
        add(textField1);

        JLabel label2 = new JLabel("PORT number: ");
        label2.setSize(300,30);
        label2.setLocation(30,200);
        add(label2);

        JTextField textField2 = new JTextField();
        textField2.setSize(300,30);
        textField2.setLocation(150, 200);
        add(textField2);

        JButton btn = new JButton("CONNECT");
        btn.setSize(300,30);
        btn.setLocation(150, 250);
        add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showMainMenu();
            }
        });
    }
}
