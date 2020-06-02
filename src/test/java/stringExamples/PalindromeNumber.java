package stringExamples;

public class PalindromeNumber {

    public static void main(String args[]){
        int number=121;
        int sum=0;

        while(number!=0){
            int reminder=number%10;
            sum = sum*10+reminder;
            int quotient=number/10;
            number=quotient;
        }
        System.out.println("-----------"+sum);
    }
}
