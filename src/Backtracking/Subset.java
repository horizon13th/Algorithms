package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
	public void main(String []args){
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));
	}
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> line = new ArrayList<Integer>();
        if(nums.length==0)
            return res;
        Arrays.sort(nums);
        helper(res,line,0,nums);
        return res;
    }
    public static void helper(List<List<Integer>> res, List<Integer> line, int pos, int[] nums){
        res.add(new ArrayList<Integer>(line));
        for(int i=pos;i<nums.length;i++){
            line.add(nums[i]);
            helper(res, line, i+1, nums);
            line.remove(line.size()-1);
        }
    }
}
