package java8Tasks.Lambdas;

import java.util.stream.IntStream;

public class RunnableInterfaceTask {

    public static void main(String args[]){
        Runnable runnable=()->{
            IntStream.range(1, 11).forEach(str->System.out.println("Child Thread"));
        };
        Thread thread=new Thread(runnable);
        thread.start();
        IntStream.range(1, 11).forEach(str->System.out.println("Main Thread"));
    }
}
