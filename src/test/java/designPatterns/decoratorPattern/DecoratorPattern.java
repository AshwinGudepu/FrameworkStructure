package designPatterns.decoratorPattern;

import java.util.Set;
import java.util.TreeSet;

public class DecoratorPattern {

    public static void main(String args[]){
        //Decorator Design Pattern. Following line is the best example
        //By default Treeset object will give default sorting, now we adding additional responsibility
        //to do in descending order.
        Set<Integer> sortDescOrder=new TreeSet<>((i1,i2)->i2.compareTo(i1));
        sortDescOrder.add(5);
        sortDescOrder.add(9);
        sortDescOrder.add(4);
        sortDescOrder.add(10);
        sortDescOrder.add(3);
        sortDescOrder.add(3);
        System.out.println("\n"+"Descending Sorting Order----"+sortDescOrder);

        //Another example for Decorator Pattern
        //FileInputStream fileStream = new FileInputStream(new File(fileName));
    }
}
