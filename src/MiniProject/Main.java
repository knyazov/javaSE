package MiniProject;
import java.net.Socket;
public class Main {
    public static MainFrame mainFrame;
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8696);
            mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}