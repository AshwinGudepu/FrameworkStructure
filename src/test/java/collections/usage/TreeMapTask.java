package collections.usage;

import java.util.*;
import java.util.stream.Collectors;

public class TreeMapTask {
    public void updateRetrieveDelete(){
        HashMap<Integer, String> updateDelRetrieve = new HashMap<>();
        updateDelRetrieve.put(3, "Sachin");
        updateDelRetrieve.put(5, "Zaheer");
        updateDelRetrieve.put(1, "Yuvaj");
        updateDelRetrieve.put(4, "Bevan");
        updateDelRetrieve.replace(3,"Pancard");

        Iterator<Map.Entry<Integer,String>> itr=updateDelRetrieve.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println("Elements in Map"+itr.next());
        }
        updateDelRetrieve.entrySet().removeIf(ele->ele.getValue().equals("Bevan"));
        updateDelRetrieve.entrySet().forEach(System.out::println);
    }

    public static void main(String args[]) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Sachin");
        hashMap.put(5, "Zaheer");
        hashMap.put(1, "Yuvaj");
        hashMap.put(4, "Bevan");

        System.out.println("Insertion Order" + hashMap + "\n");

        Map<Integer, String> sortedTreeMap =
                hashMap.entrySet().stream().sorted((l1, l2)->l2.getValue().compareTo(l1.getValue())).collect(Collectors.toMap(ele1 -> ele1.getKey(), ele1 -> ele1.getValue(),
                        (e1, e2) -> e1, TreeMap::new));
        System.out.println("TreeMap with ascending Order" + sortedTreeMap + "\n");

        TreeMap<Integer, String> treeMapWithString;
        treeMapWithString = new TreeMap<Integer, String>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = o1.toString();
                String s2 = o2.toString();
                return s2.compareTo(s1);
            }
        });
        treeMapWithString.putAll(hashMap);
        System.out.println("\n" + "Descending Order" + treeMapWithString);

        Iterator<Map.Entry<Integer, String>> itr = hashMap.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println("Iterator with Tree Map");
            System.out.println(itr.next());
            if (itr.next().getKey() == 5) {
                itr.remove();
            }
        }
        TreeMapTask treeMap=new TreeMapTask();
        treeMap.updateRetrieveDelete();
    }
}
