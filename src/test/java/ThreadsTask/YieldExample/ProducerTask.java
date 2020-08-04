package ThreadsTask.YieldExample;

public class ProducerTask extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Producer Task: Item " + i);
            Thread.yield();
        }
    }
}
