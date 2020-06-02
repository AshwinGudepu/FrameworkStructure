package java8Tasks.ConstructorReference;

public class Employee {

    public String name;
    public int account;
    public int salary;

    public Employee(String name, int account, int salary) {
        this.name = name;
        this.account = account;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", account=" + account +
                ", salary=" + salary +
                '}';
    }
}
