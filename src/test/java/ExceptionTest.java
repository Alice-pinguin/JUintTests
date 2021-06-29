import goit.homework.shop.ShopStorage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

 class ExceptionTest {

    /*
    тесты проведенные для негативного тестирования, должны падать с исключением и выводить
    сообщение, указанное в методе
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
