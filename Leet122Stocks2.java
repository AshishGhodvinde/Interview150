class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] > prices[i-1])     profit+=(prices[i]-prices[i-1]);
        }
        return profit;
    }
}

//we can use local maxima and local minima concept
//else, we can just think it for single day, where if i am getting profit i.e. current day prices is more thatn yesterday then sell immediately. the results are same as of local max nd min approach