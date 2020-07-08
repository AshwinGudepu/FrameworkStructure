package AbstractClassExample;

public abstract class AbstractClassTest implements InterfaceExample{

    public AbstractClassTest(int i,int j){
        System.out.println("Testing Constructor"+i);
        System.out.println("Testing Constructor"+j);
    }

    public int i;
    private String name;
    boolean testing;
    protected  Integer prot=new Integer(10);

    public void m1(){
        System.out.println("Abstract Methods");
    }

    private void m2(){
        System.out.println("Private Methods");
    }

    protected void m3(){
        System.out.println("protected Methods");
    }

    void m4(){
        System.out.println("default Methods");
    }

    public abstract void absM1();
    protected abstract void absM2();
    abstract void absM3();

    static {
        System.out.println("First Static block will be Called.....");
    }

    {
        System.out.println("Second normal block will be called.....");
    }
}

