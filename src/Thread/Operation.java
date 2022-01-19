package Thread;

public class Operation extends Thread{
    private String operationName;
    private int operationTime;

    public void run(){
        System.out.println("Operation \"Add Client to Bank\": " + getName() + " second");
    }
}
