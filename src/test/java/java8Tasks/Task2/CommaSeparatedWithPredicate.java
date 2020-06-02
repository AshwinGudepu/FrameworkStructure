package java8Tasks.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CommaSeparatedWithPredicate {

    public void getEvenNumbers(List<Integer> numberList, Predicate<Integer> evenNumbers) {
        System.out.println("----------" + numberList.stream().filter(evenNumbers).map(i -> i + "e").collect(Collectors.toList()));
    }

    public void getOddNumbers(List<Integer> numberList, Predicate<Integer> oddNumbers) {
        numberList.stream().filter(oddNumbers).map(i -> i + "o").forEach(System.out::println);
    }

    public static void main(String[] args) {

        Predicate<Integer> evenNumbers = i -> i % 2 == 0;
        Predicate<Integer> oddNumbers = i -> i % 2 != 0;

        CommaSeparatedWithPredicate commaSeparatedWithPredicate = new CommaSeparatedWithPredicate();

        commaSeparatedWithPredicate.getEvenNumbers(Arrays.asList(23, 12, 13, 20), evenNumbers);
        commaSeparatedWithPredicate.getOddNumbers(Arrays.asList(23, 12, 13, 20), oddNumbers);

        commaSeparatedWithPredicate.getEvenNumbers(Arrays.asList(21, 4, 1, 3, 6), evenNumbers);
        commaSeparatedWithPredicate.getOddNumbers(Arrays.asList(21, 4, 1, 3, 6), oddNumbers);

    }
}
