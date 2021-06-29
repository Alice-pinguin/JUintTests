import goit.homework.shop.ShopStorage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ShopStorageTest {

    ShopStorage shopStorage = new ShopStorage();
    @Test
    public void testCalculateTotalCost() {
        double expected = 7.25;
        double actual = shopStorage.calculateTotalCost("ABCD");
        assertEquals(expected, actual);
    }
    @Test
    public void testLowerCaseCalculateTotalCost() {
        double expectedLowerCaseBucket = 8.50;
        double actualLowerCaseBuckets = shopStorage.calculateTotalCost("abCDA");
        assertEquals(expectedLowerCaseBucket, actualLowerCaseBuckets);
    }

    @Test
    public void testCalculateTotalCostUndefinedProducts() {
        double expectedUndefinedProduct = 4.25;
        double actualUndefinedProducts = shopStorage.calculateTotalCost("berry");
        assertEquals(expectedUndefinedProduct, actualUndefinedProducts);
    }
    @Test
    public void testCalculateBucketSpace() {
        double expectedSpace = 5.75;
        double actualSpace = shopStorage.calculateTotalCost("A C CA DA");
        assertEquals(expectedSpace, actualSpace);
    }
    @Test
    public void testCalculateBucketNumbers() {
        double expectedNumbers = 5.0;
        double actualNumbers = shopStorage.calculateTotalCost("A1111C3D5566DA");
        assertEquals(expectedNumbers, actualNumbers);
    }

    @Test
    public void testCalculateUndefinedAndCorrect() {
        double expectedUndefinedAndCorrect = 8.50;
        double actualUndefinedAndCorrect = shopStorage.calculateTotalCost("JAVAJDBC");
        assertEquals(expectedUndefinedAndCorrect, actualUndefinedAndCorrect);
    }
}
