package goit.homework.products;

import lombok.AllArgsConstructor;

import lombok.Data;

@AllArgsConstructor
@Data

public class ProductStorageImpl implements ProductStorage<String> {

    private String id;
    private double productPrice;
    private int salesProductQuantity;
    private double salesProductPrice;

    public ProductStorageImpl(String id, double productPrice) {
       this(id, productPrice,1, productPrice);
    }
    public double getProductPrice(long quantity) {
        if (quantity < 1) {
            throw new RuntimeException("Empty bucket, put something in");
        }
        if (quantity < salesProductQuantity) {
            return quantity * productPrice;
        }
            return (quantity / salesProductQuantity) * salesProductPrice +
                    (quantity % salesProductQuantity) * productPrice;
        }
    }



