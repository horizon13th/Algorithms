package Math;

public class ExcelSheetColumnTitle {
	public static void main(String args[]){
		int excel = 52;//26
		System.out.println(convertToTitle(excel));
	}
	public static String convertToTitle(int n) {
		String title = new String();
		int rem = 0;
		while(n!=0){
			n=n-1;
			rem = n%26;
			n=n/26;
			char c = (char)('A'+rem);
			title = c+title;
		}
		return title;
    }
}
