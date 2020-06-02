package java8Tasks.Lambdas;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TreeSetNumbers {

    /*7. Create a TreeSet that sorts the given set of numbers in reverse order*/
    public static void defaultOrder(Set<Integer> numbers) {
        // TreeSetNumbers.defaultOrder(numbers);
        System.out.println("Descending Order" + numbers + "\n");
    }

    public static void convertSetToStream(Set<Integer> numbers) {
        System.out.println("===Converted Set to Stream===");
        Stream<Integer> stream = numbers.stream();
        stream.sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void main(String args[]) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(15);
        numbers.add(15);

        TreeSetNumbers.defaultOrder(numbers);
        TreeSetNumbers.convertSetToStream(numbers);
        System.out.println("====Customized Sorting Order Using java8Tasks.Lambdas====");
        Set<Integer> sortingDesc = new TreeSet<>((o1, o2) -> o2.compareTo(o1));
        sortingDesc.add(10);
        sortingDesc.add(30);
        sortingDesc.add(20);
        sortingDesc.add(15);
        sortingDesc.add(15);
        sortingDesc.forEach(System.out::println);
    }
}
