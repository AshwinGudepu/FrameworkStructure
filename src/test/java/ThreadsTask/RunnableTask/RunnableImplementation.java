package ThreadsTask.RunnableTask;

import sun.awt.windows.ThemeReader;

import java.util.stream.IntStream;

public class RunnableImplementation implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("Child Method-->");
        IntStream.range(1,11).forEach(value-> System.out.println("Child Class-->"+Thread.currentThread().getName()));
    }
}
