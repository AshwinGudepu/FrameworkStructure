package stringExamples;

public class ArmstrongNumber {
    public static void main(String [] args) {
    int number=153;   //1*1*1+5*5*5+3*3*3===1+125+27

        int reminder;
        int quotient;
        int sum=0;

        while(number!=0){
            reminder= number%10;
            sum=sum+reminder*reminder*reminder;
            quotient=number/10;
            number=quotient;
        }
        System.out.println("------------------"+sum);
    }
}
