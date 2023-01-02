package problems.problem121;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void array1_shouldReturn_five() {
        var bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] array1 = {7, 1, 5, 3, 6, 4};
        assertEquals(5, bestTimeToBuyAndSellStock.maxProfit(array1));
    }

    @Test
    void array2_shouldReturn_zero() {
        var bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] array2 = {7,6,4,3,1};
        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(array2));
    }

    @Test
    void array3_shouldReturn_two() {
        var bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] array3 = {2,4,1};
        assertEquals(2, bestTimeToBuyAndSellStock.maxProfit(array3));
    }
}