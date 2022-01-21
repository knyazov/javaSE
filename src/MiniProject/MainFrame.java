package MiniProject;

import javax.swing.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    protected MainMenu menu;
    protected AddStudent addStudent;
    protected ListStudent listStudent;
    DBManager db = new DBManager();
    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bitlab Application");
        setLayout(null);
        setSize(500,500);

        menu = new MainMenu();
        menu.setVisible(true);
        add(menu);

        addStudent = new AddStudent();
        addStudent.setVisible(false);
        add(addStudent);

        listStudent = new ListStudent();
        listStudent.setVisible(false);
        add(listStudent);
    }
    public void showMenu(){
        menu.setVisible(true);
        addStudent.setVisible(false);
        listStudent.setVisible(false);

    }

    public void showAddStudent(){
        menu.setVisible(false);
        addStudent.setVisible(true);
        listStudent.setVisible(false);
    }

    public void showlistStudent(){
        listStudent.setVisible(true);
        menu.setVisible(false);
        addStudent.setVisible(false);
    }

    public MainMenu getMainMenuPage() {
        return menu;
    }

    public AddStudent getFirstPage() {
        return addStudent;
    }

    public ListStudent getSecondPage() {
        return listStudent;
    }
}