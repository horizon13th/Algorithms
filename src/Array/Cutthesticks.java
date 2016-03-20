package Array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Cutthesticks {
	public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sticks = new int[n];
		for(int i=0; i<n; i++){
			sticks[i]= sc.nextInt();
		}
        cutSticks(sticks);
    }
    public static void cutSticks(int[] sticks){
        int count = 0;
        System.out.println(sticks.length-count);
        for(int i=0; i<sticks.length; i++){
            int min = calMin(sticks);
            count = 0;
            for(int j=0; j<sticks.length; j++){
                if(sticks[j]>=min)
                    sticks[j]-=min;
                if(sticks[j]<=0)
                    count++;
            }
            if(sticks.length-count!=0)
            	System.out.println(sticks.length-count);
        }
        
        
    }
    public static int calMin(int[] sticks){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<sticks.length; i++){
            if(sticks[i]<min && sticks[i]>0)
                min = sticks[i];
        }
        return min;
    }
}
