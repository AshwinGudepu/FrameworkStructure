package java8Tasks.Consumer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerRunner {

    public static final String file = "File";
    public static final String console = "Console";

    /*2. Write a Consumer to update the grade of the product as 'Premium' if the price is > 1000/-.
    Given the product list, update the grade for each product and print all of the products.
    */
    static Consumer<List<Product>> getUpdatedCategory = (products) -> {
        products.stream().filter(p -> p.getPrice() > 1000).forEach(p -> p.setCategory("Premium"));
    };

    static Consumer<List<Product>> getUpdatedProducts = (products) -> {
        products.stream().forEach(System.out::println);
    };

    /*4. Print all the Premium grade products with name suffixed with '*'.*/
    static Consumer<List<Product>> suffixAsterisk=(productList)->{
        productList.stream().filter(p->p.getCategory().equalsIgnoreCase("Premium")).
                map(product ->product.getCategory()+"*").forEach(System.out::println);
    };

     /*3. Write a Consumer to update the name of the product to be suffixed with '*' if the price of product is > 3000/-.
     Given the product list, update the name for each product and print all of the products.*/
    static Consumer<List<Product>> suffixAsteriskForProductGreaterThan3000=(productList)->{
        productList.stream().filter(p->p.getPrice()>3000)
                .map(product ->product.getName()+"*").
                forEach(System.out::println);
    };

    static Consumer<List<Product>> allProducts=(productList)->{
        productList.stream().forEach(prod->System.out.println(prod));
    };

    public static void main(String args[]) {
        BiConsumer<List<Product>, String> printingToConsoleOrFile = (prod, output) -> {
            if (console.equals(output)) {
                System.out.println("Write to Console ->" + output);
                prod.forEach(System.out::println);
            } else if (file.equals(output)) {
                System.out.println("Write to File ->" + output);
                try {
                    // System.out.println("-===============------"+System.getProperty("user.dir"));
                    System.out.print("\n" + "==Writing to File");
                    File file = new File(".\\src\\main\\resources\\testing.txt");
                    if (!file.exists()) {
                        file.createNewFile();
                    } else {
                        file.delete();
                        file.createNewFile();
                    }
                    //  FileOutputStream fileOut = new FileOutputStream(file);
                    FileWriter bufferedOutputStreamStream = new FileWriter(file);
                    bufferedOutputStreamStream.write(prod.toString());
                    bufferedOutputStreamStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        Product p1 = new Product("Television", "Electronics", "A", 5000);
        Product p2 = new Product("Laptop", "Electronics", "B", 500);
        Product p3 = new Product("Screwdriver", "HardWare", "A", 1200);
        Product p4 = new Product("Measuring Tape", "Hardware", "B", 650);
        Product p5 = new Product("Switch Board", "Electric", "A", 1300);

        Product p6 = new Product("Microscope", "Premium", "B", 2000);
        Product p7 = new Product("Guitar", "Premium", "A", 3000);

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.add(p6);
        productList.add(p7);
        printingToConsoleOrFile.accept(productList, "Console");
        printingToConsoleOrFile.accept(productList, "File");
        getUpdatedCategory.andThen(getUpdatedProducts).accept(productList);
        suffixAsterisk.accept(productList);
        suffixAsteriskForProductGreaterThan3000.andThen(allProducts).accept(productList);
    }
}
