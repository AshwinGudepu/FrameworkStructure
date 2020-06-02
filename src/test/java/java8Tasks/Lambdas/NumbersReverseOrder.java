package java8Tasks.Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersReverseOrder {

    public static void sortNumbersInDescending(List<Integer> numbersList) {
        System.out.println("\n" + "==DESCENDING ORDER===");
        numbersList.sort((i1, i2) -> i2.compareTo(i1));
        numbersList.forEach(System.out::println);
    }

    public static void sortNumbersInAscending(List<Integer> numbersList) {
        System.out.println("\n" + "==ASCENDING ORDER===");
        numbersList.sort((i1, i2) -> i1.compareTo(i2));
        numbersList.forEach(System.out::println);
    }

    public static void sortingArraysUsingStreams(List<Integer> numbersList) {
        System.out.println("\n" + "==SORTING DESCENDING ORDER USING STREAMS===");
        numbersList.stream().sorted((i1, i2) -> i2.compareTo(i1)).forEach(System.out::println);
    }

    public static void sortingWithFunctionalInterface(List<Integer> numbersList) {
        System.out.println("==========WIP=============");
        System.out.println("\n"+"Functional Interface");
        Reveserable reveserable = (numbers) -> {
            numbers.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList()).forEach(System.out::println);

        };
    }
    /*5. Use Comparator inerface to sort given list of numbers in reverse order*/
    public static void main(String args[]) {
        List<Integer> numbersList = Arrays.asList(6, 1, 4, 9, 3);
        NumbersReverseOrder.sortNumbersInDescending(numbersList);
        NumbersReverseOrder.sortNumbersInAscending(numbersList);
        NumbersReverseOrder.sortingArraysUsingStreams(numbersList);
        NumbersReverseOrder.sortingWithFunctionalInterface(numbersList);
    }

}
