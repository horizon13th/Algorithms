package Math;

public class HouseRobber {
	public static void main(String args[]) {
		int[] n = { 3, 2, 1, 4 };
		System.out.println(rob(n));
	}

	public static int rob(int[] nums) {
		int n = 0;
		int y = 0;
		int temp;

		for (int i = 0; i < nums.length; i++) {
			temp = n;
			n = Math.max(y, n);
			y = temp + nums[i];
			System.out.println(y + "," + n);
		}
		return Math.max(y, n);
	}
	// 2,1,1,2
	// 2 Y-2, N-Max(0,0)=0
	// 1 Y-N+1=0+1=1, N-Max(2,0)=2
	// 1 Y-N+1=2+1=3, N-Max(1,2)=2
	// 2 Y-N+2=2+2=4, N-Max(2,3)=3
}
