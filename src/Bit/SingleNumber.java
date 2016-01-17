package Bit;

public class SingleNumber {
	public static void main(String args[]){
		int[] number = {1,2,3,3,2,1,5};
		//0,1,2
		System.out.println(singleNumber(number));
	}
	public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++){
                result= result^nums[i];
        }
        return result;
    }
}
