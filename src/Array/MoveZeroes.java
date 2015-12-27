package Array;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String args[]){
		int aNums[] = {1,1,2,2,0,2,0,3,3,4};
		moveZeroes(aNums);
	}
	public static void moveZeroes(int[] nums) {
        int flag=0;
        int temp;
        for(int i=0; i<nums.length-flag; i++){
            while(nums[i]==0 && flag<nums.length-i){
                flag++;
                for(int j=i; j<nums.length-flag; j++){
                    temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            System.out.println(i+Arrays.toString(nums));
        }
       
    }
}
