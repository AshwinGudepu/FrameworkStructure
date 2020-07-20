package collections.usage.TreeSetCompExample;
import collections.usage.TreeSetStringBufferComp;
import java.util.Set;
import java.util.TreeSet;

public class TreesetTask {

    public void updateDeleteRetrieve() {
        Set<Integer> updateDelRetrieve = new TreeSet<>();
        updateDelRetrieve.add(4);
        updateDelRetrieve.add(3);
        updateDelRetrieve.add(5);
        updateDelRetrieve.add(2);
        updateDelRetrieve.add(4);

        System.out.println("----REMOVE-----");
        System.out.println(updateDelRetrieve.removeIf(x->x.equals(5)));
    }

    public static void main(String args[]){
        Set<Integer> numbers=new TreeSet<>();
        //For empty set we can add Null,but after adding Null if trying to insert Values,it will throw null pointer exception
        //if we are depending on Natural Sorting order,compulsory the objects should be homogenous and should be comparable
        numbers.add(200);
        numbers.add(400);
        numbers.add(300);
        numbers.add(260);
        System.out.println("\n"+"Natural Sorting Order----"+numbers);

        //Decorator Design Pattern. Following line is the best example
        Set<Integer> sortDescOrder=new TreeSet<>(new TreesetComparator());
        sortDescOrder.add(5);
        sortDescOrder.add(9);
        sortDescOrder.add(4);
        sortDescOrder.add(10);
        sortDescOrder.add(3);
        sortDescOrder.add(3);
        System.out.println("\n"+"Natural Sorting Order----"+sortDescOrder);

        Set stringBuffer=new TreeSet(new TreeSetStringBufferComp());

        stringBuffer.add(new StringBuffer("ABCD"));
        stringBuffer.add(new StringBuffer("A"));
        stringBuffer.add(new StringBuffer("BC"));
        stringBuffer.add(new StringBuffer("A"));
        stringBuffer.add(new StringBuffer("DEF"));
        stringBuffer.add("Test");
        stringBuffer.add(123);
        System.out.println("\n"+"Sorting String Buffered"+stringBuffer);
    }

}
