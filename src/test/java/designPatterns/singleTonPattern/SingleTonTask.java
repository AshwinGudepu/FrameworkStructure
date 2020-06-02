package designPatterns.singleTonPattern;

public class SingleTonTask {

    public static void main(String ars[]) {

        DriverInstance driverInstance=DriverInstance.getDriver();
        System.out.println("Driver Instance"+driverInstance);

        DriverInstance driverInstance1=DriverInstance.getDriver();
        System.out.println("Driver Instance"+driverInstance1);
    }
}
