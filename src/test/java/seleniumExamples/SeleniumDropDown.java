package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeleniumDropDown {

    public WebDriver driver;

    @BeforeMethod
    public void createDriver(){
        System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.testandquiz.com/selenium/testing.html");
        driver.manage().window().maximize();
    }

    @Test
    public void seleniumDropDownSortingOrder() {
        Select selectUsingOptions=new Select(driver.findElement(By.id("testingDropdown")));
        //Sorting on dropdown in ascending order
        List<WebElement> ascendingOrderedOptions=selectUsingOptions.getOptions();
        List<String>  addingAscDropDownValues=new ArrayList<>();
        List<String>  unSortedDropDownList=new ArrayList<>();
        for (int i=0;i<ascendingOrderedOptions.size();i++){
             addingAscDropDownValues.add(ascendingOrderedOptions.get(i).getText());
        }
        Collections.sort(addingAscDropDownValues);
        Assert.assertEquals(addingAscDropDownValues,unSortedDropDownList);
    }

    @Test
    public void selectUsingTextFromList() throws InterruptedException {
        List<WebElement> selectUsingOptions=driver.findElements(By.xpath("//select[@id='testingDropdown']/option"));
        for (int i=0;i<selectUsingOptions.size();i++){
            if(selectUsingOptions.get(i).getText().equals("Manual Testing")) {
                    selectUsingOptions.get(i).click();
                    Thread.sleep(3000);
                System.out.println("*******************");
            }
        }
    }

    @Test
    public void selectByValueOption() throws InterruptedException {
        Select selectUsingOptions=new Select(driver.findElement(By.id("testingDropdown")));
        selectUsingOptions.selectByValue("Database");
        Thread.sleep(3000);
        System.out.println("*******************");
    }

    @Test
    public void selectByUsingGetOptions() throws InterruptedException {
        Select selectUsingOptions = new Select(driver.findElement(By.id("testingDropdown")));
        List<WebElement> sOptions = selectUsingOptions.getOptions();
        Thread.sleep(3000);
        for (int i = 0; i < sOptions.size(); i++) {
            if (sOptions.get(i).getText().equals("Performance Testing")) {
                sOptions.get(i).click();
                break;
            }
        }
        System.out.println("*******************");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
