package dataProviderTelsuko;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelUtils;

import java.util.ArrayList;
import java.util.Iterator;

public class DataPrvTelsukoExample {

    String cellData;
    String path=System.getProperty("user.dir")+"\\"+"DataDrivenTesting.xlsx" ;
    //path,"Data");

    @DataProvider
    public Iterator<Object[]> getTestData(){
        ArrayList<Object[]> testData=TestUtil.getDataFromExcel(path,"Data");
        return testData.iterator();
    }

    //Not Working
    @Test(dataProvider = "getTestData")
    public void testUserName(String userName,String password){
        System.out.println("----"+userName+"|"+password);
    }
}
