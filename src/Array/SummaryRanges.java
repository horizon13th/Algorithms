package Array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	public static void main(String args[]){
		int[] numbers = new int[]{1,2,3,5,6,9};
		System.out.println(summaryRanges(numbers));
	}
	public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> sum = new ArrayList<String>();
        if(nums.length==0)
            return sum;
        if(nums.length==1)
            sum.add(nums[0]+"");
        int front = nums[0];
        int end;
        int flag=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]+1){
                end = nums[i-1];
                if(flag==0)
                    sum.add(end+"");
                else
                    sum.add(front+"->"+end);
                front = nums[i];
                flag=0;
            }
            else{
                flag++;
            }
            if(i==nums.length-1){
                end = nums[i];
                if(flag==0)
                    sum.add(end+"");
                else
                    sum.add(front+"->"+end);
            }
        }
        return sum;
    }
}
