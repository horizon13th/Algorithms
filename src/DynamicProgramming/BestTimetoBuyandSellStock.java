package DynamicProgramming;

public class BestTimetoBuyandSellStock {
	public static void main(String args[]){
		int[] nums={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxProfit(nums));
	}
	public static int maxProfit(int[] prices) {
        if(prices.length<=1)
            return 0;
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            profit=Math.max(prices[i]-min,profit);
            //compare latest profit with current price-min
            min=Math.min(prices[i],min);
            //find the minest price
        }
        return profit;
    }
}
