package Hash;

import java.util.Arrays;
import java.util.HashMap;

public class WordPattern {
	public static void main(String args[]){
		String str1 = "abba";
		String str2 = "cat dog dog cat";
		System.out.println(wordPattern(str1,str2));
	}
	 public static boolean wordPattern(String pattern, String str) {
	        String[] strArray = str.split("\\s+");
	        System.out.println(Arrays.toString(strArray));
	        HashMap<Character, String> Pword = new HashMap<Character, String>();
	        HashMap<String,Character> wordP = new HashMap<String,Character>();
	        if(strArray.length!=pattern.length())
	            return false;
	        for(int i=0; i<pattern.length();i++){
	        	if( wordP.containsKey(strArray[i]) && (wordP.get(strArray[i]) != pattern.charAt(i))){
	                System.out.println(i+"2");
	                return false;
	            }
	            else{
	            	wordP.put(strArray[i],pattern.charAt(i));}
	            if( Pword.containsKey(pattern.charAt(i)) && !Pword.get(pattern.charAt(i)).equals(strArray[i]) ){
	                System.out.println(i+"1");
	                return false;
	            }
	            else{
	                Pword.put(pattern.charAt(i),strArray[i]);}
	            
	            
	        }
	        return true;
	    }

}
