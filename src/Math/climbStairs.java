package Math;

public class climbStairs {
	public static void main(String args[]){
		System.out.println(climbStair(4));
		//Input number
	}
	public static int climbStair(int n) {
		int[] result = new int[n+1];
        for(int i=0; i<result.length; i++){
            if(0<=i && i <=2)
                result[i]=i;
            else
                result[i]=result[i-1]+result[i-2];
        }
        return result[n];
    }
}
