package Hash;

import java.util.HashMap;

public class IsomorphicStrings {
	public static void main(String args[]){
		String str1 = "abba";
		String str2 = "caac";
		System.out.println(isIsomorphic(str1,str2));
	}
	public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) 
            return false;
        HashMap<Character,Character> st= new HashMap<Character,Character>();
        HashMap<Character,Character> ts= new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++){
            if(st.containsKey(s.charAt(i))&&st.get(s.charAt(i))!=t.charAt(i))
                return false;
            else
                st.put(s.charAt(i),t.charAt(i));
            if(ts.containsKey(t.charAt(i))&&ts.get(t.charAt(i))!=s.charAt(i))
                return false;
            else
                ts.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}
