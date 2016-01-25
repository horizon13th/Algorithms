package Math;

public class BulbSwitcher {
	public static void main(String args[]) {
		System.out.println(bulbSwitch(10));
		// Input number
	}

	public static int bulbSwitch(int n) {
		return (int) Math.sqrt(n);
		// Each number can be divided by even numbers except square numbers
		// 10=1*10,2*5, 4 div numbers
		// 4=1*4,2*2, 3 div numbers
		// only numbers with odd div numbers can stay on at last
		// just calculate the square numbers smaller than n
	}

}
