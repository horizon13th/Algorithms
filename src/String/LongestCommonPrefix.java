package String;

public class LongestCommonPrefix {
	public static void main(String args[]) {
		String[] number = new String[] { "121", "12" };
		System.out.println(longestCommonPrefix(number));
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		String pre = strs[0];
		for (int i = 0; i < strs.length; i++) {
			while (strs[i].indexOf(pre) != 0) {// check if pre exists
				pre = pre.substring(0, pre.length() - 1);// substring 1 digit
															// from right
			}
		}
		return pre;
	}
}
