package Matrix;

import java.util.Arrays;

public class RotateImage {
	public static void main(String[] args) {
		int[][] s = { { 1, 2, 3 }, { 7, 5, 6 }, { 7, 8, 9 } };
		int[][] res = rotate(s);
		for(int i=0;i<res.length;i++)
			System.out.println(Arrays.toString(res[i]));
	}

	public static int[][] rotate(int[][] matrix) {
		if(matrix.length==0)
			return matrix;
		int level=matrix.length/2;
		int temp;
		for(int i=0;i<level;i++){
			for(int j=i;j<matrix.length-1-i;j++){
				temp=matrix[i][j];
				matrix[i][j]=matrix[matrix.length-j-1][i];
				matrix[matrix.length-j-1][i]=matrix[matrix.length-i-1][matrix[0].length-j-1];
				matrix[matrix.length-i-1][matrix[0].length-j-1]=matrix[j][matrix.length-1-i];
				matrix[j][matrix.length-1-i]=temp;
			}
		}
		return matrix;
	}
}
