package String;

import java.util.HashMap;

public class RomantoInteger {
	public static void main(String args[]){
		String number = "XXI";
		System.out.println(romanToInt(number));
	}
	public static int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int result=0;
        for(int i=s.length()-1;i>=0;i--){
            if(result < hm.get(s.charAt(i)) || hm.get(s.charAt(i))==hm.get(s.charAt(i+1)))
                result+=hm.get(s.charAt(i));
            else
                result-=hm.get(s.charAt(i));
            //System.out.println(result);
        }
        return result;
    }
}
