package collections.usage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;


public class HashsetTask {

    public void updateDeleteRetrieve(){
        Set<Integer> updateDelRetrieve=new HashSet<>();
        updateDelRetrieve.add(4);
        updateDelRetrieve.add(3);
        updateDelRetrieve.add(5);
        updateDelRetrieve.add(2);
        updateDelRetrieve.add(4);

        System.out.println("----REMOVE-----");
        updateDelRetrieve.remove(4);
        updateDelRetrieve.forEach(System.out::println);

        System.out.println("----update-----");

        //using anonymous inner class
        Set<String> animals=new HashSet<String>(){
            {
                add("Tiger");
                add("Lion");
                add("Leopard");
            }
        };
        Iterator<String> animalsIterator = animals.iterator();
        while (animalsIterator.hasNext()){
            System.out.println("------------"+animalsIterator.next());
        }

        //Java8 - Create From a Stream
        Set<String> hardWare = Stream.of("Hammer", "Nail","Ironbar")
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println("-------------------"+hardWare.stream().count());

        //update HashSet
       if(hardWare.remove("Hammer")) {
           hardWare.add("Plate");
       }
        System.out.println("--Update HashSet--");
        hardWare.forEach(System.out::println);
    }

    public static void main(String args[]){
        Set<Integer> setNumber=new HashSet<>();
        setNumber.add(4);
        setNumber.add(3);
        setNumber.add(5);
        setNumber.add(2);
        setNumber.add(4);

        System.out.println("Insertion order"+setNumber);

        System.out.println("\n"+"===Adding Tree Map===");
        setNumber.stream().sorted().collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);

        Iterator<Integer> setItr=setNumber.iterator();
        while (setItr.hasNext()){
            System.out.println("------"+setItr.next());
        }

        System.out.println("===FOR EACH===");
        for (Integer number: setNumber){
            System.out.println("Number-->"+number);
        }

        System.out.println("==Descending Order Sorted Set===");
        setNumber.stream().sorted((i1,i2)->i2.compareTo(i1)).forEachOrdered(System.out::println);

        Set<Integer> hset=new TreeSet<>(setNumber);
        System.out.println("Number=========="+hset+"\n");

        List<Integer> testHset=new ArrayList<>(setNumber);
        Collections.sort(testHset);
        testHset.forEach(System.out::println);

        HashsetTask hashsetTask=new HashsetTask();
        hashsetTask.updateDeleteRetrieve();
    }
}
