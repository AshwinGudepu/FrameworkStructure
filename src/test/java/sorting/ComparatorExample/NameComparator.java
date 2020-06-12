package sorting.ComparatorExample;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.name.compareTo(o2.name)==0) {
            return o1.id-o2.id;
        }else{
            return o1.name.compareTo(o2.name);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
