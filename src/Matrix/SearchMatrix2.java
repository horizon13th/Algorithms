package Matrix;

public class SearchMatrix2 {
	public static void main(String args[]) {
		int[][] number = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 },
				{ 23, 30, 34, 50 } };
		System.out.println(searchMatrix(number, 3));
	}
	 public static boolean searchMatrix(int[][] matrix, int target) {
	        int rowNum=matrix.length, colNum=matrix[0].length;
	        int i=0, j=colNum-1;
	        while(i<rowNum&&j>=0){
	            if(matrix[i][j]==target)    return true;
	            else if(matrix[i][j]<target)    i++;
	            else    j--;
	        }
	        return false;
	    }
}
