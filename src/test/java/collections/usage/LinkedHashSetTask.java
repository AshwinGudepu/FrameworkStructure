package collections.usage;

import java.util.*;

public class LinkedHashSetTask {

    public void updateDeleteRetrieve() {
        Set<Integer> updateDelRetrieve = new LinkedHashSet<>();
        updateDelRetrieve.add(4);
        updateDelRetrieve.add(3);
        updateDelRetrieve.add(5);
        updateDelRetrieve.add(2);
        updateDelRetrieve.add(4);

        System.out.println("----REMOVE-----");
        updateDelRetrieve.remove(4);
        updateDelRetrieve.forEach(System.out::println);

        Iterator itr=  updateDelRetrieve.iterator();
        while (itr.hasNext()){
            System.out.println("Iterate through Set-->"+itr.next());
            System.out.println("Remove elements in Set-->");
            itr.remove();
        }
        System.out.println("----Size of Set after Removing-----" + updateDelRetrieve.size());
    }
        public static void main(String args[]) {
        LinkedHashSet<Integer> linkHashSet = new LinkedHashSet<>();
        linkHashSet.add(300);
        linkHashSet.add(200);
        linkHashSet.add(400);
        linkHashSet.add(600);
        linkHashSet.add(250);

        System.out.println("Insertion Order Preserved" + linkHashSet);

        // convert LinkedHashSet to TreeSet
        Set<Integer> treeSet = new TreeSet<Integer>(linkHashSet);

        // Iterating using enhanced for-loop
        System.out.println("\n Ascending sorting-order:");
        for (Integer sortedAscNumbers : treeSet) {
            System.out.println("Sorted Numbers=>" + sortedAscNumbers);
        }

        Set<Integer> treeSetDesc = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return 1;
                } else if (o1 > o2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        treeSetDesc.addAll(linkHashSet);
        // Iterating using enhanced for-loop
        System.out.println("\n Descending sorting-order:");
        for (Integer sortedDescNumbers : treeSetDesc) {
            System.out.println("Sorted Numbers=>" + sortedDescNumbers);
        }

        LinkedHashSetTask linkedHashSetTask=new LinkedHashSetTask();
        linkedHashSetTask.updateDeleteRetrieve();

    }
}
