package String;

public class LongestPalindromicSubstring {
	public static void main(String args[]) {
		String str = new String();
		System.out.println(longestPalindrome(str));
	}
	public static String longestPalindrome(String s) {
        int count=0;
        String res=new String();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub = s.substring(i,j);
                //System.out.println(sub);
                if(isPalidrome(sub)&&sub.length()>count){
                    count=sub.length();
                    res=sub;
                    //System.out.println(res);
                }
            }
        }
        return res;
    }
    public static boolean isPalidrome(String s){
        StringBuffer sb = new StringBuffer(s);
        return sb.toString().equals(sb.reverse().toString());
    }
}
