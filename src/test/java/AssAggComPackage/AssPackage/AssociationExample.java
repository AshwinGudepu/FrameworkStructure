package AssAggComPackage.AssPackage;

import java.util.ArrayList;
import java.util.List;

public class AssociationExample {

    public static void main(String[] args) {
        States state = new States();
        state.setStateName("California");

        Cities city = new Cities();
        city.setCityName("Los Angeles");
        Cities city2 = new Cities();
        city2.setCityName("San Diago");

        List<Cities> empList = new ArrayList<Cities>();
        empList.add(city);
        empList.add(city2);

        state.setState(empList);

        System.out.println(state.getCities()+" are cities in the state "+
                state.getStateName());
    }
}
