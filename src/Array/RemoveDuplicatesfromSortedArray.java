package Array;

public class RemoveDuplicatesfromSortedArray {
	public static void main(String args[]) {
		int aNums[] = { 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(aNums));
	}

	public static int removeDuplicates(int[] nums) {
		int flag = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[flag] = nums[i];
				flag++;
			}
		}
		return flag;
	}
}
