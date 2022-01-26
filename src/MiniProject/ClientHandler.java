package MiniProject;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread {
    private Socket socket;
    private ArrayList<Students> students;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public ClientHandler(Socket socket, ArrayList<Students> students) {
        this.socket = socket;
        this.students = students;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }

    public void run() {
        DBManager db = new DBManager();
        db.connect();
        System.out.println("ClientHandler is connected");
        try {
            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            PackageData data = null;
            while ((data = (PackageData) inStream.readObject()) != null) {
                if (data.getOperationType().equalsIgnoreCase("list")) {
//                    PackageData pd1 = new PackageData("list", (ArrayList<Students>) students.clone(), null);
//                    outputStream.writeObject(pd1);
                    System.out.println("listed");
                 //   db.getAllStudents();
                } else if (data.getOperationType().equalsIgnoreCase("add")) {
                    db.addStudents(data.getStudents());
                    System.out.println("added");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

