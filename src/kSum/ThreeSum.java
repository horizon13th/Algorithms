package kSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static void main(String args[]) {
		int[] numbers = new int[] { 1, 2, -3, 5, -7, -1 };
		System.out.println(threeSum(numbers));
		// Input number
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int left = i + 1, right = nums.length - 1, sum = 0 - nums[i];
				while (left < right) {
					if(nums[left]+nums[right]==sum){
						result.add(Arrays.asList(nums[i],nums[left],nums[right]));
						while(left<right&&nums[left]==nums[left+1]) left++;
						while(left<right&&nums[right]==nums[right-1]) right--;
						left++;
						right--;
					}
					else if(nums[left]+nums[right]<sum)
						left++;
					else
						right--;
				}
			}
		}
		return result;
	}
}
