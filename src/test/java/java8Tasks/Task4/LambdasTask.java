package java8Tasks.Task4;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdasTask {

    public void ascendingOrder(List<String> ascedingOrder) {
        System.out.println("====ASCENDING ORDER=====");
        ascedingOrder.sort((str1,str2) -> Integer.compare(str1.length(),str2.length()));
        ascedingOrder.forEach(System.out::println);
    }

    public void descendingOrder(List<String> descendingOrder) {
        System.out.println("===DESCENDING ORDER===");
        descendingOrder.sort((str1,str2) -> Integer.compare(str2.length(),str1.length()));
        descendingOrder.forEach(System.out::println);
    }

    public void alphabeticalFirstCharacter(List<String> alphabeticalFirstCharacter) {
        System.out.println("===ALPHABETICAL FIRST CHARACTER====");
        alphabeticalFirstCharacter.sort((str1,str2) -> (str1.charAt(0)-str2.charAt(0)));
        alphabeticalFirstCharacter.forEach(System.out::println);
    }

    public void stringContainsECharacter(List<String> eCharacter) {
        System.out.println("===STRING CONTAINS E CHARACTER====");
        List<String> efilteredStrrings=eCharacter.stream().filter(strings->strings.contains("e")).sorted().collect(Collectors.toList());
        List<String> nonEFilteredStrings=eCharacter.stream().filter(strings->!strings.contains("e")).sorted().collect(Collectors.toList());
        Stream.concat(efilteredStrrings.stream(),nonEFilteredStrings.stream()).forEach(System.out::println);
    }

    public void staticHelperMethod(List<String> eCharacter) {
        System.out.println("==staticHelperMethod====");
        List<String> test=eCharacter.stream().filter(el->LambdasTask.predicate().test(el)).sorted().collect(Collectors.toList());
        List<String> nonFilter=eCharacter.stream().filter(el->!LambdasTask.predicate().test(el)).sorted().collect(Collectors.toList());
        Stream.concat(test.stream(),nonFilter.stream()).forEach(System.out::println);
    }

    public static Predicate<String> predicate()
    {
       return strings->strings.contains("e");
    }

    public static void main(String args[]) {
        List<String> stringsList = Arrays.asList("Zebra", "Auto", "Her", "Car", "Lorry");
        LambdasTask sorting = new LambdasTask();
       sorting.ascendingOrder(stringsList);
       sorting.descendingOrder(stringsList);
       sorting.alphabeticalFirstCharacter(stringsList);
       sorting.stringContainsECharacter(stringsList);
    }
}
