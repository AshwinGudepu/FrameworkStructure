package collections.CollectionsRefactorCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Printer {

    public void printArray(Object[] objArr) {
        for (Object allValues : objArr) {
            System.out.println("Java 7 Print Objects->" + allValues);
        }
        System.out.println("\n====With Java 8====");
        Arrays.stream(objArr).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void main(String args[]) {
        Printer arr = new Printer();
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains:");
        arr.printArray(integerArray); // pass an Integer array
        System.out.println("\nArray doubleArray contains:");
        arr.printArray(doubleArray); // pass a Double array
        System.out.println("\nArray characterArray contains:");
        arr.printArray(characterArray); // pass a Character array
    }
}
