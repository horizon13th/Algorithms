package Hash;

import java.util.HashMap;

/**
 * User hanqing
 * Date 6/13/2018
 * Leetcode 389
 */
public class FindTheDifference {
    public static void main(String[] args){
       String s="abcde";
       String t="abcdef";
       findTheDiff(s, t);
    }
    public static char findTheDiff(String s, String t){

        char result = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        //iterate the s string and use hashMap to record char, char's count
        for(int i=0; i<s.length(); i++){
            char tempC = s.charAt(i);
            if (hm.containsKey(tempC)){
                hm.put(tempC, hm.get(tempC)+1);
            }
            else {
                hm.put(tempC, 1);
            }
        }

        //iterate the t string and check
        //if exist, count-1 return -1; else return
        for(int j=0; j<t.length(); j++){
            char tempC = t.charAt(j);
            if(hm.containsKey(tempC)){
                hm.put(tempC, hm.get(tempC)-1);
                if(hm.get(tempC)<0){
                    result = tempC;
                }
            }
            else{
                result = tempC;
            }
        }
        System.out.println(result);
        return result;
    }


}
