package Bit;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public static void main(String args[]) {
		System.out.println(grayCode(5));
	}
	 public static List<Integer> grayCode(int n) {
	        List<Integer> res = new ArrayList<Integer>();
	        res.add(0);
	        
	        for(int i=0; i<n; i++){
	        int add1 = 1<<i;
	            for(int j=res.size()-1; j>=0; j--){
	                res.add(res.get(j)+add1);
	            }
	        }
	        return res;
	    }
}
