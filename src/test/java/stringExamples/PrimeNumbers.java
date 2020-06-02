package stringExamples;

public class PrimeNumbers {

    //Java program to find sum of prime numbers

    public static void main(String[] args) {

        int count = 0;
        int sum=0;

       for (int number = 1; number <= 5; number++) {
           int i = 1;
           count = 0;
            while (i <= number) {
                if (number % i == 0) {
                    count++;
                }
                i++;
            }
           if (count == 2) {
                sum=sum+number;
               System.out.println("*** PRIME NUMBER ***" + sum);
           } else {
               System.out.println("*** NOT PRIME NUMBER ***" + sum);
           }
        }
    }
}
