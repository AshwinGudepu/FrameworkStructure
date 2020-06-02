package java8Tasks.PrimitiveInteface;

import java.util.function.IntConsumer;

public class IntConsumerRunner {

    public static int squareNumber(int number){
        System.out.println("============"+number*number);
        return number * number;
    }

    public static void main(String args[]) {

        IntConsumer square= (num)-> System.out.println(num * num);
        square.accept(5);
        square.accept(6);

        IntConsumer squareMethodRed= IntConsumerRunner::squareNumber;
        squareMethodRed.accept(10);
    }
}
