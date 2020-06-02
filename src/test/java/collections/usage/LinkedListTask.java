package collections.usage;

import java.util.*;

public class LinkedListTask {

    public void usingPushPop(){
        LinkedList<Integer> usingPushPop=new LinkedList<>();
        usingPushPop.push(1);
        usingPushPop.push(2);
        usingPushPop.push(3);
        usingPushPop.push(4);

        System.out.println("====LinkedList====");
        usingPushPop.stream().forEach(System.out::println);

        //remove element from linkedlist
        System.out.println("====Remove Element from LinkedList===="+usingPushPop.pop());

        //retrieve element from linkedlist
        System.out.println("====Retrieve Element from LinkedList===="+usingPushPop.peek());

       //update element in LinkedList
        System.out.println("====Update Element in LinkedList===="+usingPushPop.set(2,30));
        usingPushPop.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        LinkedList<String> namesList = new LinkedList<>();
        namesList.add("Java");
        namesList.add("Selenium");
        namesList.add("TestNg");
        namesList.add("Junit");
        namesList.add("Cucumber");

        System.out.println("\n"+"Iterator Interface");
        Iterator itr = namesList.iterator();
        while (itr.hasNext()) {
            System.out.println("-->" + itr.next());
        }

        System.out.println("\n"+"For Each Loop");
        for (String printList : namesList) {
            System.out.println("-->" + printList);
        }

        System.out.println("\n"+"For Loop Traditional");
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println("-->" + namesList.get(i));
        }

        System.out.println("\n"+"==Overiding Comparartor Ascending Order Logic==");
        Collections.sort(namesList, (new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }));
        namesList.forEach(name->System.out.println("-->"+name));

        System.out.println("\n"+"==Overiding Comparartor Descending Order Logic==");
        Collections.sort(namesList, (new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        }));
        namesList.forEach(name->System.out.println("-->"+name));

        // Removing element from the List
        namesList.removeIf( x->x.equalsIgnoreCase("Cucumber"));
        System.out.println("Names List----------->" +namesList);

        //updating element to linkedList
        namesList.set(3,"Test Complete");
        System.out.println("Names List----------->" +namesList);

        LinkedListTask linkedListTask= new LinkedListTask();
        linkedListTask.usingPushPop();

        ListIterator listIterator=namesList.listIterator();
        while (listIterator.hasNext()){
            System.out.println("---LIST ITERATOR---");
            System.out.println("List Iterator--->" +listIterator.next());
        }
    }
}