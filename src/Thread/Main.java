package Thread;

public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation("Add Client to Bank", 4);
        System.out.println("Operation " + operation.getOperationName() + ": started");
        try {
            Thread t1 = new Thread(operation);
            t1.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
