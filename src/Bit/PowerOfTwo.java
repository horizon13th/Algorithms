package Bit;

public class PowerOfTwo {
	public static void main(String args[]) {
		int number = 16;
		// 0,1,2
		System.out.println(isPowerOfTwo(number));
	}

	public static boolean isPowerOfTwo(int n) {
		int result = n & (n - 1);
		// The binary representation of a power-of-two is a 1 followed only by
		// 0s.
		// In such a case, n − 1 generates a binary number where the 1s turn
		// into 0s and the former 0s turn into 1s.
		// For example, 8 = 1000b and 8 − 1 = 7 = 0111b.
		return (n > 0) && (result == 0);
	}
	// public static boolean isPowerOfTwo(int n) {
	// int mod;
	// while(n>0){
	// if(n==1)
	// return true; //The condition of 1 need to be judge first
	// mod = n%2; //mod first, then divide
	// n=n/2;
	// if(mod!=0)
	// return false;
	// System.out.println(n);
	// }
	// return false;
	// }
}
