package Math;

import java.util.HashSet;

public class HappyNumber {
	public static void main(String args[]){
		int number = 58;
		//89, 1, 0
		System.out.println(isHappy(number));
	}
	public static boolean isHappy(int n) {
        //2 loops
        //out loop =1?
        HashSet<Integer> inSet = new HashSet<Integer>();
        //sometimes same loops occurs 89
        while(inSet.add(n)){
            int squsum =0;
            while(n>0){
                squsum += (n%10)*(n%10);
                n=n/10;
            }
            if(squsum==1)
                return true;
            else
                n = squsum;
            System.out.println(squsum);
        }
        return false;
    }
}
