package goit.homework.products;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class ProductImpl implements ProductStorage<String> {

    private String id;
    private double productPrice;
    private int salesProductQuantity;
    private double salesProductPrice;

    public ProductImpl(String id, double productPrice) {
       this(id, productPrice,1, productPrice);
    }
    public double getProductPrice(long quantity) {
        if (quantity < salesProductQuantity) {
            return quantity * productPrice;
        }
            return (quantity / salesProductQuantity) * salesProductPrice +
                    (quantity % salesProductQuantity) * productPrice;
        }
    }



