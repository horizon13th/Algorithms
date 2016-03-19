package DynamicProgramming;

import java.util.Arrays;

public class CountingBits {
	public static void main(String []args){
		System.out.println(Arrays.toString(countBits(20)));
	}
	public static int[] countBits(int num) {
        int power2 = cal2power(num);
        int[] res = new int[(int) Math.pow(2,power2)];
        System.out.println(power2);
        res[0]=0;
        if(num==0)
            return res;
        for(int i=0; i<power2; i++){
            int begin = (int) Math.pow(2,i);
            int end = (int) Math.pow(2,i+1);
            for(int j=begin; j<end; j++){
                res[j]=res[j-begin]+1;
            }
        }
        return Arrays.copyOfRange(res, 0, num);
    }
    public static int cal2power(int num){
        int count = 0;
        while(num!=0){
            num/=2;
            count++;
        }
        return count;
    }
}
