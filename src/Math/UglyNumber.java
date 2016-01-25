package Math;

public class UglyNumber {
	public static void main(String args[]) {
		int number = 30;
		// 89, 1, 0
		System.out.println(isUgly(number));
	}

	public static boolean isUgly(int num) {
		num = modnum(num, 2);
		num = modnum(num, 3);
		num = modnum(num, 5);
		return (num == 1);
	}

	public static int modnum(int num, int div) {
		while (num % div == 0) {
			num = num / div;
		}
		return num;
	}
}
