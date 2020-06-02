package stringExamples;

public class LCMNumbers {

    public static void main(String args[]){
        int number1=25;
        int number2=30;
        int GCD=1;
        int LCM=1;
        for(int i=1; i<=number1 && i<=number2 ;i++){
            if(number1%i==0 && number2%i==0){
                GCD=i;
            }
        }
        System.out.println("--------------"+GCD);

        LCM= (number1*number2)/GCD;
        System.out.println("Least Common Method----->" +LCM) ;

        int firstNumber=24;
        while(firstNumber!=0){
            System.out.println("..........................."+firstNumber/2);
            firstNumber=firstNumber/2;
        }
    }
}
