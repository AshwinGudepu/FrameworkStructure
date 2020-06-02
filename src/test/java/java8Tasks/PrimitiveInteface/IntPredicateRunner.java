package java8Tasks.PrimitiveInteface;

import java.util.function.IntPredicate;

public class IntPredicateRunner {

    public String numbers="";
    public void primeNumberRange() {
        for (int range = 1; range <= 10; range++) {
            int FLAG = 0;
            for (int j = 1; j <= range; j++) {
                if (range % j == 0) {
                    FLAG++;
                }
            }
            if (FLAG == 2) {
                numbers=numbers+range;
                System.out.println("PRIME NUMBER"+numbers);
            } else {
                numbers=numbers+range;
                System.out.println("NOT PRIME NUMBER"+numbers);
            }
        }
    }

    public static void main(String args[]) {
        int FLAG = 0;
        IntPredicate verifyPrimeNumber = number -> {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("Not Prime Number ->" + number);
                    return false;
                }
            }
            return true;
        };
        System.out.println(verifyPrimeNumber.test(7));//prime Number
        System.out.println(verifyPrimeNumber.test(6));//Not Prime Number
        System.out.println(verifyPrimeNumber.test(9));//Not Prime Number
        System.out.println(verifyPrimeNumber.test(11));//Prime Number

        IntPredicateRunner intPredicate = new IntPredicateRunner();
        intPredicate.primeNumberRange();
    }
}
