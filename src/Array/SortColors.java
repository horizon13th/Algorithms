package Array;

import java.util.Arrays;

public class SortColors {
	public static void main(String args[]) {
		int aNums[] = { 1, 1, 2, 2, 0, 2, 0 };
		sortColors(aNums);
	}

	public static void sortColors(int[] nums) {
		int flag = 0;
		int temp;
		for (int color = 0; color < 3; color++) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == color) {
					// swap nums[i] and nums[flag]
					temp = nums[flag];
					nums[flag] = nums[i];
					nums[i] = temp;

					flag++;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
