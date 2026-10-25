class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int profit = 0;
        while(i<prices.length-1){
            if(prices[i]>prices[i+1]) {
                i++;
                continue;
            }
            else{
                int j = i+1;
                while( j<prices.length-1 && prices[j]<=prices[j+1]){
                    
                    j++;
                }
                profit = profit+prices[j]-prices[i];
                i = j;
            }
           
        }
        return profit;
    }
}