package designPatterns.factoryPattern;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

import java.io.File;

public class InternetExplorerDriverManager extends DriverManager {

    private InternetExplorerDriverService ieService;

    @Override
    public void startService() {
        if (null == ieService) {
            try {
                ieService = new InternetExplorerDriverService.Builder()
                        .usingDriverExecutable(new File("chromedriver.exe"))
                        .usingAnyFreePort()
                        .build();
                ieService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void stopService() {
        if (null != ieService && ieService.isRunning())
            ieService.stop();
    }

    @Override
    public void createDriver() {
         driver = new InternetExplorerDriver(ieService);
    }

}
