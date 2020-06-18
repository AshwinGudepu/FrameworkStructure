package ThreadsTask.ThreadTask;

import java.util.stream.IntStream;

public class ThreadRunner {
    public static void main(String [] args){
        ThreadExtend threadExtend=new ThreadExtend();
        threadExtend.start();
        IntStream.range(20,31).forEach(value->{
            System.out.println("Main Thread--->"+Thread.currentThread().getId());
        });
    }
}
