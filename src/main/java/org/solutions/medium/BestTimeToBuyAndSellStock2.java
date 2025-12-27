package org.solutions.medium;
//122. Best Time to Buy and Sell Stock II
public class BestTimeToBuyAndSellStock2 {
    public static void main(String[] args) {
        int[] prices = {6,1,3,2,4,7};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices){
        int profit =0 ;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]> prices[i-1]){
                profit = profit+ prices[i]- prices[i-1];
            }
        }
        return profit;
    }
    // failed first try
//    public int maxProfit(int[] prices) {
//        int profit = 0;
//        int low = prices[0];
//        int high = prices[0];
//        for(int i : prices){
//            if(i < high){
//                profit = profit + high - low;
//                low = i;
//                high = i;
//            }
//            if(i < low)
//            {
//                low = i;
//                high = 0;
//                profit = 0;
//            }
//            if(i>high){
//                high = i;
//            }
//        }
//        return profit == 0 ? high - low : profit;
//
//    }
}
