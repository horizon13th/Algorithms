package BinarySearch;

public class DivideTwoIntegers {
	public static void main(String args[]){
		int number1 = 16, number2=4;
		System.out.println(divide(number1,number2));
	}
	public static int divide(int dividend, int divisor) {
		if(dividend==Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;
		//The overflow case
        Boolean neg = false;
        if((dividend<0&&divisor>0)||(dividend>0&&divisor<0))
            neg = true;
        long dd = Math.abs((long)dividend);
        long ds = Math.abs((long)divisor);
       
        int result=0;
        while(dd>=ds){
            int count=0;
            while(dd>=(ds<<count)){
                count++;
                //System.out.println((ds<<count));
            }
            result+=1<<(count-1);
            dd-=ds<<(count-1);
            //System.out.println(dd+","+count+","+result);
        }
        return neg==true?-result:result;
    }
}
