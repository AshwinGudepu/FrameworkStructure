package stringExamples;

import java.io.IOException;

public class ExceptionLearning {

    public void testException(int a)  {
        if(a==0){
            throw new ArrayIndexOutOfBoundsException("not valid");
        }
        else {
            System.out.println("--------------"+a);
        }
    }
    public  static void main(String [] args){
        ExceptionLearning exceptionLearning=new ExceptionLearning();
        exceptionLearning.testException(0);
    }
}
