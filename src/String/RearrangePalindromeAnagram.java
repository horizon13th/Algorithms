package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RearrangePalindromeAnagram {
	public static void main(String []args){
		System.out.println(rearrange("00lee"));
	}
	public static boolean rearrange(String str){
		if(str.length()==0|| str.length()==1)
			return true;
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++){
			if(hm.containsKey(str.charAt(i)))
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			else
				hm.put(str.charAt(i),1);
		}
		int oddNum = 0;
		for(Entry<Character, Integer> e : hm.entrySet()){
			if(e.getValue()%2==1)
				oddNum++;
		}
		if (oddNum>1)
			return false;
		else
			return true;
	}
}
