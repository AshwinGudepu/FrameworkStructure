package beanInitDestroy;

public class Hello {
    public void helloInit(){
        System.out.println("Say Hello from Init Class");
    }

    public void helloDestroy(){
        System.out.println("Say Hello Destroyed from Hello Class");
    }
}
