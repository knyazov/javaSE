package Thsocket2;

import javax.swing.*;

public class MainFrame extends JFrame {
    protected MainMenu menu;
    protected FirstPage first;
    public MainFrame(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("APP");
        setLayout(null);

         menu = new MainMenu();
         menu.setVisible(false);
         add(menu);

         first = new FirstPage();
         first.setVisible(true);
         add(first);
    }

    public void showMainMenu(){
        menu.setVisible(true);
        first.setVisible(false);
    }

    public void showFirstPage(){
        menu.setVisible(false);
        first.setVisible(true);
    }
}
