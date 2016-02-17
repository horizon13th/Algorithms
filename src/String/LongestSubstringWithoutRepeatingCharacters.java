package String;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String args[]) {
		String[] number = new String[] { "121345", "12" };
		System.out.println(lengthOfLongestSubstring(number[0]));
	}
	public static int lengthOfLongestSubstring(String s) {
		 int max=0;
	        for(int i=0;i<s.length();i++){
	            HashSet<Character> hs=new HashSet<Character>();
	            int count=0;
	            while((i+count<s.length())&&(hs.add(s.charAt(i+count)))){
	                count++;
	            }
	            max=(max<count)?count:max;
	        }
	        return max;
    }
}
