package stringExamples;

public class FactorialOfNumber {

    public static void main(String args[]){
        int number=5;
        int factorial=1;
        for(int i=1;i<=5;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of a given Number-->" +factorial);
    }
}
