package BinarySearch;

public class FirstBadVersion {
	public static void main(String args[]) {
		int number = 3;
		System.out.println(firstBadVersion(number));
	}

	public static int firstBadVersion(int n) {
		// find the first bad version! scroll from left
		int start = 1, end = n;
		int mid = start;
		while (start < end) {
			mid = start + (end - start) / 2; // override if mid =(start+end)/2
			System.out.println(mid + "," + start + "," + end);
			if (isBadVersion(mid) != true)
				start = mid + 1;
			else
				end = mid;// end!=mid-1 because end may be the fBV
		}
		return start;
		// start==end
	}

	public static boolean isBadVersion(int n) {
		if (n >= 2)
			return true;
		else
			return false;
	}
}
