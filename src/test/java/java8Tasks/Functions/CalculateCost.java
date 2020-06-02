package java8Tasks.Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CalculateCost {

    /*1. Write a function to calculate the cost of all products
    in a given list of products.*/
    public void calculateCostOfAllProducts(List<Product> productList){
        System.out.println("\n"+"---TASK 1---");
        Function<List<Product>, Integer> productsPrice = products -> products.stream()
                .mapToInt(product -> product.getPrice())
                .sum();
        System.out.println("Products cost count "+productsPrice.apply(productList));
    }

    /*2. Write a function to calculate the cost of all products whose
     prices is > 1000/- in the given list of products.*/
    public void priceGreaterThan100(List<Product> productList){
        System.out.println("\n"+"---TASK 2---");
        Function<List<Product>, Integer> productsPrice = productPrice->productPrice.stream().
               filter(priceGreater->priceGreater.getPrice()>1000) .mapToInt(product -> product.getPrice()).sum();
        System.out.println("Products cost count "+productsPrice.apply(productList));
    }

    //Task 2 using FOR Loop
    public void priceGreaterThan100UsingFor(List<Product> productList){
        System.out.println("\n"+"---************FOR LOOP*************---");
        Function<List<Product>, Double> productsPrice = products->{
            Double sumOfProducts=0.0;
                for(int i=0;i<productList.size();i++){
                        if(products.get(i).getPrice()>1000){
                            sumOfProducts=sumOfProducts+products.get(i).getPrice();
                        }
                }return sumOfProducts;
        };
    }

    /*3. Write a function to calculate the cost of all electronic products in the given list of products.*/
    public void costOfAllElectronicProducts(List<Product> productList){
        System.out.println("\n"+"---TASK 3---");
        Function<List<Product>, Double> productCategory = prodCategory->prodCategory.stream().
                filter(pCategory->pCategory.getCategory()=="Cricket") .mapToDouble(product -> product.getPrice()).sum();
        System.out.println("Products Cost of Category"+productCategory.apply(productList));
    }

    /*4. Write a function to get all the products whose price is is > 1000/- and belongs to electronic category.*/
    public void costOfAllElectronicProductsAndPriceGreaterThan1000(List<Product> productList){
        System.out.println("\n"+"---TASK 4---");
        Function<List<Product>, Double> productCategory = prodCategory->prodCategory.stream().
                filter(products->products.getCategory()=="Cricket" && products.getPrice()>1000 ) .mapToDouble(product -> product.getPrice()).sum();
        System.out.println("Products on And Condition "+productCategory.apply(productList));
    }

    public static void main(String args[]){
        CalculateCost calcCost=new CalculateCost();
        List<Product> products=new ArrayList<>();
        products.add(new Product("Kashmir Willow","Cricket","A",1200));
        products.add(new Product("English Willow","Cricket","A",300));
        products.add(new Product("Leather Ball","Baskey Ball","A",140));
        calcCost.calculateCostOfAllProducts(products);
        calcCost.priceGreaterThan100(products);
        calcCost.costOfAllElectronicProducts(products);
        calcCost.costOfAllElectronicProductsAndPriceGreaterThan1000(products);

        calcCost.priceGreaterThan100UsingFor(products);
    }
}