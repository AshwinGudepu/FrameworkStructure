package dataProvidersExample;

import java.io.*;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingDataFromExcel {
    public String path;
    public FileInputStream fis = null;
    public FileOutputStream fileOut = null;
    private XSSFWorkbook xssfWorkbook = null;
    private XSSFSheet xssfSheet = null;
    private XSSFRow xssfRow = null;
    private XSSFCell xssfCell = null;


    public void test_dataProvider() throws IOException {
        String[][] arrayExcelData = null;
        File src = new File(System.getProperty("user.dir") + "\\DataDrivenTesting.xlsx");
        try {
            FileInputStream fis = new FileInputStream(src);
            xssfWorkbook = new XSSFWorkbook(fis);
            int totalSheetsCount = xssfWorkbook.getNumberOfSheets();
            System.out.println("Rows Count-->"+xssfRow.getRowNum());

            //arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];

            for (int i = 0; i < totalSheetsCount; i++) {
                if ("Credentials".equalsIgnoreCase(xssfWorkbook.getSheetName(i))) {
                    xssfSheet = xssfWorkbook.getSheetAt(i);
                    xssfRow = xssfSheet.getRow(i);
                    int totalRowCount = xssfSheet.getLastRowNum() + 1;
                    int totalColumnCount = xssfRow.getLastCellNum();
                    for (int rowValue = 0; rowValue < totalRowCount; rowValue++) {
                        for (int colValue = 0; colValue < totalColumnCount; colValue++) {
                            System.out.println("----" + xssfSheet.getRow(rowValue).getCell(colValue));
                        }
                    }
                    xssfWorkbook.close();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            xssfWorkbook.close();
            System.out.println("This block got executed");
        }
    }
}
