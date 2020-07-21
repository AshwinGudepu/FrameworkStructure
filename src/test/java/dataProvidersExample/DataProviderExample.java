package dataProvidersExample;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderExample {
     public WebDriver driver;

    @Test(dataProvider = "inputdata")
    public void testdata(String username, String password) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        System.out.println("Username-->"+username+"--"+"Password-->"+password);
    }

    @DataProvider(name = "inputdata")
    public Object[][] getCellData() throws IOException {
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\DataDrivenTesting.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet s = wb.getSheet("Credentials");
        int rowCount = s.getLastRowNum() + 1;
        int cellCount = s.getRow(0).getLastCellNum();
        Object data[][] = new Object[rowCount][cellCount];
        for (int i = 0; i < rowCount; i++) {
            Row r = s.getRow(i);
            for (int j = 0; j < cellCount; j++) {
                Cell c = r.getCell(j);
                data[i][j] = c.getStringCellValue();
            }
        }
        wb.close();
        return data;
    }
}
