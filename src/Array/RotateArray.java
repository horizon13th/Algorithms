package Array;

import java.util.Arrays;

public class RotateArray {
	public static void main(String args[]){
		int[] numbers = new int[]{1,2};
		rotate(numbers,2);
	}
	public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k==0||nums.length<=1)
            return;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k,nums.length-1);
    }
    public static void reverse(int[] nums, int begin, int end){
        int temp;
        while(begin<end){
            temp=nums[begin];
            nums[begin]=nums[end];
            nums[end]=temp;
            begin++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
