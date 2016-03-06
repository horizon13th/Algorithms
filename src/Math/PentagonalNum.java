package Math;

import java.util.Arrays;

public class PentagonalNum {
	public static void main(String args[]) {
		System.out.println(Arrays.toString(pentagonal()));
	}
	public static int[] pentagonal(){
		boolean find=false;
		int i=0;
		int[] result = new int[2];
		while(find==false){
			i++;
			int left=i*(3*i-1)/2;
			for(int j=i-1;j>0;j--){
				int right=j*(3*j-1)/2;
				if(isPentagonal(left-right)&&isPentagonal(left+right)){
					result[0]=i;
					result[1]=j;
					find=true;
					return result;
				}
				//System.out.println(i+","+j);
			}
		}
		return result;
	}
	public static boolean isPentagonal(int num){
		double pen = (Math.sqrt(1+24*num)+1.0)/6.0;
		return pen == ((int)pen);
	}
}
