package Thsocket2;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends Container {
    protected JButton first;
    protected JButton second;

    public MainMenu(){
        setSize(500,500);
        setLayout(null);

        JLabel label1 = new JLabel("MESSAGE: ");
        label1.setSize(300,30);
        label1.setLocation(30,100);
        add(label1);

        first = new JButton("first page");
        first.setSize(300,30);
        first.setLocation(100,150);
        add(first);
    }
}
