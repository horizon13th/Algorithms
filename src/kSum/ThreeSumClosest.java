package kSum;

import java.util.Arrays;

public class ThreeSumClosest {
	public static void main(String args[]) {
		int[] numbers = new int[] { 1, 2, -3, 5, -7, -1 };
		System.out.println(threeSumClosest(numbers, 1));
		// Input number
	}

	public static int threeSumClosest(int[] nums, int target) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return nums[0] + nums[1];
		if (nums.length == 3)
			return nums[0] + nums[1] + nums[2];

		int min = Integer.MAX_VALUE;
		int result = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			int left = i + 1;// from i+1 begin scanning
			int right = nums.length - 1;
			while (left < right) {
				int sum = nums[left] + nums[right] + nums[i];
				int diff = Math.abs(target - sum);
				if (diff < min) {
					min = diff;
					result = sum;
				}
				if (sum < target)
					left++;
				else
					right--;
			}
		}
		return result;
	}
}
