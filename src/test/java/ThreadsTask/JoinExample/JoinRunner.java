package ThreadsTask.JoinExample;

public class JoinRunner {
    public static void main(String[] args) throws InterruptedException {
        JoinThreads joinThreads=new JoinThreads();
        Thread t1=new Thread(joinThreads);
        Thread t2=new Thread(joinThreads);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        for (int k=0;k<5;k++) {
            Thread.sleep(300);
            System.out.println("Main Thread Execution");
        }
    }
}
