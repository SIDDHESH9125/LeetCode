class Solution {
    public int maxProfit(int[] prices) {
        int MaxProfit=0;
        for(int i=1;i<prices.length;i++){
            int profit=0;
            if(prices[i]>prices[i-1]){
                profit=prices[i]-prices[i-1];
                MaxProfit=Math.max(MaxProfit,MaxProfit+profit);
            }
        }return MaxProfit;
    }
}