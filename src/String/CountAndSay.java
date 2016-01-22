package String;

public class CountAndSay {
	
	public static void main(String args[]){
		int number = 0;
		//89, 1, 0
		System.out.println(countAndSay(number));
	}
	public static String countAndSay(int n) {
        StringBuffer sb = new StringBuffer();
        String cs = new String(1+"");
        int count = 0;
        
        for(int i=1; i<n; i++){
            for(int j=0; j<cs.length(); j++){
                count++;
                if(j==cs.length()-1||cs.charAt(j)!=cs.charAt(j+1)){
                    sb.append(count);
                    sb.append(cs.charAt(j));
                    count=0;
                }
            }
            cs=sb+"";
            sb=new StringBuffer("");
        }
        return cs;
    }
}
