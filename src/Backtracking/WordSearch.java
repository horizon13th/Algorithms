package Backtracking;

public class WordSearch {
	public static void main(String args[]) {
		String str = new String();
		str = "121";
		char[][] board = {{'1','2'},{'2','1'}};
		System.out.println(exist(board,str));
	}
	public static boolean exist(char[][] board, String word) {
        if(board==null||board.length==0||word.length()==0||word==null)
            return false;
        int m = board.length;
        int n = board[0].length;
        boolean[][] visit = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(helper(visit, board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }
    public static boolean helper(boolean[][] visit, char[][] board, String word, int i, int j, int pos){
        if(pos==word.length())
            return true;
        if(i<0||i>=board.length||j<0||j>=board[0].length||word.charAt(pos)!=board[i][j]||visit[i][j])
            return false;
        visit[i][j]=true;
        if(helper(visit,board, word, i+1, j, pos+1)||helper(visit,board, word, i-1, j, pos+1)||helper(visit,board, word, i, j+1, pos+1)||helper(visit,board, word, i, j-1, pos+1))  return true;
        visit[i][j]=false;
        return false;
    }
}
