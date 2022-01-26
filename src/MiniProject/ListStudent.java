package MiniProject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

public class ListStudent extends Container {
    JTextArea area;
    JLabel label;
    JButton back;
    JTable jTable1;
    private String header[] = {"ID", "Name", "Surname", "Age"};
    private JTable table;
    private JScrollPane scrollPane;

    public ListStudent() {
        DBManager db = new DBManager();
        db.connect();
        System.out.println("ListStudent is connected");
        setSize(500, 500);
        setLayout(null);

        table = new JTable();
        table.setFont(new Font("Calibri", Font.PLAIN, 12));
        table.setRowHeight(30);

        scrollPane = new JScrollPane(table);
        scrollPane.setSize(300, 200);
        scrollPane.setLocation(100, 200);
        add(scrollPane);

        back = new JButton("BACK");
        back.setSize(100, 30);
        back.setLocation(100, 50);
        add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.mainFrame.showMenu();
            }
        });
    }

    public void generateTable(ArrayList<Students> students) {
        Object data[][] = new Object[students.size()][4];

        for (int i = 0; i < students.size(); i++) {
            data[i][0] = students.get(i).getId();
            data[i][1] = students.get(i).getName();
            data[i][2] = students.get(i).getSurname();
            data[i][3] = students.get(i).getAge();
        }

        DefaultTableModel model = new DefaultTableModel(data, header);
        table.setModel(model);

    }
}

