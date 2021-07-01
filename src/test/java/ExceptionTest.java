import goit.homework.shop.ShopStorage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

 class ExceptionTest {

    /*
   tests run for negative testing should fail with an exception and output
     the message specified in the method
     */
    ShopStorage shopStorage = new ShopStorage();

    @Test
    public void testCalculateTotalCostEmptyBucket() {
        assertThrows(NullPointerException.class, () -> shopStorage.calculateTotalCost(null),
                "Please, check your bucket");
    }

     @Test
     public void testCalculateTotalCostOnlySpaceBucket() {
        assertThrows(NullPointerException.class, () -> shopStorage.calculateTotalCost(" "),
                "Please, check your bucket");
    }
}
