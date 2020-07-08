package AbstractClassExample;

public class AbstractRunner extends AbstractClassTest{

    public AbstractRunner(int i, int j) {
        super(i, j);
    }

    public static void main(String[] args) {
        AbstractClassTest abstractClassTest=new AbstractRunner(10,20);
    }

    @Override
    public void absM1() {

    }

    @Override
    protected void absM2() {

    }

    @Override
    void absM3() {

    }
}
