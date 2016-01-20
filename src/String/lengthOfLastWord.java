package String;

import java.util.Arrays;

public class lengthOfLastWord {
	public static void main(String args[]){
		String number = "XXI 999";
		System.out.println(lengthOfLastWord(number));
	}
	public static int lengthOfLastWord(String s) {
        s=s.trim();
        return s.length()-s.lastIndexOf(" ")-1;
    }
	public static int lengthOfLastWord1(String s){        
		 s=s.replace("\\s"," ").trim();
         if(s.equals(" "))
             return 0;
         String[] str = s.split(" ");
         System.out.println(Arrays.toString(str));
         return str[str.length-1].length();
	}
}
