package Array;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
	public static void main(String args[]) {
		int[] numbers = new int[] { -1, 3, -4, 5, 1, -6, 2, 1 };
		System.out.println(Arrays.toString(productExceptSelf(numbers)));
	}
	public static int[] productExceptSelf(int[] nums) {
		int len=nums.length;
        int productL[]=new int[len];
        int productR[]=new int[len];
        int result[]=new int[len];
        productL[0]=nums[0];
        productR[len-1]=nums[len-1];
        for(int i=1;i<len;i++)
            productL[i]=productL[i-1]*nums[i];
        for(int i=len-2;i>0;i--)
            productR[i]=productR[i+1]*nums[i];
        result[0]=productR[1];
        result[len-1]=productL[len-1-1];
        for(int i=1;i<len-1;i++)
            result[i]=productL[i-1]*productR[i+1];
        return result;
    }

}
