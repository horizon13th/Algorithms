package Math;

public class PalindromeNumber {
	public static void main(String args[]) {
		int number = 121;
		System.out.println(isPalindrome(number));
	}

	public static boolean isPalindrome(int x) {
		if (x >= 0 && x < Integer.MAX_VALUE) {
			String num = new String(x + "");

			int begin = 0;
			int end = num.length() - 1;

			while (begin < end) {
				if (num.charAt(begin) != num.charAt(end)) {
					return false;
				}
				begin++;
				end--;
			}
		} else
			return false;
		return true;
	}
}
