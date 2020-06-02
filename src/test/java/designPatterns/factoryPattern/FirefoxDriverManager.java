package designPatterns.factoryPattern;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.File;

public class FirefoxDriverManager extends DriverManager {

    private GeckoDriverService fireFoxService;

    @Override
    public void startService() {
        if (null == fireFoxService) {
            try {
                fireFoxService = new GeckoDriverService.Builder()
                        .usingDriverExecutable(new File("ge.exe"))
                        .usingAnyFreePort()
                        .build();
                fireFoxService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void stopService() {
        if (null != fireFoxService && fireFoxService.isRunning())
            fireFoxService.stop();
    }

    @Override
    public void createDriver() {
        driver = new FirefoxDriver(fireFoxService);
    }
}
