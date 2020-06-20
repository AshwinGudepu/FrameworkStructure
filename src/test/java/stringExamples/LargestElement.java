package stringExamples;

import java.util.Arrays;

public class LargestElement {
    public static void main(String args[]){
        int arr[] = {10, 324, 45, 90, 9808};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Largest in given array is " +max);

        Arrays.sort(arr);
        System.out.println("Second largest Elemnt---->"+arr[arr.length-2]);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);    // 55
        int sum2 = Arrays.stream(numbers).reduce(0, Integer::sum);

    }
}
