package String;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
	public static void main(String args[]) {
		String str1 = "111";
		Set<String> st = new HashSet<String>();
		st.add("1");
		System.out.println(wordBreak(str1, st));
	}
	public static boolean wordBreak(String s, Set<String> wordDict) {
        boolean word[] = new boolean[s.length()+1];
        word[0]=true;
        for(int i=0; i<=s.length(); i++){
            for(int j=0; j<i; j++){
                if(word[j]==true && wordDict.contains(s.substring(j,i))){
                    word[i]=true;
                    break;
                }
            }
        }
        return word[s.length()];
    }
}
