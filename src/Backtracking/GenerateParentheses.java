package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public static void main(String []args){
		System.out.println(generateParenthesis(5));
	}
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        if(n==0)
            return res;
        String str = "";
        helper(res, str, 0, 0, n);
        return res;
    }
    public static void helper(List<String>res, String str, int left, int right, int n){
        if(right>left)
            return;
        if(left==n && right==n){
            res.add(str);
            return;
        }
        if(left<n){
            helper(res, str+"(", left+1, right, n);
        }
        if(right<n){
            helper(res, str+")", left, right+1, n);
        }
    }
}
