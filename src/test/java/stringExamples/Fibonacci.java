package stringExamples;

public class Fibonacci {
    public static void main(String [] args){
        int a=0;
        int b=0;
        int c=1;

        int number=0;

        while(number<10){
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
            number++;
        }
    }
}
