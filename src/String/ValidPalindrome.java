package String;

public class ValidPalindrome {
	public static void main(String args[]) {
		String number = "123@！3！·21";
		System.out.println(isPalindrome(number));
	}

	public static boolean isPalindrome(String s) {
		// Uses the idea of two pointers
		s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		if (s.length() == 0)
			return true;
		int begin = 0;
		int end = s.length() - 1;
		while (begin < end) {
			if (s.charAt(begin) != s.charAt(end))
				return false;
			begin++;
			end--;
		}
		return true;
	}

	public static boolean isPalindrome1(String s) {
		// Another method use the idea of reverse
		s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString().equals(s);
	}
}
