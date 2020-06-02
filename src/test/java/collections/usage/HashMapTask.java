package collections.usage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapTask {

    public void updateDeleteRetrieve(){
        HashMap<Integer,String> updateDelRetrieve=new HashMap<>();
        updateDelRetrieve.put(11,"Sachin");
        updateDelRetrieve.put(22,"Zaheer");
        updateDelRetrieve.put(33,"Yuvaj");
        updateDelRetrieve.put(44,"Bevan");

        String s="Testing";
        s.length();

        int [] a=new int[]{1,2,3,4,5};
        int aa=a.length;


        //Delete element from MAP
        updateDelRetrieve.values().removeIf(x->x.equalsIgnoreCase("Sachin"));
        updateDelRetrieve.forEach((key,value) -> System.out.println(key+" :"+value));

        //Set Value to MAP
        updateDelRetrieve.replace(44,"Update Value");
        updateDelRetrieve.forEach((key,value) -> System.out.println(key+" :"+value));

        //updating Key
        updateDelRetrieve.put(3333, updateDelRetrieve.get(33));
        updateDelRetrieve.remove(33);
        updateDelRetrieve.forEach((key,value) -> System.out.println(key+" :"+value));
    }

    public static void main(String []args){
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("one","Sachin");
        hashMap.put("Two","Zaheer");
        hashMap.put("Three","Yuvaj");
        hashMap.put("Four","Bevan");

        System.out.println("Insertion Order->"+hashMap);

        Iterator<Map.Entry<String,String>> itr=hashMap.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println("Key------"+itr.next().getKey());
            System.out.println("Value------"+itr.next().getValue());
        }

        System.out.println("\n"+"===HASHMAP using Java 8===");
        //iterating only keyset--Only KEYS
        System.out.println("\n"+"===Key set using Java 8===");
        hashMap.keySet().stream().forEach(System.out::println);

        //iterating only values--Only VALUES
        System.out.println("\n"+"===Values using Java 8===");
        hashMap.values().stream().forEach(System.out::println);

        //iterating complete Map--Both KEYS and VALUES
        System.out.println("\n"+"===Descending Order Iterating===");
        hashMap.entrySet().stream().sorted((i1,i2)->i2.getValue().compareTo(i1.getValue())).forEach(System.out::println);

        //filtering values from Map
        System.out.println("\n"+"===Filtering in Map===");
        Map<String, String> collect= hashMap.entrySet().stream()
                .filter(value->value.getKey()!="Two")
                .collect(Collectors.toMap(x->x.getKey(),x->x.getValue()));
        System.out.println("---------"+collect);

        for (Map.Entry<String,String > mapIterate: hashMap.entrySet()) {
            System.out.println("KEY->"+mapIterate.getKey()+"  "+"VALUE->"+mapIterate.getValue());
        }

        for (String keys:hashMap.keySet()){
            System.out.println("KEYS Set::"+keys);
        }

        for (String values:hashMap.values()){
            System.out.println("Values:: "+values);
        }

        Iterator<Map.Entry<String,String>> itrDelete=hashMap.entrySet().iterator();
        while (itrDelete.hasNext()){
            System.out.println("Key------"+itrDelete.next().getKey());
            System.out.println("Value------"+itrDelete.next().getValue());
        }

        HashMapTask hashMapTask=new HashMapTask();
        hashMapTask.updateDeleteRetrieve();
    }
}
