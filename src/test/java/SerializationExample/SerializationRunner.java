package SerializationExample;

import java8Tasks.Consumer.Product;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SerializationRunner {

    public static final String file = "File";

    public static void main(String[] args) {
        ProductSerialization p1 = new ProductSerialization("Television", "Electronics", "A", 5000);
        ProductSerialization p2 = new ProductSerialization("Laptop", "Electronics", "B", 500);
        ProductSerialization p3 = new ProductSerialization("Screwdriver", "HardWare", "A", 1200);

        List<ProductSerialization> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        try {
            // System.out.println("-===============------"+System.getProperty("user.dir"));
            System.out.print("\n" + "==Writing to File");
            File file = new File(".\\src\\main\\resources\\testSerialization.ser");
            if (!file.exists()) {
                file.createNewFile();
            } else {
                file.delete();
                file.createNewFile();
            }
          //  FileOutputStream bufferedOutputStreamStream = new FileOutputStream(file);
            FileWriter bufferedOutputStreamStream = new FileWriter(file);
            bufferedOutputStreamStream.write(productList.toString());
            bufferedOutputStreamStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
