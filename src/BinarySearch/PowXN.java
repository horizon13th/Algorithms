package BinarySearch;

public class PowXN {
	public static void main(String args[]){
		double root = 2.0;
		//-1,0,1,2
		int number = 16;
		//Integer.MINVALUE, 
		System.out.println(myPow(root,number));
	}
	public static double myPow(double x, int n) {
        if(n==0)
            return 1;
        if(n==1)
            return x;
        if(n>1){
            if(n%2==0)
                return myPow(x*x, n/2);
            else
                return myPow(x*x, n/2)*x;
                //x5=x4*x=(x2*x2)*(x2*x2)*x
        }
        else{
            if(n == Integer.MIN_VALUE) 
                return 1/(myPow(x, Integer.MAX_VALUE)*x);
                //consider the overflow
            return 1/myPow(x,-n);
        }
    }
}
