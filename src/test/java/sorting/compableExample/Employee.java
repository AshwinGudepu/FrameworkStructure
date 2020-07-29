package sorting.compableExample;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;

    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public int compareTo(Employee o1) {
        if (this.id > o1.id){
            return 1;
        }else if (this.id < o1.id){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
