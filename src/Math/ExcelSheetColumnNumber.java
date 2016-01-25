package Math;

public class ExcelSheetColumnNumber {
	public static void main(String args[]) {
		String excel = new String("AB");
		System.out.println(titleToNumber(excel));
		// Input number
	}

	// public static int titleToNumber(String s) {
	// int result = 0;
	// for(int i=s.length()-1; i>=0; i--){
	// result= result + (s.charAt(i)-'A'+1)* (int)Math.pow(26,s.length()-i-1);
	// System.out.println(result);
	// }
	// return result;
	// }
	public static int titleToNumber(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result = result * 26 + s.charAt(i) - 'A' + 1; // 123:0*10+1;1*10+2,12*10+3
			System.out.println(result);
		}
		return result;
	}
}
