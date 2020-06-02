package collections.Comparision;

import java.util.*;

public class ListSetMapComparision {

    public void compareHashSetAndTreeSet() {
        // Hashset performance Test – inserting 10M objects
        Set<Integer> numbers = new HashSet<Integer>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1E6; i++) {
            numbers.add(i);
        }
        long endTime = System.nanoTime();
        long hashSetTime = (endTime - startTime);
        System.out.println("\n"+"Total time to insert 10M elements in HashSet in sec : " + hashSetTime);

        // TreeSet performance Test – inserting 10M objects
        numbers = new TreeSet<Integer>();
        startTime = System.nanoTime();
        for (int i = 0; i < 1E6; i++) {
            numbers.add(i);
        }
        endTime = System.nanoTime();
        long treeSetTime = (endTime - startTime);

        System.out.println("Total time to insert 10M elements in TreeSet in sec : " + treeSetTime);

        if (hashSetTime < treeSetTime) {
            System.out.print("Hashset Performance in Better than TREESET");
        } else {
            System.out.print("TREESET Performance in Better than HASHSET");
        }
    }

    public void compareArrayListVsLinkedList() {
        List numbers = new ArrayList<Integer>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1E6; i++) {
            numbers.add(i);
        }
        long endTime = System.nanoTime();
        long arrayListTime = (endTime - startTime);
        System.out.println("\n"+"Total time to insert 10M elements in ArrayList in sec : " + arrayListTime);

        numbers = new LinkedList();
        startTime = System.nanoTime();
        for (int i = 0; i < 1E6; i++) {
            numbers.add(i);
        }
        endTime = System.nanoTime();
        long linkedListTime = (endTime - startTime);
        System.out.println("Total time to insert 10M elements in Linked List in sec : " + linkedListTime);
        if (arrayListTime < linkedListTime) {
            System.out.println("ArrayList Performance in Better than LinkedList");
        } else {
            System.out.println("LinkedList Performance in Better than ArrayList");
        }
    }

    public void compareHashMapAndTreeMap() {
        // HashMap performance Test – inserting 10M objects
        Map<Integer, Integer> numbers = new HashMap<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1E6; i++) {
            numbers.put(i, i);
        }
        long endTime = System.nanoTime();
        long hashMapTime = (endTime - startTime);
        System.out.println("\n"+"Total time to insert 10M elements in HashMap in sec : " + hashMapTime);

        // TreeSet performance Test – inserting 10M objects
        numbers = new TreeMap<>();
        startTime = System.nanoTime();
        for (int i = 0; i < 1E6; i++) {
            numbers.put(i, i);
        }
        endTime = System.nanoTime();
        long treeMapTime = (endTime - startTime);

        System.out.println("Total time to insert 10M elements in TREEMAP in sec : "
                + treeMapTime);

        if (hashMapTime < treeMapTime) {
            System.out.println("HASH MAP Performance in Better than TREE MAP");
        } else {
            System.out.println("TREE MAP Performance in Better than HASH MAP");
        }
    }

    public static void main(String args[]) {
        ListSetMapComparision comparision = new ListSetMapComparision();
        comparision.compareArrayListVsLinkedList();
        comparision.compareHashMapAndTreeMap();
        comparision.compareHashSetAndTreeSet();
    }

   /* Total time to insert 10M elements in ArrayList in sec : 31833700
    Total time to insert 10M elements in Linked List in sec : 187421800
    ArrayList Performance in Better than LinkedList

    Total time to insert 10M elements in HashMap in sec : 196553000
    Total time to insert 10M elements in TREEMAP in sec : 372120100
    HASH MAP Performance in Better than TREE MAP

    Total time to insert 10M elements in HashSet in sec : 426386100
    Total time to insert 10M elements in TreeSet in sec : 393256100
    TREESET Performance in Better than HASHSET*/
}
