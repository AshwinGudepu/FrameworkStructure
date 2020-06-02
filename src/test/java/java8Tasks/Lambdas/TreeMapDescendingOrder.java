package java8Tasks.Lambdas;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDescendingOrder {
    /*10. Create a TreeMap that sorts the given set of employees in decending order of their name*/
    public static void main(String args[]){
        Map<String,Integer> detailsMap=new TreeMap<>((i1,i2)->(i2.compareTo(i1)));
        detailsMap.put("Hardware",1200);
        detailsMap.put("Software",2000);
        detailsMap.put("Politician",3000);
        detailsMap.put("Bank",2100);
        detailsMap.put("Shop",3400);
        System.out.println("Tree Map Descending Order"+detailsMap);
    }
}
