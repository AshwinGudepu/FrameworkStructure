package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelRunner {

    @Test(dataProvider = "testDataProvider")
    public void exampleTestData(String username, String password) {
        System.out.print("Driver-->"+username+"|"+"Password-->"+password);
    }


    @DataProvider(name="testDataProvider")
    public Object[][] getData(){
        Object data[][]=testData("DataDrivenTesting.xlsx","Data");
    return data;
    }

    public Object[][] testData(String excelPath,String sheetName) {
        String cellData;
        String path=System.getProperty("user.dir") ;
        ExcelUtils excelUtils=new ExcelUtils(path+"\\"+excelPath,sheetName);
        int rowCount=excelUtils.getRowCount();
        int colCount=excelUtils.geColumnCount();
        Object data[][]=new Object[rowCount-1][colCount];
        //0th row is the first row,so we are skipping that row,that's why we are
        //starting at 1.
        for(int i=1;i<rowCount;i++){
            for(int j=0;j<colCount;j++){
                cellData=excelUtils.getCellDataString(i,j);
                //[i-1]-> array index starts from 0,that's why we have to subtract
                data[i-1][j]=cellData;
            }
        }return data;
    }
}
