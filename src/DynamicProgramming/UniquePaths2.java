package DynamicProgramming;

public class UniquePaths2 {
	public static void main(String args[]) {
		int[][] obs = {{0,0},{1,0}};
		System.out.println(uniquePathsWithObstacles(obs));
	}
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid==null)
            return 0;
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] res = new int[m][n];
        res[0][0]= obstacleGrid[0][0]==1? 0:1;
        for(int i=1; i<m; i++){
            if(obstacleGrid[i][0]==1)
                res[i][0]=0;
            else
                res[i][0]=res[i-1][0];
        }
        
        for(int j=1; j<n; j++){
            if(obstacleGrid[0][j]==1)
                res[0][j]=0;
            else
                res[0][j]=res[0][j-1];
        }
        
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(obstacleGrid[i][j]==1)
                    res[i][j]=0;
                else
                    res[i][j]=res[i-1][j]+res[i][j-1];
            }
        }
        return res[m-1][n-1];
            
    }
}
