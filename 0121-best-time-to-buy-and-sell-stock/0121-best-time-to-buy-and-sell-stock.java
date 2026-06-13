class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
         int maximum=0;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<min){
                min=prices[i];
            }
            int profit=prices[i]-min;
            maximum=Math.max(maximum,profit);
        
    }
    return maximum;
}
}