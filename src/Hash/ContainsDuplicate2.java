package Hash;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
	public static void main(String args[]) {
		int[] numbers = new int[] { 1, 2, 2, 3 };
		System.out.println(containsNearbyDuplicate(numbers, 2));
		// Input number
	}

	// public static boolean containsNearbyDuplicate(int[] nums, int k) {
	// Set<Integer> dSet = new HashSet<Integer>();
	// for(int i=0; i<nums.length; i++){
	// if(!dSet.add(nums[i])){
	// if(i-k>0){
	// for(int j=i-k; j<i; j++){
	// if(nums[j]==nums[i])
	// return true;
	// }
	// }
	// else{
	// for(int j=0; j<i; j++){
	// if(nums[j]==nums[i])
	// return true;
	// }
	// }
	// }
	// }
	// return false;
	// }
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> dSet = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (i > k)
				dSet.remove(nums[i - k - 1]);
			if (!dSet.add(nums[i]))
				return true;
		}
		return false;
	}
}
