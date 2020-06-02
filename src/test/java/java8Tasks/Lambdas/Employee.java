package java8Tasks.Lambdas;

public class Employee {

    public int salary;
    public String empName;

    public Employee(int salary, String empName) {
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
        return "Employee{" +
                "salary=" + salary +
                ", empName='" + empName + '\'' +
                '}';
    }
}
