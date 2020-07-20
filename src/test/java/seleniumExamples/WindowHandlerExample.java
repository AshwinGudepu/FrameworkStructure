package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowHandlerExample {

    public WebDriver driver;

    @Test
    public void createDriver(){
        System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/index.html");
        driver.manage().window().maximize();
        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//a/span[contains(text(),'Jobs')]")).click();
        driver.switchTo().window(parentWindow);
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> i = allWindows.iterator();
        while(i.hasNext()){
            String childwindow = i.next();
            if(!childwindow.equalsIgnoreCase(parentWindow)){
                driver.switchTo().window(childwindow);
                System.out.println("The child window is "+childwindow);
            } else {
                System.out.println("There are no children");
            }
        }
        driver.quit();
    }
}
