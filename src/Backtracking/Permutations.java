package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(permute(nums));
	}
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length==0)
            return res;
        List<Integer> line = new ArrayList<Integer>();
        helper(res, line, nums, 0);
        return res;
    }
    public static void helper(List<List<Integer>> res, List<Integer> line, int[] nums, int pos){
        if(pos == nums.length){
            res.add(new ArrayList<Integer>(line));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(line.contains(nums[i]))
                continue;
            line.add(nums[i]);
            helper(res, line, nums, pos+1);
            line.remove(line.size()-1);
        }
    }
}
