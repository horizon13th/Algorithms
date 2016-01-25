package String;

public class ValidNumber {
	public static void main(String args[]) {
		String str = "-1.";
		System.out.println(isNumber(str));
	}

	public static boolean isNumber(String s) {
		s = s.trim();
		boolean checkPoint = false;
		boolean checkE = false;
		boolean checkNum = false;
		boolean checkNumAfterE = true;
		for (int i = 0; i < s.length(); i++) {
			// 0-9
			if (Character.isDigit(s.charAt(i))) {
				checkNum = true;
				checkNumAfterE = true;
			}
			// . is valid only if there did not exist 'e' or '.' before
			else if (s.charAt(i) == '.') {
				if (checkE || checkPoint)
					return false;
				checkPoint = true;
			}
			// e is valid only if there did not exist 'e' before 12.5e3
			else if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
				if (checkE || !checkNum)
					return false;
				checkNumAfterE = false;
				checkE = true;
			}
			// +/- is valid only if i=0 or after e
			else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
				if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
					return false;
			} else
				return false;
		}
		return checkNum && checkNumAfterE;
	}

}
