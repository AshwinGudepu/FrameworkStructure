package collections.usage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ArrayListTask {
    public static void main(String args[]){
        ArrayList<Integer> numberList=new ArrayList<>();
        numberList.add(12);
        numberList.add(3);
        numberList.add(10);
        numberList.add(9);
        numberList.add(13);

        //Verify list object is there or not
        if(numberList.contains(13)==true){
            System.out.println("List Object Present");
        }

        //Updating at position
        numberList.set(2,300);
        //for Each insertion order is not guarnteed,when used with Parallel Stream
        numberList.parallelStream().forEachOrdered(x->System.out.println("FOR EACH"+x));
        //for Each Ordered insertion order is guarnteed,when used with Parallel Stream
        numberList.parallelStream().forEachOrdered(x->System.out.println("FOR EACH ORDER"+x));

        Iterator itr=numberList.iterator();
         while(itr.hasNext()){
             System.out.println("------------"+itr.next());
         }

        System.out.println("\n"+"===ASCENDING ORDER===");
        numberList.stream().sorted((num1,num2)->num1.compareTo(num2)).forEach(x->System.out.println("ASCENDING ORDER"+x));

        System.out.println("\n"+"===DESCENDING ORDER with Comparator Logic===");
         Collections.sort(numberList,(i1,i2)->{
             if(i1<i2){
                 return 1;
             }else if(i1>i2) {
                 return -1;
             }else {
                 return 0;
             }
         });
         numberList.stream().forEach(x->System.out.println("FOR EACH DESCENDING ORDER"+x));
        // For each collection you need to delete the elements from the collection.
        System.out.println("Size before deleting-->"+numberList.size());

        //Removing the element with Streams
        numberList.removeIf(x->x.equals(13));
        numberList.stream().collect(Collectors.toList()).forEach(System.out::println);

        for(int i=0;i < numberList.size();i++){
            if(numberList.get(i)==300){
                numberList.remove(i);
            }
        }
        System.out.println("Size before deleting with Traditional For Loop-->"+numberList.size());
    }
}
