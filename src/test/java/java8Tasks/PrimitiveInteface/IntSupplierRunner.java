package PrimitiveInteface;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class IntSupplierRunner {

    public static int getRandomNumberInts(int min, int max){
        Random random = new Random();
        return random.ints(min,(max+1)).findFirst().getAsInt();
    }

    public static void main(String args[]) {
        IntSupplierRunner intSupplierRunner=new IntSupplierRunner();

        IntSupplier random= () -> getRandomNumberInts(1,3000);
        System.out.println(random.getAsInt());

        Supplier<Integer> randomSupplier= () -> getRandomNumberInts(1,3000);
        System.out.println(randomSupplier.get());

        System.out.print("==IntStream Generate==="+"\n");
        IntStream stream = IntStream.generate(()
                -> { return (int)(Math.random() * 10000); });
        stream.limit(2).forEach(System.out::println);
    }
}
