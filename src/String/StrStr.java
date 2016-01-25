package String;

public class StrStr {
	public static void main(String args[]) {
		String[] number = new String[] { "121", "2" };
		System.out.println(strStr(number[0], number[1]));
	}

	public static int strStr(String haystack, String needle) {
		if (needle.length() == 0)
			return 0;
		for (int i = 0; i <= (haystack.length() - needle.length()); i++) {
			for (int j = 0; j <= needle.length(); j++) {
				if (j == needle.length())
					return i;
				if (needle.charAt(j) != haystack.charAt(i + j))
					break;
				// System.out.println(i+""+j);
			}

		}
		return -1;
	}
}
