package Bit;

public class Numberof1Bits {
	public static void main(String args[]) {
		int number = Integer.MAX_VALUE+1;
		// 0,1,2
		System.out.println(hammingWeight(number));
	}

	public static int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			if ((n & 1) == 1)
				count++;
			n = n >>> 1;
			// when n=n>>1, the results goes wrong
			// because in Java, when >> a negative number
			// the negative sign will not change and 1 will be added to the left
			// >>> means not only right shift but also add 0 on the left
		}
		return count;
	}
}
