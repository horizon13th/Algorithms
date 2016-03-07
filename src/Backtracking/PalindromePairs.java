package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePairs {
	public static void main(String []args){
		String[] strs = {"abcd","dcba","lls","s","sssll"};
		System.out.println(palindromePairs(strs));
	}
	public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> line = new ArrayList<Integer>();
        boolean[] visit = new boolean[words.length];
        if(words.length == 0)
            return res;
        helper(res, line, words, "", 0, visit);
        return res;
    }
    public static void helper(List<List<Integer>> res, List<Integer> line, String[] words, String word, int pos, boolean[] visit){
        if(pos == 2){
        	if(isPalidrome(word)){
        		res.add(new ArrayList(line));
        		return;
        	}
        	else
        		return;
        }
        for(int i=0; i<words.length; i++){
            if(i!= pos && visit[i]==true)
                continue;
            line.add(i);
            visit[i]=true;
            word = word + words[i];
            helper(res, line, words, word, pos+1, visit);
            word = word.substring(0, word.length()-words[i].length());
            line.remove(line.size()-1);
            visit[i]=false;
        }
        
    }
    public static boolean isPalidrome(String str){
        StringBuilder sb = new StringBuilder(str);
        String strrev = sb.reverse().toString();
        return strrev.equals(str);
    }
}
