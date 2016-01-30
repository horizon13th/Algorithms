package Matrix;

public class SearchMatrix {
	public static void main(String args[]) {
		int[][] number = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 },
				{ 23, 30, 34, 50 } };
		System.out.println(searchMatrix(number, 3));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0)
			return false;
		int column = matrix[0].length;
		int row = matrix.length;
		int start = 0;
		int end = column * row - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (matrix[mid / column][mid % column] == target)
				return true;
			else if (matrix[mid / column][mid % column] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}
}
