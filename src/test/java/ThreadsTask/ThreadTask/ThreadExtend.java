package ThreadsTask.ThreadTask;

import java.util.stream.IntStream;

public class ThreadExtend extends Thread{
    public void run(){
        IntStream.range(1,11).forEach(value->{
            System.out.println("Child Class Method"+Thread.currentThread().getId());
        });
    }
}
