package Bit;

import java.util.Arrays;

public class SingleNumber2 {
	public static void main(String args[]) {
		// int[] number = {1,2,2,2};
		int[] number = { -2, -2, 1, 1, -3, 1, -3, -3, -4, -2 };
		System.out.println(singleNumber(number));
	}

	public static int singleNumber(int[] nums) {
		// in this array we have only one single number
		// express each number using 32-bit array int bit[32]
		// try to add all the numbers which appears 3 times
		// ex: 10001,10001,10001-->30003
		// each bit is mutiple of 3 or 0
		// so if there exists a single number
		// the bits expression of this single number only appear once
		// ex: 00101-->00101+30003=30104
		// some bits would be 3n+1 or 0+1
		// use mod3 to calculate each bit and find the number
		int[] bit = new int[32];
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = bit.length - 1; j >= 0; j--) {
				bit[j] = bit[j] + (1 & nums[i]);
				nums[i] = nums[i] >> 1;
			}
			System.out.println(Arrays.toString(bit));
		}
		for (int j = bit.length - 1; j >= 0; j--) {
			result += (bit[j] % 3) << (bit.length - 1 - j);
		}
		return result;
	}
}
