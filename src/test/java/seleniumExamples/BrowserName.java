package seleniumExamples;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserName {
    public static WebDriver driver;

    @Test
    public void createDriver() {
        System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.testandquiz.com/selenium/testing.html");
        driver.manage().window().maximize();
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = caps.getBrowserName();
        String browserVersion = caps.getVersion();
        System.out.println(browserName + " " + browserVersion);
        driver.close();
        driver.quit();
    }
}
