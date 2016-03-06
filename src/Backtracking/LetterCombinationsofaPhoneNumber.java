package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
	public static void main(String[] args) {
		System.out.println(letterCombinations(""));
	}

	public static List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<String>();
		if (digits.length()==0)
			return res;
		char[][] letter = { {},// 0
				{},// 1
				{ 'a', 'b', 'c' },// 2
				{ 'd', 'e', 'f' },// 3
				{ 'g', 'h', 'i' },// 4
				{ 'j', 'k', 'l' },// 5
				{ 'm', 'n', 'o' },// 6
				{ 'p', 'q', 'r', 's' },// 7
				{ 't', 'u', 'v' },// 8
				{ 'w', 'x', 'y', 'z' },// 9
		};
		String line = new String();
		helper(res, letter, digits, 0, line);
		return res;
	}
	public static void helper(List<String>res, char[][]letter, String digits, int pos, String line){
		if(line.length()==digits.length()){
			res.add(line);
	        return;
		}
		int num = Integer.parseInt(digits.charAt(pos)+"");
		for(int i=0; i<letter[num].length; i++){
			line = line + letter[num][i];
			helper(res, letter, digits, pos+1, line);
			line = line.substring(0,line.length()-1);
		}
	}
}
