package java8Tasks.homeTaskPredicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestRunnerPredicate {

    /*1. Define a predicate to check if the price of given product is greaterthan 1000/-.
    Print all the products from the given list of the products if the price is greaterthan 1000/-.
    */
    public void getProductBasedOnPrice(List<Product> listOfProducts, int price) {
        System.out.println("Task 1 PRODUCT PRICE---" + price + "\n");
        Predicate<Product> filterOnProductPrice = (productList) -> (productList.getPrice() > price);
        for (Product productList : listOfProducts) {
            if (filterOnProductPrice.test(productList)) {
                System.out.println("Products Greater Than 1000 ==>" + productList.getPrice());
            }
        }
    }

    /*2. Define a predicate to check if the product is of electronics category.
    Print all the products from the given list of the products if the product is of electronics category.
    */
    public void getProductBasedOnElectronicsCategory(List<Product> listOfProducts, String category) {
        System.out.println("\n" + "Task 2 PRODUCT CATEGORY---" + category);
        Predicate<Product> filterOnProductCategory = (productList) -> (productList.getCategory().equals(category));
        for (Product productList : listOfProducts) {
            if (filterOnProductCategory.test(productList)) {
                System.out.println("Electronics Products ==>" + productList.getName());
            }
        }
    }

    /*3. Print all the products from the given list of product if the product price is greaterthan 100/-
   which are in electronics category.
   */
    public void getProductBasedOnPriceGreaterThenGivenPriceAndCategory(List<Product> listOfProducts, String category, int price) {
        System.out.println("\n" + "Task 3 GREATER " + category + "---" + price);
        Predicate<Product> filterOnProductPrice = (productList) -> (productList.getPrice() > (price));
        Predicate<Product> filterOnProductCategory = (productList) -> (productList.getCategory().equals(category));
        for (Product productList : listOfProducts) {
            if (filterOnProductCategory.and(filterOnProductPrice).test(productList)) {
                System.out.println("Product Name==>" + productList.getName() + "Product Category==>" + productList.getCategory());
            }
        }
    }

    /*4. Print all the products from the given list of product
        if the product price is greaterthan 100/- or product is in electronics category.
    */
    public void getProductBasedOnPriceLessThenGivenPriceOrCategory(List<Product> listOfProducts, String category, int price) {
        System.out.println("\n" + "---Task 4 Greater AND OR---");
        Predicate<Product> filterOnProductPrice = (productList) -> (productList.getPrice() > (price));
        Predicate<Product> filterOnProductCategory = (productList) -> (productList.getCategory().equals(category));
        List<Product> filterProductList = listOfProducts.stream().filter(filterOnProductCategory.or(filterOnProductPrice)).collect(Collectors.toList());
        filterProductList.forEach(System.out::println);
    }

    /*5. Print all the products from the given list of product if the product price is
        lessthan 100/- and product is in electronics category.
    */
    public void getProductBasedOnPriceLessThenGivenPriceAndCategory(List<Product> listOfProducts, String category, int price) {
        System.out.println("\n" + "Task 5 LESS " + category + "---" + price);
        Predicate<Product> filterOnProductPrice = (productList) -> (productList.getPrice() < (price));
        Predicate<Product> filterOnProductCategory = (productList) -> (productList.getCategory().equals(category));
        for (Product productList : listOfProducts) {
            if (filterOnProductCategory.and(filterOnProductPrice).test(productList)) {
                System.out.println("Product Name==>" + productList.getName() + "  " + "Product Category==>" + productList.getCategory());
            }
        }
    }

    public static void main(String[] args) {
        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(new Product("Television", "Electronics", "A", 30));
        listOfProducts.add(new Product("Laptop", "Electronics", "B", 12));
        listOfProducts.add(new Product("Mobile", "Electronics", "C", 99));

        listOfProducts.add(new Product("Cricket Bat", "Sports", "A", 234));
        listOfProducts.add(new Product("Tennis Bat", "Sports", "C", 78));
        listOfProducts.add(new Product("Badminton Racquet", "Sports", "B", 132));

        listOfProducts.add(new Product("Trimmer", "Electrical", "A", 178));
        listOfProducts.add(new Product("Iron Box", "Electrical", "C", 59));

        TestRunnerPredicate testRunnerPredicate = new TestRunnerPredicate();

        testRunnerPredicate.getProductBasedOnPrice(listOfProducts, 100);
        testRunnerPredicate.getProductBasedOnElectronicsCategory(listOfProducts, "Electronics");
        testRunnerPredicate.getProductBasedOnPriceGreaterThenGivenPriceAndCategory(listOfProducts, "Electronics", 100);
        testRunnerPredicate.getProductBasedOnPriceLessThenGivenPriceOrCategory(listOfProducts, "Electronics", 100);
        testRunnerPredicate.getProductBasedOnPriceLessThenGivenPriceAndCategory(listOfProducts, "Electronics", 100);
    }
}
