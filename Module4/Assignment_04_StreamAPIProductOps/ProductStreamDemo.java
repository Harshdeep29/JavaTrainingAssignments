package Assignment_04_StreamAPIProductOps;

import java.util.*;
import java.util.stream.*;
import java.util.Comparator;

public class ProductStreamDemo {
    public static void main(String[] args) {
        List<ProductStream> products = Arrays.asList(
                new ProductStream("Laptop", "Electronics", 45000),
                new ProductStream("Mouse", "Electronics", 500),
                new ProductStream("Shirt", "Clothing", 1200),
                new ProductStream("Keyboard", "Electronics", 1500),
                new ProductStream("Shoes", "Footwear", 2500),
                new ProductStream("Watch", "Accessories", 1800),
                new ProductStream("T-shirt", "Clothing", 900)
        );

        // Task 1: Products with price > 1000
        List<ProductStream> expensiveProducts = products.stream()
                .filter(p -> p.getPrice() > 1000)
                .collect(Collectors.toList());
        System.out.println("Products with price > 1000:");
        expensiveProducts.forEach(System.out::println);

        // Task 2: Total price of all products
        double totalPrice = products.stream()
                .mapToDouble(ProductStream::getPrice)
                .sum();
        System.out.println("\nTotal price of all products: ₹" + totalPrice);

        // Task 3: Product with the highest price
        ProductStream mostExpensive = products.stream()
                .max(Comparator.comparingDouble(ProductStream::getPrice))
                .orElse(null);
        System.out.println("\nMost expensive product: " + mostExpensive);

        // Task 4: List of product names sorted alphabetically
        List<String> sortedNames = products.stream()
                .map(ProductStream::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("\nSorted product names: " + sortedNames);

        // Task 5: Count of products in each category
        Map<String, Long> categoryCounts = products.stream()
                .collect(Collectors.groupingBy(ProductStream::getCategory, Collectors.counting()));
        System.out.println("\nProduct count by category:");
        categoryCounts.forEach((category, count) ->
                System.out.println(category + ": " + count));
    }
}
