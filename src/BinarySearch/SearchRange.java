package BinarySearch;

import java.util.Arrays;

public class SearchRange {
	public static void main(String args[]) {
		int[] number = { 1 };
		// {1},2
		System.out.println(Arrays.toString(searchRange(number, 1)));
	}

	public static int[] searchRange(int[] nums, int target) {
		int[] result = new int[2];
		result[0] = searchFirst(nums, target);
		result[1] = searchLast(nums, target);
		return result;
	}

	private static int searchFirst(int[] nums, int target) {
		int start = 0, end = nums.length - 1, mid, first = -1;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (nums[mid] >= target)
				end = mid - 1;
			else
				start = mid + 1;
			if (nums[mid] == target)
				first = mid;
		}
		return first;
	}

	private static int searchLast(int[] nums, int target) {
		int start = 0, end = nums.length - 1, mid, last = -1;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (nums[mid] <= target)
				start = mid + 1;
			else
				end = mid - 1;
			if (nums[mid] == target)
				last = mid;
		}
		return last;
	}
}
