package ThreadsTask.JoinExample;

public class JoinThreads extends Thread{

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread-->"+Thread.currentThread().getId()+" "+"is running");
                Thread.sleep(300);
            }
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
