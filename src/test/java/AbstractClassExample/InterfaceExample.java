package AbstractClassExample;

public interface InterfaceExample {

    public void testMethod1();

    public static void testMethod2(){
        System.out.println("interface static method");
    }

    public default void testMethod3(){
        System.out.println("Interface Default Method");
    }
}
