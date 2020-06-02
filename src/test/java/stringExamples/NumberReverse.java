package stringExamples;

public class NumberReverse {

    //Java program to reverse a given number

    public static void main(String [] args){
        int number=123;
        int reminder=0;
        int quotient=0;
        int sum=0;

        while(number!=0){
            reminder=number%10;
            sum=sum*10+reminder;
            quotient=number/10;
            number=quotient;
        }
        System.out.println("-----"+sum);
    }
}
