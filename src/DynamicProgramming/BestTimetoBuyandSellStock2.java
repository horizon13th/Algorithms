package DynamicProgramming;

public class BestTimetoBuyandSellStock2 {
	public static void main(String args[]){
		int[] nums={2,1,3,4,1,2,1,5,4};
		System.out.println(maxProfit(nums));
	}
	public static int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1])
                profit+=(prices[i]-prices[i-1]);
        }
        return profit;
    }
}
