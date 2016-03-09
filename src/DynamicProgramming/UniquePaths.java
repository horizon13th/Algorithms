package DynamicProgramming;

public class UniquePaths {
	public static void main(String args[]) {
		System.out.println(uniquePaths(5,7));
	}
	public static int uniquePaths(int m, int n) {
	    //init   
	    int path[][] = new int[m][n];
	    
	    for(int i=0; i<m; i++)
	        path[i][0]=1;
	    for(int j=0; j<n; j++)
	        path[0][j]=1;
	    
	    //dp cal all the paths on board
	    for(int i=1; i<m; i++){
	        for(int j=1; j<n; j++){
	            path[i][j]=path[i][j-1]+path[i-1][j];
	        }
	    }
	     
	    return path[m-1][n-1];
	    //return the path to [m-1][n-1]
	    }
}
