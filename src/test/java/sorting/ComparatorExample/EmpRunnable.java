package sorting.ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpRunnable  {
    public static void main(String [] args){
        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee(50,"Zebra"));
        emp.add(new Employee(30,"Ashwin"));
        emp.add(new Employee(10,"List"));
        emp.add(new Employee(20,"King"));
        emp.add(new Employee(10,"Computer"));
        Collections.sort(emp, new IdComparator());
        emp.forEach(x->System.out.println(x.id));



        Collections.sort(emp, new NameComparator());
        emp.forEach(x->System.out.println(x.name));
        System.out.println("----------------------------------------");
        Comparator<Employee> employeeNameComparator = Comparator.comparing(p -> p.name);

    }
}
