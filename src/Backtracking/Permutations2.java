package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2 };
		System.out.println(permuteUnique(nums));
	}

	public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length==0)
            return res;
        List<Integer> line = new ArrayList<Integer>();
        boolean[] visit = new boolean[nums.length]; 
        Arrays.sort(nums);
        helper(visit, res, line, nums, 0);
        return res;
    }
    public static void helper(boolean[] visit, List<List<Integer>> res, List<Integer> line, int[] nums, int pos){
        if(line.size() == nums.length){
            res.add(new ArrayList<Integer>(line));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!visit[i]){
                if (i > 0 && nums[i] == nums[i-1] && visit[i-1])
                    return;
                line.add(nums[i]);
                visit[i]=true;
                helper(visit, res, line, nums, pos+1);
                line.remove(line.size()-1);
                visit[i]=false;
            }
        }
    }
}
