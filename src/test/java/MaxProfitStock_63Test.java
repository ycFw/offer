import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfitStock_63Test {

    @Test
    public void maxProfit01() {
        assertEquals(5, MaxProfitStock_63.maxProfit01(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, MaxProfitStock_63.maxProfit01(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    public void maxProfit02() {
        assertEquals(7, MaxProfitStock_63.maxProfit02(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(4, MaxProfitStock_63.maxProfit02(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, MaxProfitStock_63.maxProfit02(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    public void maxProfit03() {
        assertEquals(6, MaxProfitStock_63.maxProfit03(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
        assertEquals(4, MaxProfitStock_63.maxProfit03(new int[]{1, 2, 3, 4, 5}));
    }
}