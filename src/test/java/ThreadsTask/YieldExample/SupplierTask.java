package ThreadsTask.YieldExample;

public class SupplierTask extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Supplier Task : Item " + i);
            Thread.yield();
        }
    }
}
