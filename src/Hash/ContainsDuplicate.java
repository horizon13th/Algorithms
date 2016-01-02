package Hash;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
		public static void main(String args[]){
			int[] numbers = new int[]{1,2,3};
			System.out.println(containsDuplicate(numbers));
			//Input number
		}
		public static boolean containsDuplicate(int[] nums) {
	        Set<Integer> dSet = new HashSet<Integer>();
	        for(int i=0; i<nums.length;i++){
	        if (!dSet.add(nums[i]))
	        	return true;
	        }
	        return false;
	    }
}
