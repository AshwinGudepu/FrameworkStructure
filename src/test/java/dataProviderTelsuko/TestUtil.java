package dataProviderTelsuko;

import java.util.ArrayList;

public class TestUtil {
    public static Xls_Reader reader;

    public static ArrayList<Object[]> getDataFromExcel(String path,String nameSheet) {
        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try {
            reader = new Xls_Reader(path);
            for (int rowNum = 2; rowNum <= reader.getRowCount(nameSheet); rowNum++) {
                String firstName = reader.getCellData(nameSheet, "UserName", rowNum);
                String lastName = reader.getCellData(nameSheet, "Password", rowNum);
                Object[] obj={"UserName", "Password"};
                myData.add(obj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } return myData;
    }
}
