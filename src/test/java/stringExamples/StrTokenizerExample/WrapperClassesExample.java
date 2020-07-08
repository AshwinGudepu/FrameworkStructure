package stringExamples.StrTokenizerExample;

import org.testng.annotations.Test;

public class WrapperClassesExample {

    @Test
    public void testWrapperClassesEqual(){
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        Integer i3=new Integer(30);

        if(i1.equals(i2)){
            System.out.println("Both are equals");
        }else {
            System.out.println("both are not equal");
        }

        if(i1==i2){
            System.out.println("References-Both are equals");
        }else {
            System.out.println("References- both are not equal");
        }

        int ii1=10;
        int ii2=10;

        if(ii1==ii2){
            System.out.println("Int-Both are equals");
        }else {
            System.out.println("Int- both are not equal");
        }
    }
}
