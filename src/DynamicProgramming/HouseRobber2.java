package DynamicProgramming;

public class HouseRobber2 {
	public static void main(String args[]) {
		int[] n = { 3, 2, 1, 4 };
		System.out.println(rob(n));
	}

	public static int rob(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		return Math.max(rob(nums, 0, nums.length - 2),
				rob(nums, 1, nums.length - 1));
	}

	public static int rob(int[] nums, int begin, int end) {
		int preNo = 0;
		int preYes = 0;
		int No = 0;
		int Yes = 0;
		for (int i = begin; i <= end; i++) {
			No = Math.max(preYes, preNo);
			Yes = preNo + nums[i];
			preNo = No;
			preYes = Yes;
		}
		return Math.max(Yes, No);
	}
}
