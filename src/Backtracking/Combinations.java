package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	public static void main(String[] args) {
		System.out.println(combine(5,3));
	}
	public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(n==0 || k==0)
            return res;
        List<Integer> line = new ArrayList<Integer>();
        helper(res, line, n, k, 1);
        return res;
    }
    public static void helper(List<List<Integer>> res, List<Integer> line, int n, int k, int pos){
        if(line.size()==k){
            res.add(new ArrayList(line));
            return;
        }
        for(int i=pos; i<=n; i++){
            line.add(i);
            helper(res, line, n, k, i+1);
            line.remove(line.size()-1);
        }
    }
}
