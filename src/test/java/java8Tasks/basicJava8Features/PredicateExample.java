package java8Tasks.basicJava8Features;

import org.testng.annotations.Test;
import org.testng.reporters.jq.INavigatorPanel;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateExample {

    @Test
    public void predicateExample() {
        //takes input arguement
        String word = "testing";
        Predicate<Integer> lengthOfString = i -> (i > 10);
        System.out.println(lengthOfString.test(word.length()));

        String text = "testing";
        Predicate<String> textIsSame = i -> (i.equals("testing"));
        System.out.println(textIsSame.test(text));
    }

    @Test
    //takes input and output arguement
    public void functionExample() {
        int num = 100;
        Function<Integer, String> functionTest = (x) -> {
            if (x > 10) {
                return "Give value is greater than X-->" + x;
            } else {
                return "Give value is less than X-->" + x;
            }
        };
        System.out.println("Function Name " + functionTest.apply(1000));
        System.out.println("Function Name " + functionTest.apply(9));

        //Example 2#
        Function<Integer, Integer> first = x -> (x * x);  //25
        Function<Integer, Integer> second = y -> (y + y); //50

        System.out.println("First execute First and the output Value apply on the Second-->" + first.andThen(second).apply(5));
        System.out.println("First execute Second and the output Value apply on the First-->" + first.compose(second).apply(25));
    }

    @Test
    public void supplierTest() {
        //It doesn't accept Input.

        String word = "test";
        Supplier<String> text = () -> {
            if (word.length() > 10) {
                return "Value is Greater";
            } else {
                return "Value is Lesser Than";
            }
        };
        System.out.println("Consumer Example-->" + text.get());
    }

    @Test
    public void consumerTest() {
        //It returns Void.That's why when place in sout, then we will get Error;

        String word = "test";
        Consumer<String> text = (s) -> System.out.println(s);
        System.out.println("Consumer Example-->");
        text.accept(word);

        String capital="TamilNadu";
        Consumer<String> lowerCase=s-> System.out.println(capital.toLowerCase());
        Consumer<String> upperCase=s-> System.out.println(capital.toUpperCase());
        lowerCase.andThen(upperCase).accept(capital);
    }
}
