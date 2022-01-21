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
        setSize(500, 500);
        setLayout(null);

        table = new JTable();
        table.setFont(new Font("Calibri", Font.PLAIN, 12));
        table.setRowHeight(30);

        //Создаем панель для прокрутки
        scrollPane = new JScrollPane(table);
        scrollPane.setSize(300, 200);
        scrollPane.setLocation(100, 200);
        add(scrollPane);
        ArrayList<Students> students = db.getAllStudents();


//        label = new JLabel("NAME: ");
//        label.setSize(70, 30);
//        label.setLocation(100, 100);
//        add(label);
//
//        label = new JLabel("SURNAME: ");
//        label.setSize(70, 30);
//        label.setLocation(200, 100);
//        add(label);
//
//
//        label = new JLabel("AGE: ");
//        label.setSize(70, 30);
//        label.setLocation(300, 100);
//        add(label);
//
//        area = new JTextArea();
//        area.setSize(300, 100);
//        area.setLocation(100, 200);
//        add(area);

        back = new JButton("BACK");
        back.setSize(100, 30);
        back.setLocation(100, 350);
        add(back);

        Students s = new Students();

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.mainFrame.showMenu();
            }
        });


//        try {
//            statement = connect.createStatement();
//            ResultSet rs = statement.executeQuery("SELECT * FROM `" + jComboBox2.getSelectedItem() + "`;");
//
//            // get columns info
//            ResultSetMetaData rsmd = rs.getMetaData();
//            int columnCount = rsmd.getColumnCount();
//
//            // for changing column and row model
//            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
//
//            // clear existing columns
//            tm.setColumnCount(0);
//
//            // add specified columns to table
//            for (int i = 1; i <= columnCount; i++ ) {
//                tm.addColumn(rsmd.getColumnName(i));
//            }
//
//            // clear existing rows
//            tm.setRowCount(0);
//
//            // add rows to table
//            while (rs.next()) {
//                String[] a = new String[columnCount];
//                for(int i = 0; i < columnCount; i++) {
//                    a[i] = rs.getString(i+1);
//                }
//                tm.addRow(a);
//            }
//            tm.fireTableDataChanged();
//
//            // Close ResultSet and Statement
//            rs.close();
//            statement.close();
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
//        }

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

