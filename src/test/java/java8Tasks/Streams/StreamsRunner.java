package java8Tasks.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsRunner {

    /*1. From the given list of the products get all the products with price > 1000/-*/
    public void getProductsGreaterThan1000(List<Product> productList){
        System.out.println("\n"+"---java8Tasks.Task1---");
        List filteredProductsPrice=productList.stream().filter(p->p.getPrice()>1000).collect(Collectors.toList());
        filteredProductsPrice.forEach(System.out::println);
    }

    /*2. From the given list of the products get all the products from electronics category.*/
    public void getAllElectronicsProduct(List<Product> productList){
        System.out.println("\n"+"---java8Tasks.Task2---");
        List<Product> filteredProductsCategory=productList.stream().filter(p->p.getCategory().equalsIgnoreCase("Electronics")).collect(Collectors.toList());
        filteredProductsCategory.forEach(System.out::println);
    }

    /*3. From the given list of the products get all the products with price> 1000/- and from electronics category.
    Change the name of the result list into CAP letters before printing.*/
    public void getElectronicsProductsGreaterThan1000(List<Product> productList){
        System.out.println("\n"+"---java8Tasks.Task3---");
        List filteredElectronicsGreaterThan1000=productList.stream().
                filter(p->p.getCategory().equalsIgnoreCase("Electronics")&&p.getPrice()>1000).
                map(p->p.getName().toUpperCase()).collect(Collectors.toList());
        filteredElectronicsGreaterThan1000.forEach(System.out::println);
    }

    /*4. Calculate the count of all electronic products in the given list of products.*/
    public void countOfElectronicProducts(List<Product> productList) {
        System.out.println("\n" + "---java8Tasks.Task4---");
        Long countOfElectronicsItems=productList.stream().filter(p->p.getCategory().equalsIgnoreCase("Electronics")).count();
        String electronicsCountAssertion=(countOfElectronicsItems==3)?"-> Count is Correct":"-> Count is Incorrect";
        System.out.println("Electonics Product Assertion" +electronicsCountAssertion);
    }

        public static void main(String[] args){
        Product p1=new Product("Television","Electronics","A",1500);
        Product p2=new Product("LapTop","Electronics","B",1100);
        Product p5=new Product("Calculator","Electronics","C",700);
        Product p3=new Product("Screw Driver","Hardware","A",1400);
        Product p4=new Product("Nail","Hardware","B",1001);

        List<Product> productList=new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);

        StreamsRunner streamsRunner=new StreamsRunner();
        streamsRunner.getProductsGreaterThan1000(productList);
        streamsRunner.getAllElectronicsProduct(productList);
        streamsRunner.countOfElectronicProducts(productList);
        streamsRunner.getElectronicsProductsGreaterThan1000(productList);
    }
}
