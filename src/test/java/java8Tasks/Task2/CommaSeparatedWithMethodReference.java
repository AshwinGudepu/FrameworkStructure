package java8Tasks.Task2;

import java.util.Arrays;
import java.util.List;

public class CommaSeparatedWithMethodReference {

    public static boolean filterOddNumbers(int number) {
        return number % 2 != 0;
    }

    public static boolean filterEvenNumbers(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,12, 34, 25, 31, 82, 36,1);
        numbers.stream().sorted().filter(CommaSeparatedWithMethodReference::filterEvenNumbers).map(i->i+"e").forEach(System.out::println);
        numbers.stream().sorted().filter(CommaSeparatedWithMethodReference::filterOddNumbers).map(i->i+"o").forEach(System.out::println);
    }
}
