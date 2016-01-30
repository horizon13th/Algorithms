package Matrix;

import java.util.Arrays;

public class SpiralMatrix2 {
	public static void main(String[] args) {
		int[][] r=generateMatrix(3);
		for(int i=0;i<r.length;i++)
			System.out.println(Arrays.toString(r[i]));
	}

	public static int[][] generateMatrix(int n) {
		int[][] result = new int[n][n];
		if (n == 0)
			return result;
		int level = n / 2;
		int flag = n % 2;
		int num = 1;
		for (int i = 0; i < level; i++) {
			for (int j = i; j < n - 1 - i; j++)
				result[i][j] = num++;
			for (int j = i; j < n - 1 - i; j++)
				result[j][n - i - 1] = num++;
			for (int j = n - i - 1; j > i; j--)
				result[n - 1 - i][j] = num++;
			for (int j = n - i - 1; j > i; j--)
				result[j][i] = num++;
		}
		if (flag == 1)
			result[level][level] = num++;
		return result;
	}
}
