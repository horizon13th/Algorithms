package Math;

public class MissingNumber {
	public static void main(String args[]) {
		int[] numbers = new int[] { 0, 1, 2, 3, 5, 6, 7 };
		System.out.println(missingNumber(numbers));
		// Input number
	}
	public static int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        int res = n*(n+1)/2;
        return res-sum;
    }
}
