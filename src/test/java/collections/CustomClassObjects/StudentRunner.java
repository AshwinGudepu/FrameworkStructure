package collections.CustomClassObjects;

import java.util.HashMap;
import java.util.Map;

public class StudentRunner {

    public static void main(String [] args){
        Map<Student,Integer> map=new HashMap<>();
        map.put(new Student("Java",20,120),101);
        map.put(new Student("Java",20,200),102);
        map.put(new Student("Junit",15,130),140);
        map.put(new Student("Cucumber",23,150),145);
        map.put(new Student("JBehave",25,160),150);
        map.put(new Student("Cucumber",23,150),190);

        System.out.println("--------"+map.size());

    for(Map.Entry<Student,Integer> studMap:map.entrySet()){
        System.out.println("-----------"+studMap.getKey()+"<------->"+studMap.getValue());

        }
    }
}
