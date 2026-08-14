class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double p=0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int j=discounts.length-1;
        for(int i=prices.length-1;i>=0;i--){
            double discount=0;
            if(j>=0){
               discount=prices[i]*(discounts[j]/100.0);
               p+=prices[i]-discount;
               j--;
            }else{
                p+=prices[i];
                
            }
        }return p;
    }
}