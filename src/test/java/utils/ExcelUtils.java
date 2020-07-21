package utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelUtils {

    public String path;
    public FileInputStream fis = null;
    public FileOutputStream fileOut = null;
    private XSSFWorkbook workBook = null;
    private XSSFSheet sheet = null;
    private XSSFRow row = null;
    private XSSFCell cell = null;

    public  ExcelUtils(){

    }

    public ExcelUtils(String excelPath, String sheetName) {
        try {
            path = System.getProperty("user.dir");
            File src = new File(excelPath);
            FileInputStream fis = new FileInputStream(src);
            workBook = new XSSFWorkbook(fis);
            sheet = workBook.getSheet(sheetName);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //@Test(priority = 1)
    public int getRowCount() {
        int rowCount = sheet.getPhysicalNumberOfRows();
    //    System.out.println("Row Count-->" + rowCount);
        return rowCount;
    }

    //@Test(priority = 2)
    public String getCellDataString(int rowNumber, int colNumber) {
        String cellData = sheet.getRow(rowNumber).getCell(colNumber).toString();
      //  System.out.println("Cell Data-->" + cellData);
        return cellData;
    }

    //@Test(priority = 1)
    public int geColumnCount() {
        int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
        //System.out.println("Column Count-->" + columnCount);
        return columnCount;
    }

    //@Test(priority = 3)
    public void getCellDataNumber(int rowNumber, int colNumber) {
        double cellDataNumber = sheet.getRow(rowNumber).getCell(colNumber).getNumericCellValue();
        //System.out.println("Cell Data-->" + cellDataNumber);
    }
}
