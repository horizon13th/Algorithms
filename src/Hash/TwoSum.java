package Hash;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	public static void main(String args[]) {
		int[] numbers = new int[] { 1, 2, 3, 5, 7 };
		System.out.println(Arrays.toString(twoSum(numbers,4)));
		// Input number
	}
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
        if(nums==null||nums.length<2)
            return result;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                result[0]=hm.get(nums[i])+1;
                result[1]=i+1;
                break;
            }
            else
                hm.put(target-nums[i],i);
        }
        return result;
    }
}
