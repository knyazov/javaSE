package MiniProject;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        DBManager db = new DBManager();
        try{
            ServerSocket server = new ServerSocket(8696);
            db.connect();
            System.out.println("WAITING FOR CLIENT");
            int index = 1;
            while (true){
                Socket socket = server.accept();
                System.out.println(index + " CLIENT IS CONNECTED");
                index++;
                ClientHandler ch = new ClientHandler(socket);
                ch.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
