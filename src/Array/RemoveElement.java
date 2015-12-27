package Array;

public class RemoveElement {
	public static void main(String args[]){
		int aNums[] = {1,1,2,2,3,3,4};
		System.out.println(removeElement(aNums,2));
	}
	public static int removeElement(int[] nums, int val) {
        int flag =0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]!=val)
                nums[flag++]=nums[i];
        }
        return flag;
    }
}
