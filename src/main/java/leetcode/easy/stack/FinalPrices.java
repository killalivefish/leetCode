package leetcode.easy.stack;

public class FinalPrices {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int curPrice = prices[i];
            int n = 0;
            for (int j = i + 1; j < prices.length; j++) {
                int nextPrice = prices[j];
                if (nextPrice < curPrice) {
                    n = nextPrice;
                    break;
                }
            }
            result[i] = curPrice - n;
        }

        return result;
    }

    public static void main(String[] args) {
        FinalPrices finalPrices = new FinalPrices();
        int[] n = finalPrices.finalPrices(new int[]{});
    }
}
