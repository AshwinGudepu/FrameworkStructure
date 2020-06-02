package java8Tasks.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

        /*Problem 2)
        Comma Separated (Java 8 java8Tasks.Lambdas and java8Tasks.Streams)
        Write a method that returns a comma separated string based on a given list of integers.
        Each element should preceded by the letter 'e' if the number is even,
        and preceded by the letter 'o' if the number is odd.
        For example, if the input list is (3,44), the output should be 'o3,e44'.  – 2 Marks
        public String getString(List<Integer> list) {
        }*/

public class CommaSeparated {

    public String getEvenString(List<Integer> list) {
        String appendEtoEvenNumbers = "";
        List<Integer> evenNumbers = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        for (int i = 0; i < evenNumbers.size(); i++) {
            appendEtoEvenNumbers = appendEtoEvenNumbers + evenNumbers.get(i).toString() + "e" + "\n";
        }
        return appendEtoEvenNumbers;
    }

    public String getEvenOddString(List<Integer> list) {
        return list.stream().sorted().map(i -> i % 2 == 0 ? "e" + i : "o" + i).collect(joining(","));
    }

    public void beforeJavaEight(List<Integer> list) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }
        for (Integer evenNumbers : evenList) {
            System.out.println("EVEN Numbers ->" + evenNumbers);
        }
        for (Integer oddNumbers : oddList) {
            System.out.println("ODD Numbers ->" + oddNumbers);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(2, 17, 20, 18, 12, 3, 19);
        CommaSeparated commaSeparated = new CommaSeparated();
        commaSeparated.beforeJavaEight(numbersList);
        System.out.println("Even Numbers-->" + commaSeparated.getEvenString(numbersList));
        System.out.println("Even Odd Numbers-->" + commaSeparated.getEvenOddString(numbersList));
    }
}
