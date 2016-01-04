package String;

public class ZigzagConversion {
	public static void main(String args[]){
		String number = "PAYPALISHIRING";
		System.out.println(convert(number, 3));
	}
	public static String convert(String s, int numRows) {
        if(numRows==0||numRows==1)
            return s;
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i=0; i<numRows; i++){
            sb[i]= new StringBuffer();
        }
        int mod = numRows*2-2;
        for(int i=0; i<s.length();i++){
            if(i%mod < numRows && i%mod>=0)
                sb[i%mod].append(s.charAt(i));
            else
                sb[mod-i%mod].append(s.charAt(i));
        }
        String result=new String();
        for(int i=0; i<numRows; i++){
            result=result+sb[i];
        }
        return result;
    }
	//another method
}
