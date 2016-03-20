package String;



public class ValidParentheses {
	public static void main(String args[]) {
		String str = "{[]}]]{}";
		System.out.println(isValid(str));
	}

	public static boolean isValid(String s) {
		int length = 0;
		while (s.length() != length) {
			length = s.length();
			s = s.replace("()", "");
			s = s.replace("[]", "");
			s = s.replace("{}", "");
		}
		return (s.length() == 0);
	}
}
