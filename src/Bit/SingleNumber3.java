package Bit;

import java.util.Arrays;

public class SingleNumber3 {
	public static void main(String args[]) {
		int[] number = { 1, 2, 10, 3, 3, 2, 1, 20 };
		// 0,1,2
		System.out.println(Arrays.toString(singleNumber(number)));
	}

	public static int[] singleNumber(int[] nums) {
		int[] result = new int[2];
		int diff = 0;
		for (int num : nums) {
			diff = diff ^ num;
		}
		// System.out.println(Integer.toBinaryString(diff));
		diff &= -diff;
		// System.out.println(Integer.toBinaryString(diff));

		for (int num : nums) {
			if ((diff & num) != 0)
				result[0] = result[0] ^ num;
			else
				result[1] = result[1] ^ num;
		}
		return result;
	}
}
