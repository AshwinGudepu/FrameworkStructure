package java8Tasks.biFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionRunner {

    /*1. Given the name and price of the product, write a Bifunction to create a product.*/
    static BiFunction<String, Integer, Product> createProduct = (name, price) -> {
        return new Product(name, price);
    };

    /*2. Given the Product and quantity of the products, write a BiFunction to calculate the cost of products.*/
    static BiFunction<Product, Integer, Integer> calculateCost = (product, quantity) -> {
        return product.getPrice() * quantity;
    };

    /*A cart is a map of product and quantity. Given the cart, calculate the cost of the cart.*/
    static Function<Map<Product, Integer>, Integer> calculateCostOfCart = (products) -> {
        return products.entrySet().stream().mapToInt(e -> calculateCost.apply(e.getKey(),e.getValue())).sum();
    };

    /*public Product calculateCost(String productName, int priceOfProduct) {
        Product prod = new Product(productName, priceOfProduct);
        return prod;
    }*/

    public static void main(String args[]) {
        BiFunctionRunner biFunctionRunner = new BiFunctionRunner();
        List<Product> productList = new ArrayList<>();
        productList.add(createProduct.apply("New Product", 10));
        productList.forEach(System.out::println);
        Map<Product,Integer> cart=new HashMap<>();
        cart.put(createProduct.apply("Rice", 10), 7);
        cart.put(createProduct.apply("Cricket Bat", 20),5);
        System.out.println(calculateCostOfCart.apply(cart));
        System.out.println("Product Quantity*Cost----"+calculateCost.apply(createProduct.apply("New Product", 10),12));
    }
}
