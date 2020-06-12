package sorting.ComparatorExample;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id-o2.id;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
