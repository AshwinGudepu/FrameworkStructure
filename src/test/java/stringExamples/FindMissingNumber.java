package stringExamples;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String [] args){
        int n = 9;
        int[] numbers = {1, 2, 4, 9, 7, 8, 5, 6};
        int sum=0;
       for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
       }
       int totalSum= n*(n+1)/2;
        System.out.println("Missing Number---------------->" +(totalSum-sum));

        //Java8 way of writing
        System.out.println( Arrays.stream(numbers).sum());
    }
}
