// 121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        // int maxProfit = 0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         int temp = prices[j] - prices[i];
        //         if(maxProfit<temp) maxProfit=temp;
        //     }
        // }
        // return maxProfit > 0 ? maxProfit : 0;

      
        int maxProfit = 0;
        int min = prices[0];

        for(int i=1; i<prices.length; i++){
            if(prices[i] < min && i<prices.length-1){
                min = prices[i];
            }
            else if(prices[i] - min > maxProfit) maxProfit = prices[i] - min;
        }
        return maxProfit;
    }
}
