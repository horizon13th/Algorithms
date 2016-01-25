package Hash;

import java.util.HashMap;

public class MajorityElement {
	public static void main(String args[]) {
		int[] numbers = new int[] { 2, 2, 3 };
		System.out.println(majorityElement(numbers));
		// Input number
	}

	public static int majorityElement(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (!hm.containsKey(nums[i]))
				hm.put(nums[i], 1);
			else
				hm.put(nums[i], hm.get(nums[i]) + 1);
			// hm.get(nums[i])++ is wrong here
			if (hm.get(nums[i]) > nums.length / 2)
				result = nums[i];
			// majority num 's count is more than nums.leng/2, not equal
		}
		return result;
	}
}
