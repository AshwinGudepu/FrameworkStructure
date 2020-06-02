package java8Tasks.Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierRunner {


    public static void main(String args[]) {

        Product p1 = new Product("Television", "Electronics", "A", 1200);
        Product p2 = new Product("Hammer", "Hardware", "A", 1200);
        List<Product> productList = Arrays.asList(p1, p2);

        /*1. Write a supplier to produce a random product.*/
        Supplier<Product> getRandomProduct = () -> {
            Random random = new Random();
            return productList.get(random.nextInt(productList.size()));
        };
        System.out.println(getRandomProduct.get());

        /* 2. Write a supplier to produce a random OTP.*/
        Supplier<String> getOtp = () -> {
            String otp = "";
            for (int j = 1; j < 6; j++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(getOtp.get());
    }
}
