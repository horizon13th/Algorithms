package BinarySearch;

public class SqrtX {
	public static void main(String args[]) {
		int number = 16;
		System.out.println(mySqrt(number));
	}

	public static int mySqrt(int x) {
		if (x == 0)
			return 0;
		if (1 <= x && x <= 3)
			return 1;
		else {
			int start = 2;
			int end = x / 2;
			int result = start;
			while (start <= end) {
				int mid = start + (end - start) / 2;
				System.out.println(mid + "" + start + "" + end);
				if (mid == (x / mid))
					// mid*mid == x is wrong
					return mid;
				else if (mid < (x / mid)) {
					start = mid + 1;
					result = mid;
				} else {
					end = mid - 1;
				}
			}
			return result;
		}
	}
}
