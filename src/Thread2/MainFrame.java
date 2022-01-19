package Thread2;

import javax.swing.*;

public class MainFrame extends JFrame {
    public JButton button;
    public JLabel label;


    public MainFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(200,200);
        setSize(500,500);
        setLayout(null);

        label = new JLabel("FFF");
        label.setLocation(240,240);
        label.setSize(20,20);
        add(label);

        button = new JButton("Fire");
        button.setLocation(100,400);
        button.setSize(300,30);
        button.addActionListener(e->{
            Fire fire = new Fire();
            fire.start();
        });
        add(button);
    }

    public JLabel getLabel() {
        return label;
    }
}