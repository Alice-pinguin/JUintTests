
import goit.homework.products.ProductImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class ProductTest {
    private ProductImpl testProduct;

    @BeforeEach
    public void init() {
        testProduct = new ProductImpl("A", 1.25, 3, 3);
    }

    @Test
    public void testGetPrice() {
        double expected = 3.0;
        double actual = testProduct.getProductPrice(3);
        assertEquals(expected, actual);
    }


}


