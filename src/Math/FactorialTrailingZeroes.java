package Math;

public class FactorialTrailingZeroes {
	public static void main(String args[]) {
		int num = 10;// 26
		System.out.println(trailingZeroes(num));
	}

	public static int trailingZeroes(int n) {
		return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
	}
}
