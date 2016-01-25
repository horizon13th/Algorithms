package Bit;

public class Numberof1Bits {
	public static void main(String args[]) {
		long number = 2147483647;
		// 0,1,2
		System.out.println(hammingWeight(number));
	}

	public static int hammingWeight(long n) {
		int count = 0;
		while (n != 0) {
			if ((n & 1) == 1)
				count++;
			n = n >>> 1;
			// when n=n>>1, the results goes wrong
		}
		return count;
	}
}
