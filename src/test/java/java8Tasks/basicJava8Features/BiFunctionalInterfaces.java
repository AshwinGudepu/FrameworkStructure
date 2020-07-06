package java8Tasks.basicJava8Features;

import org.testng.annotations.Test;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionalInterfaces {

    @Test
    public void biFunctionalInterfaceExample(){
        int numberOne=100;
        int numberTwo=20;
        BiFunction<Integer,Integer,Integer> biFunc=(x,y)-> {
            if ((x % 2 == 0) && (y % 3 == 0)) {
                return 999;
            }
            return 1;
        };
        System.out.println("Bi Function Test--->"+ biFunc.apply(6,27));
        System.out.println("Bi Function Test--->"+ biFunc.apply(9,27));
    }

    @Test
    public void biPredicateInterfaceExample(){
        String wordOne="Testing";
        String wordTwo="Interface";
        BiPredicate<Integer,Integer> biWord=(x,y)-> {
            if (x > y) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println("BiPredicate-->"+biWord.test(wordOne.length(),wordTwo.length()));

        //Example#2
        BiPredicate<Integer,Integer> number=(a,b)->(a+b)%2==0;
        System.out.println("Bipredicate================>"+number.test(10,20));

    }

    @Test
    public void biSupplierInterfaceExample(){
        //Bi-supplier will not exist
    }

    @Test
    public void biConsumerInterfaceExample(){
        String word="testing";
        String wordTwo="Hello";
        BiConsumer<String,String> testWordsLen=(x,y)-> {System.out.println("First Name-->"+word);
            System.out.println("Second Name-->"+wordTwo);
        };
        testWordsLen.accept(word,wordTwo);
    }
}
