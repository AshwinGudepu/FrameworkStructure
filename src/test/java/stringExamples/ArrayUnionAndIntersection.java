package stringExamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class ArrayUnionAndIntersection {
    public static void main(String [] args){
        Integer[] firstArray = {9, 7, 6, 7, 1, 8};
        Integer[] secondArray = {5, 2, 6, 3, 4};
        Integer[] thirdArray = {4, 7, 5, 6};
        Set set = new HashSet<>();

        Stream.of(firstArray).forEach(array -> set.addAll(Arrays.asList(array)));
        Stream.of(secondArray).forEach(array -> set.addAll(Arrays.asList(array)));
        Stream.of(thirdArray).forEach(array -> set.addAll(Arrays.asList(array)));
        set.forEach(System.out::println);
        Arrays.stream(firstArray).count();
    }
}
