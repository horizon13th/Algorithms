package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpatialMatrix {
	public static void main(String args[]) {
		int[][] s = { {1,2,3},{2,3,4},{3,4,5 }};
		System.out.println(spiralOrder(s));
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result=new ArrayList<Integer>(matrix[0].length*matrix.length);
		if(matrix==null||matrix.length==0||matrix[0].length==0)
			return result;
		
		int level=Math.min(matrix[0].length, matrix.length);
		int flag=level%2;
		level=level/2;
		
		for(int i=0;i<level;i++){
			for(int j=i;j<matrix[0].length-1-i;j++)
				result.add(matrix[i][j]);
			for(int j=i;j<matrix.length-1-i;j++)
				result.add(matrix[j][matrix[0].length-i-1]);
			for(int j=matrix[0].length-i-1;j>i;j--)
				result.add(matrix[matrix.length-i-1][j]);
			for(int j=matrix.length-i-1;j>i;j--)
				result.add(matrix[j][i]);
		}
		if(flag==1){
			if(matrix[0].length<matrix.length){
				for(int j=level;j<matrix.length-level;j++)
					result.add(matrix[j][level]);
			}
			else{
				for(int j=level;j<matrix[0].length-level;j++)
					result.add(matrix[level][j]);
			}	
		}
		return result;
	}
}
