package ThreadsTask.RunnableTask;

import java.util.stream.IntStream;

public class RunnableRunner {
    public static void main(String args[]){
        RunnableImplementation runnableImplementation=new RunnableImplementation();
        Thread thread=new Thread(runnableImplementation);
        thread.start();
        Thread.currentThread().setName("Ashwin Test");
        IntStream.range(1,11).forEach(value-> System.out.println("Main Method Thread-->"+Thread.currentThread().getName()));
    }
}
