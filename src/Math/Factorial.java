package Math;

import java.util.Scanner;

public class Factorial {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String line;
		while(sc.hasNextLine() && ! (line = sc.nextLine()).equals("")){
			if(line.charAt(0)=='-')
				System.out.println("-");
			else{
				System.out.println(fac(Long.parseLong(line)));
			}
		}
	}
	public static long fac(long n){
		if(n == 1)
			return 1;
		return n * fac(n-1);
	}
//		for(int i=0; i<n; i++){
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println(a+b);
//		}
		//System.out.println(rearrange("00lee"));
	
}
