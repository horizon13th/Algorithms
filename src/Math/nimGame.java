package Math;

public class nimGame {
	public static void main(String args[]){
		System.out.println(canWinNim(4));
	}
	public static boolean canWinNim(int n){
	        return ( n % 4 != 0);
	}
}
