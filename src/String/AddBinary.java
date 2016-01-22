package String;

public class AddBinary {
	public static void main(String args[]){
		String str1 = "111";
		String str2 = "10";
		System.out.println(addBinary(str1,str2));
	}
	public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int add1 = 0;//whether add 1 or not
        int sum;//sum is the sum of each digit
        int i=a.length()-1,j=b.length()-1;
        while(i>=0||j>=0){
        	sum = add1;
        	if(i>=0){
        		sum+=a.charAt(i)-'0';
        		i--;
        		}
        	if(j>=0){        		
        		sum+=b.charAt(j)-'0';
        		j--;
        	}
        	sb.append(sum%2);
        	add1 = sum/2;
        	System.out.println(i+""+j);
        }
        if(add1!=0)
        	sb.append(add1);
		return sb.reverse().toString();
    }

}
