package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
	public void main(String []args){
		int[] nums = {1,2,3,3,4};
		System.out.println(subsetsWithDup(nums));
	}
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> line = new ArrayList<Integer>();
        //HashSet<List<Integer>> hs = new HashSet<List<Integer>>();
        if(nums==null || nums.length==0)
            return res;
        Arrays.sort(nums);
        helper(res,line,nums,0);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> line, int[] nums, int pos){
        //if(!res.contains(line)){
            res.add(new ArrayList<Integer>(line));
            for(int i=pos; i<nums.length;i++){
                if(i!=pos && nums[i]==nums[i-1])
                    continue;
                line.add(nums[i]);
                helper(res, line, nums, i+1);
                line.remove(line.size()-1);
            }
        //}
    }
}
