package ThreadsTask.ReentrantLockTest;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
    ReentrantLock reentrantLock=new ReentrantLock();
    public void display(String name){
        for(int i=0;i<10;i++){
            try{
                System.out.print("Good Morning");
                Thread.sleep(2000);
                System.out.println(name);
            }catch (Exception e){

            }
        }
    }
}
