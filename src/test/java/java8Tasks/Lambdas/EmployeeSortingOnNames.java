package java8Tasks.Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortingOnNames{
    public static void main(String args[]){
        List<Employee> empDetails=new ArrayList<>();
        empDetails.add(new Employee(1200,"Hayden"));
        empDetails.add(new Employee(1300,"Dhoni"));
        empDetails.add(new Employee(200,"Sehwag"));
        empDetails.add(new Employee(2340,"Tendulkar"));
        empDetails.add(new Employee(1120,"A B D"));

        System.out.println("===Before Sorting==="+"\n");
        empDetails.forEach(System.out::println);

        System.out.println("===After Sorting==="+"\n");
        Collections.sort(empDetails,(i1,i2)->i1.getEmpName().compareTo(i2.getEmpName()));
        empDetails.forEach(System.out::println);
    }

}
