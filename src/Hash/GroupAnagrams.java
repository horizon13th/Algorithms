package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class GroupAnagrams {
	public static void main(String args[]) {
		String[] ana = {"aba","aab","gyj"};
		System.out.println(groupAnagrams(ana));
		// Input number
	}
	public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
        String tempWord=new String();
        for(int i=0;i<strs.length;i++){
        	char[] word = strs[i].toCharArray();
        	Arrays.sort(word);
            tempWord= String.valueOf(word);
            if(!hm.containsKey(tempWord)){
                List<String> row =new ArrayList<String>();
                row.add(strs[i]);
                hm.put(tempWord,row);
            }
            else{
                hm.get(tempWord).add(strs[i]);
            }
        }
        for(List<String> value : hm.values()){
        	Collections.sort(value);
        	res.add(value);
        }
        return res;
    }
}
