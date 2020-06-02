package java8Tasks.Lambdas;

public class EmployeeDetails implements Comparable<EmployeeDetails>{
    public int salary;
    public String empName;

    public EmployeeDetails(int salary, String empName) {
        super();
        this.salary = salary;
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "salary=" + salary +
                ", empName='" + empName + '\'' +
                '}';
    }

    @Override
    public int compareTo(EmployeeDetails o) {
        return o.empName.compareTo(empName);
    }
}
