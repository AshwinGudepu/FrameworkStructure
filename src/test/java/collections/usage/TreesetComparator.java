package collections.usage;

import java.util.Comparator;

public class TreesetComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        if (i1 < i2) {
            return 1;
        } else if (i1 > i2) {
            return -1;
        } else {
            return 0;
        }
    }

    //The below is used for String comparision
/*    public int compare(Object o1, Object o2) {
        String s1=(String) o1;
        String s2=(String) o2;
        return s1.compareTo(s2);
        }
    }*/
}
