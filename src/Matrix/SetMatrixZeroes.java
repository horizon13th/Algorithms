package Matrix;

import java.util.Arrays;

public class SetMatrixZeroes {
	public static void main(String[] args) {
		int[][] s ={{0,2,3},{7,0,6},{7,8,9}};
		int[][] res =setZeroes(s);
		for(int i=0;i<s.length;i++)
			System.out.println(Arrays.toString(res[i]));
	}
	public static int[][] setZeroes(int[][] matrix) {
        boolean row=false, col=false;
        for(int i=0;i<matrix[0].length;i++)
        	if(matrix[0][i]==0)	row=true;
        for(int i=0;i<matrix.length;i++)
        	if(matrix[i][0]==0)	col=true;
        for(int i=1;i<matrix.length;i++){
        	for(int j=1;j<matrix[0].length;j++){
        		if(matrix[i][j]==0){
        			matrix[i][0]=0;
        			matrix[0][j]=0;
        		}	
        	}
        }
        for(int i=1;i<matrix.length;i++){
        	for(int j=1;j<matrix[0].length;j++){
        		if(matrix[i][0]==0||matrix[0][j]==0){
        			matrix[i][j]=0;
        		}	
        	}
        }
        if(row){
        	for(int i=0;i<matrix[0].length;i++)
        		matrix[0][i]=0;
        }
        if(col){
        	for(int i=0;i<matrix.length;i++)
        		matrix[i][0]=0;
        }	
		return matrix;
    }
}
