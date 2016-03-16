package DynamicProgramming;

public class JumpGame {
	public static void main(String []args){
		int[] arr = {3,2,1,0,5};
		System.out.println(canJump(arr));
	}
	public static boolean canJump(int[] nums) {
        if(nums==null||nums.length==0)
            return false;
        int get[] = new int[nums.length];
        get[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            if(get[i-1]>=i)
                get[i]=Math.max(get[i-1], nums[i]+i);
            else
                return false;
        }
        return true;
    }
}
