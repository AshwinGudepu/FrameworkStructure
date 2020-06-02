package collections.usage;

import java.util.*;
import java.util.stream.Collectors;

public class LinkedHashMapTask {

    public void updateRetrieveDelete() {
        LinkedHashMap<Integer, String> updateRetrieveDel = new LinkedHashMap<>();
        updateRetrieveDel.put(3, "Dell");
        updateRetrieveDel.put(8, "HP");
        updateRetrieveDel.put(5, "Apple");
        updateRetrieveDel.put(4, "Sony");
        updateRetrieveDel.put(7, "Dell");
        updateRetrieveDel.forEach((value, key) -> System.out.print("\n" + key + " :" + value));
        //replace Key
        updateRetrieveDel.replace(7, "LinkedHashMap");
        updateRetrieveDel.forEach((value, key) -> System.out.print("\n" + key + " :" + value));
        //Delete Key
        updateRetrieveDel.remove(7);
        updateRetrieveDel.forEach((value, key) -> System.out.print("\n" + key + " :" + value));

        updateRetrieveDel.computeIfAbsent(8,x->"Bell");
    }

    //using computeif
    public void usingComputeIf() {
        Map<Integer, List<Employee>> employeeDetailsMap = new HashMap();
        List<Employee> empDetails=new ArrayList<>();

        List<Employee> emp1= Arrays.asList(new Employee("Test", 20, 120.0));
        List<Employee> emp2= Arrays.asList(new Employee("Developer", 210, 130.0));
        List<Employee> emp3= Arrays.asList(new Employee("Business Analyst", 320, 420.0));
        List<Employee> emp4= Arrays.asList(new Employee("Deborah Sprightly", 29, 9000.00));

      //  Employee emp5=new Employee("Deborah Sprightly", 29, 9000.00);
        employeeDetailsMap.put(100,emp1);
        employeeDetailsMap.put(300,emp2);
        employeeDetailsMap.put(240,emp3);
        employeeDetailsMap.put(240,emp4);
        employeeDetailsMap.computeIfAbsent(80,empList->new ArrayList<>())
                .add(new Employee("Automation",50,345.45));
        System.out.println("---Compute If Absent---");
        employeeDetailsMap.forEach((key,value)-> System.out.println(key+"----"+value));
    }

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Dell");
        linkedHashMap.put(8, "HP");
        linkedHashMap.put(5, "Apple");
        linkedHashMap.put(4, "Sony");
        linkedHashMap.put(7, "Dell");

        System.out.println("Linked Hashmap insertion order" + "\n" + linkedHashMap + "\n");

        Iterator<Map.Entry<Integer, String>> itr = linkedHashMap.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry entry = itr.next();
            System.out.println("Linked Hashmap key->" + entry.getKey());
            System.out.println("Linked Hashmap Value->" + entry.getValue());
        }

        System.out.println("\n Get Key and Value");
        Map<Integer, String> filteredMap = linkedHashMap.entrySet().stream().filter(ele -> ele.getValue() != "Dell").
                collect(Collectors.toMap(ele -> ele.getKey(), ele -> ele.getValue()));
        System.out.println("-------------" + filteredMap);

        System.out.println("\n Iterating using Iterator Interface");
        Iterator<Integer> keyIterator = linkedHashMap.keySet().iterator();
        while (keyIterator.hasNext()) {
            Integer key = keyIterator.next();
            System.out.println("ITERATOR");
            System.out.println("KEYS-->" + key + "-----" + linkedHashMap.get(key));
        }

        System.out.println("\n Descending Order on Values");
        Map<Integer, String> filteredLinkedHashMapValue = linkedHashMap.entrySet().stream().
                sorted((l1, l2) -> l2.getValue().compareTo(l1.getValue())).
                collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue(), (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("Filtered Map Descending Order on Values->" + filteredLinkedHashMapValue);

        System.out.println("\n Descending Order on Keys");
        Map<Integer, String> filteredLinkedHashMapKey = linkedHashMap.entrySet().stream().
                sorted((l1, l2) -> l2.getKey().compareTo(l1.getKey())).
                collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue(), (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("Filtered Map Descending Order Keys->" + filteredLinkedHashMapKey);

        LinkedHashMapTask linkedHashMapTask = new LinkedHashMapTask();
        linkedHashMapTask.updateRetrieveDelete();
        linkedHashMapTask.usingComputeIf();
    }
}
