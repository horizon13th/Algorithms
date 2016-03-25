package String;

public class ReverseWordsInaString {
	 public static void main(String []args){
		 System.out.println(reverseWords("a big apple"));
	 }
	 public static String reverseWords(String s) {
		 	s=s.trim();
	        String[] str = s.split("\\s+");
	        StringBuilder sb = new StringBuilder();
	        for(int i=str.length-1; i>=0; i--){
	            sb.append(str[i]);
	            if(i!=0)
	                sb.append(" ");
	        }
	        return sb.toString();
	    }
}
