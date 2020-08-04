package ThreadsTask.YieldExample;

public class ConsumerTask extends Thread{
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Consumer Task : Item " + i);
            Thread.yield();
        }
    }
}
