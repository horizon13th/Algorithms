package Array;

public class RemoveDuplicatesfromSortedArray2 {
	public static void main(String args[]) {
		int aNums[] = { 1, 1, 2, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(aNums));
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		else if (nums.length == 1)
			return 1;
		else {
			int flag = 0;
			int doubleflag = 0;
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] == nums[i - 1]) {
					doubleflag++;
				}
				if (nums[i] != nums[i - 1]) {
					flag++;
					nums[flag] = nums[i];
					doubleflag = 0;
				}
				if (doubleflag == 1) {
					flag++;
					nums[flag] = nums[i];
				}
				// System.out.println(flag+" "+doubleflag);
				// System.out.println(Arrays.toString(nums));
			}
			return flag + 1;
		}

	}
}
