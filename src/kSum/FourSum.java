package kSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FourSum {
	public static void main(String args[]) {
		int[] numbers = new int[] { 1, 2, -3, 5, -7, -1 };
		System.out.println(fourSum(numbers, 1));
		// Input number
	}
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        HashSet<List<Integer>> hs =new HashSet<List<Integer>>();
       
        for(int i=0;i<nums.length;i++){//first number
        	for(int j=i+1;j<nums.length;j++){
        		int left=j+1, right=nums.length-1;
        		while(left<right){
        			int sum=nums[i]+nums[j]+nums[left]+nums[right];
        			if(sum==target){
        				List<Integer> rowResult = new ArrayList<Integer>();
        				rowResult=Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
        				if(!hs.contains(rowResult)){
        					result.add(rowResult);
        					hs.add(rowResult);
        				}
        				left++;
        				right--;
        			}
        			else if(sum<target)
        				left++;
        			else
        				right--;
        		}
        	}
        }
        return result;
    }
}
