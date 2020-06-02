package java8Tasks.Lambdas;

import java.util.*;
import java.util.stream.Collectors;

public class TreeMapSorting {

    /*9. Create a TreeMap that sorts the given set of values in descending order*/
    public void treeMapInNaturalSortingOrder(Map<String, Integer> empInformation) {
        empInformation.forEach((name, number) -> System.out.println("Name--"+name +"<--->"+ "Number--"+number));
    }

    public void treeMapInDescendingSortingOrderOnKeys(Map<String, Integer> empInformation) {
        empInformation.entrySet().stream().sorted((i1,i2)->i2.getKey().compareTo(i1.getKey()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void treeMapInDescendingSortingOrderOnValues(Map<String, Integer> empInformation) {
        empInformation.entrySet().stream().sorted((i1,i2)->i2.getValue()-i1.getValue())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void main(String args[]) {
        Map<String, Integer> empInformation = new TreeMap<>();
        empInformation.put("Sachin", 1200);
        empInformation.put("Dravid", 1300);
        empInformation.put("Gavaskar", 900);
        empInformation.put("ABD", 1200);
        empInformation.put("Kohli", 1000);

        TreeMapSorting treeMapSorting = new TreeMapSorting();
        System.out.println("=====NATURAL SORTING ORDER======"+"\n");
        treeMapSorting.treeMapInNaturalSortingOrder(empInformation);
        System.out.println("=====DESCENDING ORDER ON KEYS======"+"\n");
        treeMapSorting.treeMapInDescendingSortingOrderOnKeys(empInformation);
        System.out.println("=====DESCENDING ORDER ON VALUES======"+"\n");
        treeMapSorting.treeMapInDescendingSortingOrderOnValues(empInformation);

    }
}
