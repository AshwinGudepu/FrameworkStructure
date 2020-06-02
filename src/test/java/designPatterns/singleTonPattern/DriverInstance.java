package designPatterns.singleTonPattern;

public class DriverInstance {

    private static DriverInstance driverInstance;

    private DriverInstance() {
        if(driverInstance != null) {
            throw new IllegalStateException("Singleton already initialized");
        }
    }

   static DriverInstance getDriver() {
        if (driverInstance == null) {
           synchronized(DriverInstance.class){
                driverInstance = new DriverInstance();
                return driverInstance;
            }
        }return driverInstance;
    }
}
