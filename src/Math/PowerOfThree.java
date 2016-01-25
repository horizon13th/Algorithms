package Math;

public class PowerOfThree {
	public static void main(String args[]) {
		int number = 9;
		// 0,1,3
		System.out.println(isPowerOfThree(number));
	}

	public static boolean isPowerOfThree(int n) {
		int mod;
		while (n > 0) {
			if (n == 1)
				return true; // The condition of 1 need to be judge first
			mod = n % 3; // mod first, then divide
			n = n / 3;
			if (mod != 0)
				return false;
			System.out.println(n);
		}
		return false;
	}

	public static boolean isPowerOfThree1(int n) {
		return n > 0 && Math.pow(3, 19) % n == 0;
		// 3 power 19 is the largest 3 power in integer range
	}
}
