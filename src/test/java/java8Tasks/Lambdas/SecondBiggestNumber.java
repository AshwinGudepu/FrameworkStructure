package java8Tasks.Lambdas;

import java.util.*;

public class SecondBiggestNumber {

    public void secondMaxNumber() {
        //ascending order sorting
        int[] numbers = new int[]{2, 7, 4, 9};
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Hello" + numbers[numbers.length - 2]);
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static void main(String args[]) {
        List<Integer> numbersList = Arrays.asList(6, 7, 8, 4, 9, 0);
        int max = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            if (max < numbersList.get(i)) {
                max = numbersList.get(i);
            }
        }

        Optional<Integer> secondElement = numbersList.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst();
        System.out.println("Second Highest Number" + secondElement);
        SecondBiggestNumber secondBiggestNumber = new SecondBiggestNumber();
        secondBiggestNumber.secondMaxNumber();

    }
}
