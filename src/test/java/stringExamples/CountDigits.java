package stringExamples;

import org.testng.annotations.Test;

public class CountDigits {
    @Test
    public void test_CountDigits(){
        int number=201;
        int cntDigits=0;
        while(number!=0){
            int quotient=number/10;
            number=quotient;
            cntDigits=cntDigits+1;
        }
        System.out.println("-----------"+cntDigits);
    }
}
