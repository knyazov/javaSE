package Thread2;


public class Fire extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int x_ace = (int) (Math.random() * 100) - 20;
                int y_ace = (int) (Math.random() * 100) - 20;
                Main.mainFrame.label.setLocation(x_ace, y_ace);
                Thread.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

