package String;

public class LongestPalindromicSubstring {
	public static void main(String args[]) {
		String str = new String();
		str = "11223322";
		System.out.println(longestPalindrome(str));
	}
	private static int count=1;
    private static int begin=0;
    public static String longestPalindrome(String s) {
    	if(s.length()==0||s.length()==1)
    		return s;
        for(int i=0; i<s.length();i++){
            find(i,0,s);
            find(i,1,s);
            //System.out.println(begin+""+s.substring(begin,begin+count));
        }
        return s.substring(begin,begin+count);
    }
    public static void find(int i, int shift, String s){
        int left = i;
        int right = i + shift;
        while(left >=0 && right <s.length() && s.charAt(left)==s.charAt(right)){
            if(count<right-left+1){
                begin = left;
                count = right-left+1;
            }
            left--;
            right++;
        }
    }
}
