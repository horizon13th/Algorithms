package String;

public class StringtoIntegerAtoi {
	public static void main(String args[]) {
		String str = "-1";
		System.out.println(myAtoi(str));
	}

	public static int myAtoi(String str) {
		int index = 0, sign = 1;
		int result = 0;

		// Remove Spaces
		str = str.trim();

		// Empty String
		if (str.length() == 0)
			return 0;

		// record sign
		if (str.charAt(index) == '+' || str.charAt(index) == '-') {
			sign = str.charAt(index) == '+' ? 1 : -1;
			index++;
		}
		while (index < str.length()) {
			if (!Character.isDigit(str.charAt(index)))
				break;
			// when meet special punctuation, break
			int digit = str.charAt(index) - '0';
			if (result > (Integer.MAX_VALUE - digit) / 10) {
				result = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
				return result;
			}
			result = result * 10 + digit;
			index++;
		}
		return sign * result;
	}
}
