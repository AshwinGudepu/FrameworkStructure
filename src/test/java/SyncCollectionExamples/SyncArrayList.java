package SyncCollectionExamples;

import org.testng.annotations.Test;

import java.util.*;

public class SyncArrayList {

    @Test
    public void test_syncArrayList(){
        List<Integer> integerList=new ArrayList<>();
        integerList.add(10);
        integerList.add(30);
        integerList.add(60);
        integerList.add(80);
        integerList.add(20);
        List<Integer> synchronizedList= Collections.synchronizedList(integerList);
        synchronizedList.forEach(System.out::println);
    }

    @Test
    public void test_syncHashMap(){
        Map<String,Integer> nameId=new HashMap<>();
        nameId.put("Ashwin",50);
        nameId.put("keyboard",90);
        nameId.put("Peripheral",150);
        nameId.put("Computer",20);
        Map<String,Integer> syncMap=Collections.synchronizedMap(nameId);
    }

    @Test
    public void test_syncSet(){
        Set<String> name=new HashSet<>();
        name.add("Ashwin");
        name.add("keyboard");
        name.add("Peripheral");
        name.add("Computer");
        Set<String> synSet=Collections.synchronizedSet(name);
    }

    @Test
    public void test_syncLinkedList(){
        List<Integer> syncLinkedList=new LinkedList<>();
        syncLinkedList.add(90);
        syncLinkedList.add(30);
        syncLinkedList.add(80);
        syncLinkedList.add(40);
    }
}
