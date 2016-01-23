package Math;

import java.util.Arrays;

public class CountPrimes {
	public static void main(String args[]){
		System.out.println(countPrimes(5));
	}
	 public static int countPrimes(int n) {
		 boolean[] noPrime = new boolean[n];
		 //note that when a boolean variable is initialized, its default value is false
		 int count=0;
		 for(int i=2;i<n;i++){//1 is not a prime number
			 if(noPrime[i]==false)	count++;
			 for(int j=2;i*j<n;j++){//try to multi 2 numbers to make all the numbers below n labled as nonprime
				 noPrime[i*j]=true;
			 }
			 System.out.println(i+""+noPrime[i]);
		 }
		 return count;
	 }
}
