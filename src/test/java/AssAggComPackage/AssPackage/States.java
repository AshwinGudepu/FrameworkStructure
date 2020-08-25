package AssAggComPackage.AssPackage;

import java.util.List;

public class States {
    private String stateName;

    List<Cities> citys;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public List<Cities> getCities() {
        return citys;
    }
    public void setState(List<Cities> citys) {
        this.citys = citys;
    }
}
