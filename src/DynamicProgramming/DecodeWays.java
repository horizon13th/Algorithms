package DynamicProgramming;

public class DecodeWays {
	public static void main(String args[]) {
		String str1 = "111";
		System.out.println(numDecodings(str1));
	}
	public static int numDecodings(String s) {
        //corner case
        if(s.length()==0)
            return 0;
        
        //init
        int[] res = new int[s.length() + 1];
        res[0]=1;//only used in res[2] case
        
        if(validNum(s.substring(0,1)))
            res[1]=1;
        else
            res[1]=0;
            
        //dp
        for(int i=2; i<=s.length(); i++){
            if(validNum(s.substring(i-1,i)))
                res[i]+=res[i-1];
            if(validNum(s.substring(i-2,i)))
                res[i]+=res[i-2];
            //System.out.println(i+" "+res[i]);
        }
        
        //return 
        return res[s.length()];
    }
    public static boolean validNum(String s){
        if(s.charAt(0)=='0')
            return false;
        int num = Integer.parseInt(s);
        return (1<=num && num<=26);
    }
}
