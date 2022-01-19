package Thread;

public class Operation extends Thread{
    private String operationName;
    private int operationTime;
    public Operation(String operationName, int operationTime){
        this.operationName = operationName;
        this.operationTime = operationTime;
    }
    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public int getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(int operationTime) {
        this.operationTime = operationTime;
    }

    public void run(){
        try {
            for (int i = 1; i <= operationTime; i++) {
                System.out.println("Operation \" " + operationName +": " + i + " second");
                Thread.sleep(500);
            }
            System.out.println("Operation " + getOperationName() + ": finished");


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
