package Hash;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Map.Entry;

public class FindFirstNonrepeatedCharacter {
	public static void main(String []args){
		System.out.println(find("leetcodeleetco"));
	}
	public static char find(String s){
		char res=s.charAt(0);
		HashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
		for(int i=0; i<s.length(); i++){
			if(hm.containsKey(s.charAt(i)))
				hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
			else
				hm.put(s.charAt(i), 1);
		}
		for(Entry<Character, Integer> e: hm.entrySet()){
			if(Objects.equals(e.getValue(), 1)){
				res = e.getKey();
				break;
			}
		}
		return res;
	}
}
