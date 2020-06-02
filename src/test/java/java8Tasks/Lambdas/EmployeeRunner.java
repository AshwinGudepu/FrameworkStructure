package java8Tasks.Lambdas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*6. Use Comparator inerface to sort given list of Employees in the alphabetic order of their name*/
public class EmployeeRunner {
    public static void main(String args[]) {
        Employee emp1 = new Employee(2000, "John");
        Employee emp2 = new Employee(1400, "Daniel");
        Employee emp3 = new Employee(3400, "Sachin");

        List<Employee> employeeList = Arrays.asList(emp1, emp2, emp3);
        employeeList.stream().sorted((i1, i2) -> i1.getEmpName().compareTo(i2.getEmpName())).
                collect(Collectors.toList()).forEach(System.out::println);

        /*8. Create a TreeSet that sorts the given set of Employees in the alphabetic order of their name*/
        /*Overriding defaulting Sorting Implementation*/
        Set<EmployeeDetails> sortSet = new TreeSet<EmployeeDetails>();
        EmployeeDetails employeeDetails1 = new EmployeeDetails(2000, "John");
        EmployeeDetails employeeDetails2 = new EmployeeDetails(1400, "Daniel");
        EmployeeDetails employeeDetails3 = new EmployeeDetails(3400, "Sachin");

        sortSet.add(employeeDetails1);
        sortSet.add(employeeDetails2);
        sortSet.add(employeeDetails3);

        for (EmployeeDetails employeeDetails : sortSet) {
            System.out.println("Emp Name--------->" + employeeDetails.getEmpName());
            System.out.println("Emp Salary------->" + employeeDetails.getSalary());
        }
    }
}
