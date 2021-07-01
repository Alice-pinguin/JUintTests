
import goit.homework.products.ProductStorageImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class ProductTest {
    private ProductStorageImpl testProduct;

    @BeforeEach
    public void init() {
        testProduct = new ProductStorageImpl("A", 1.25, 3, 3);
    }

    @Test
    public void testGetPrice() {
        double expected = 3.0;
        double actual = testProduct.getProductPrice(3);
        assertEquals(expected, actual);
    }


    @Test
    public void testCompareProducts() {
        ProductStorageImpl similar = new ProductStorageImpl("A", 1.25, 3, 3);
        assertEquals(similar, testProduct);
    }

    @Test
    public void testDifferentCompareProducts() {
        ProductStorageImpl another = new ProductStorageImpl("B", 4.25);
        assertNotEquals(another, testProduct);

        ProductStorageImpl anotherPrice = new ProductStorageImpl("A", 1.5, 3, 3);
        assertNotEquals(anotherPrice, testProduct);

        ProductStorageImpl anotherSalesQuantity = new ProductStorageImpl("A", 1.25, 4, 3);
        assertNotEquals(anotherSalesQuantity, testProduct);

        ProductStorageImpl salesPrice = new ProductStorageImpl("A", 1.25, 3, 4);
        assertNotEquals(salesPrice, testProduct);
    }


}


