package Array;

import java.util.Arrays;

public class PlusOne {
	public static void main(String args[]){
		int aNums[] = {1,1,9,9};
		System.out.println(Arrays.toString(plusOne(aNums)));
	}
	public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)//the condition should be i>=0 not i>0, note the 0 case
        {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0]=1;
        return newDigits;
    }
}
