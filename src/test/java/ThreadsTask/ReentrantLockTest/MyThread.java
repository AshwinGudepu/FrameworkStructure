package ThreadsTask.ReentrantLockTest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    static ReentrantLock reentrantLock = new ReentrantLock();

    public void run() {
        do {
            try {
                if (reentrantLock.tryLock(5000, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName() + ".........Got Lock");
                    Thread.sleep(30000);
                    reentrantLock.unlock();
                    System.out.println(Thread.currentThread().getName() + "......releases Lock");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + "....Unable to get lock and will try again");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } while (true);
    }
}
