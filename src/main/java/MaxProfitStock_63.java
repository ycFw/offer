/**
 * @program: offer
 * @description: 股票的最大利润
 * @author: Yin Cong
 * @created: 2020/07/25 14:42
 */
public class MaxProfitStock_63 {
    /**
     * 只允许一次买卖
     */
    public static int maxProfit01(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int soFarMin = Integer.MAX_VALUE;
        for (int price : prices) {
            soFarMin = Math.min(soFarMin, price);
            maxProfit = Math.max(price - soFarMin, maxProfit);
        }
        return maxProfit;
    }

    /**
     * 允许多次买卖
     */
    public static int maxProfit02(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                maxProfit += (prices[i + 1] - prices[i]);
            }
        }
        return maxProfit;
    }

    /**
     * 最多可以完成2次买卖
     */
    public static int maxProfit03(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int buy1 = Integer.MAX_VALUE, sellProfit1 = 0;
        int buy2 = Integer.MAX_VALUE, sellProfit2 = 0;
        for (int i = 0; i < prices.length; i++) {
            buy1 = Math.min(buy1, prices[i]);
            sellProfit1 = Math.max(sellProfit1, prices[i] - buy1);
            buy2 = Math.min(buy2, prices[i] - sellProfit1);
            sellProfit2 = Math.max(sellProfit2, prices[i] - buy2);
        }
        return sellProfit2;
    }
}
