package Hash;

import java.util.HashSet;

public class ValidSudoku {
	public static void main(String args[]){
		char[][] s = {{'.','8','7','6','5','4','3','2','1'},{'2','.','.','.','.','.','.','.','.'},{'3','.','.','.','.','.','.','.','.'},{'4','.','.','.','.','.','.','.','.'},{'5','.','.','.','.','.','.','.','.'},{'6','.','.','.','.','.','.','.','.'},{'7','.','.','.','.','.','.','.','.'},{'8','.','.','.','.','.','.','.','.'},{'9','.','.','.','.','.','.','.','.'}};
		System.out.println(isValidSudoku(s));
	}
	
	public static boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<String>();
        for(int i=0;i<9;++i){
            for(int j=0;j<9;++j){
                char num = board[i][j];
                if(num!='.'){
                    if(!hs.add(i+"row"+num)||!hs.add(j+"col"+num)||!hs.add(i/3+""+j/3+"sub"+num)){
                        System.out.println(num+""+i+""+j);
                        return false;
                    }
                }
                System.out.println(hs);
            }
        }
        return true;
    }
}
