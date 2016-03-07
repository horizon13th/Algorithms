package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public static void main(String []args){
		int[] nums = {1,2,3};
		System.out.println(combinationSum(nums,3));
	}
	public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> line = new ArrayList<Integer>();
        Arrays.sort(candidates);
        if(candidates.length==0)
            return res;
        helper(res, line, candidates, target, 0);
        return res;
    }
    public static void helper(List<List<Integer>> res, List<Integer> line, int[] candidates, int target, int pos){
        if(target<0)
            return;
        if(target==0){
            res.add(new ArrayList(line));
            return;
        }
        for(int i=pos; i<candidates.length;i++){
            line.add(candidates[i]);
            target-=candidates[i];
            helper(res, line, candidates, target, i);
            line.remove(line.size()-1);
            target+=candidates[i];
        }
    }
}
