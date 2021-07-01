package goit.homework.shop;

import goit.homework.products.ProductStorageImpl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ShopStorage {

    private final HashMap<String, ProductStorageImpl> productsBucket = new HashMap<>();

    {
        productsBucket.put("A", new ProductStorageImpl("A", 1.25, 3, 3.0));
        productsBucket.put("B", new ProductStorageImpl("B", 4.25));
        productsBucket.put("C", new ProductStorageImpl("C", 1.0, 6, 5.0));
        productsBucket.put("D", new ProductStorageImpl("D", 0.75));
    }

    private String filteredBucket(String bucket) {
        if (bucket != null && !bucket.isEmpty()) {
            return Arrays.stream(bucket.toUpperCase()
                    .split(""))
                    .filter(productsBucket::containsKey)
                    .collect(Collectors.joining());
        } else {
            throw new NullPointerException("You write wrong product id, check it and try again");
        }
    }

    public double calculateTotalCost(String bucket) {
       String customerBucket = filteredBucket(bucket);
        if (bucket != null && !bucket.isEmpty()) {
            Map<String, Long> productsQuantity = Arrays.stream(customerBucket.split(""))
                    .map(productsBucket::get)
                    .collect(Collectors.groupingBy(ProductStorageImpl::getId,
                            Collectors.mapping(ProductStorageImpl::getId, Collectors.counting())));
            return productsQuantity.entrySet().stream()
                    .mapToDouble(p -> productsBucket.get(p.getKey()).getProductPrice((p.getValue())))
                    .sum();
        } else {
            return 0;
        }
    }
}


















