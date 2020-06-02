package java8Tasks.Task1;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;

        /*Problem 1)
        Average Value (Java 8 java8Tasks.Lambdas and java8Tasks.Streams)
        .Write a method that returns the average of a list of integers. – 2 Marks
        public Double average(List<Integer> list) {
        }*/

public class AverageValue {

    public void beforeJavaEight(List<Integer> listOfValues) {
        int sum = 0;
        for (int i = 0; i < listOfValues.size(); i++) {
            sum = listOfValues.get(i) + sum;
        }
        System.out.println("Before Java 8 Average value-----" + sum / listOfValues.size());
    }

    public Double withJavaEight(List<Integer> listOfValues) {
        int sum = 0;
        OptionalDouble averageValue = listOfValues.stream().mapToInt(i -> i).average();
        return averageValue.getAsDouble();
    }

    public Double withIntSummaryStatistics(List<Integer> listOfValues) {
        int sum = 0;
        IntSummaryStatistics averageValue = listOfValues.stream().mapToInt(i -> i).summaryStatistics();
        return averageValue.getAverage();
    }

    public static void main(String args[]) {
        List<Integer> listOfValues = new ArrayList<>();
        listOfValues.add(10);
        listOfValues.add(30);
        listOfValues.add(20);
        listOfValues.add(40);

        AverageValue averageValue = new AverageValue();
        averageValue.beforeJavaEight(listOfValues);
        System.out.println("-------------------------------------");
        System.out.println("With Java 8------------------------" + averageValue.withJavaEight(listOfValues));
        System.out.println("-------------------------------------");
        System.out.println("With Java 8 IntSummaryStatistics--- " + averageValue.withJavaEight(listOfValues));
    }
}
