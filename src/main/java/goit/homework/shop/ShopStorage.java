package goit.homework.shop;

import goit.homework.products.ProductImpl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ShopStorage {

    private final HashMap<String, ProductImpl> productsBucket = new HashMap<>();

      {
        productsBucket.put("A", new ProductImpl("A", 1.25, 3, 3.0));
        productsBucket.put("B", new ProductImpl("B", 4.25));
        productsBucket.put("C", new ProductImpl("C", 1.0, 6, 5.0));
        productsBucket.put("D", new ProductImpl("D", 0.75));
    }

   // boolean notEmptyBucket(String bucket){
  //  return bucket != null && !bucket.isEmpty(); }


    String filteredBucket(String bucket) {
        if (bucket != null && !bucket.isEmpty()) {
            return Arrays.stream(bucket.toUpperCase()
                    .split(""))
                    .filter(productsBucket::containsKey)
                    .collect(Collectors.joining());
        } else {
            throw new NullPointerException("Empty bucket, try again");
        }
    }

    public  double calculateTotalCost(String bucket) {
        if (bucket != null && !bucket.isEmpty()) {
            String customerBucket = filteredBucket(bucket);
            Map<String, Long> productsQuantity = Arrays.stream(customerBucket.split(""))
                    .map(productsBucket::get)
                    .collect(Collectors.groupingBy(ProductImpl::getId,
                            Collectors.mapping(ProductImpl::getId, Collectors.counting())));
            return productsQuantity.entrySet().stream()
                    .mapToDouble(p -> productsBucket.get(p.getKey()).getProductPrice((p.getValue())))
                    .sum();
        } else {
            return 0;
        }
    }
}

















