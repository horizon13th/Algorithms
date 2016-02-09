package DynamicProgramming;

public class MaximumSubarray {
	public static void main(String args[]){
		int[] nums={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	public static int maxSubArray(int[] nums) {
        int max=nums[0];
        int[] sum=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i]=Math.max(sum[i-1]+nums[i],nums[i]);
            max=Math.max(max,sum[i]);
        }
        return max;
        //0 sum[0]=-2,max=-2
        //1 sum[1]=-2+1=1,max=1
        //2 sum[2]=1-3,-3=-2,max=1
        //3 sum[3]=-2+4,4=4 max=4
        //4 sum[4]=4-1,-1=3, max=4
        //5 sum[5]=3,3+2=5, max=5
        //6 sum[6]=1,1+5=6, max=6
        //7 sum[7]=6-5,-5=1, max=6
        //8 sum[8]=1+4,4=5, max=6
    }
}
