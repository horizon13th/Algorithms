package Array;

public class BullsandCows {
	public static void main(String args[]) {
		String str1 = "1122";
		String str2 = "2221";
		System.out.println(getHint(str1, str2));
	}

	public static String getHint(String secret, String guess) {
		int a = 0, b = 0;
		int[] numS = new int[10];
		int[] numG = new int[10];
		for (int i = 0; i < secret.length(); i++) {
			if (secret.charAt(i) == guess.charAt(i))
				a++;
			else {
				numS[Character.getNumericValue(secret.charAt(i))]++;
				numG[Character.getNumericValue(guess.charAt(i))]++;
			}
		}
		for (int i = 0; i < 10; i++) {
			b = b + Math.min(numS[i], numG[i]);
		}
		return a + "A" + b + "B";
	}

}
