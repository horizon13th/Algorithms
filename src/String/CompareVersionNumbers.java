package String;

import java.util.Arrays;

public class CompareVersionNumbers {
	public static void main(String args[]){
		String[] number = new String[]{ "1","1.1"};
		System.out.println(compareVersion(number[0],number[1]));
	}
    public static int compareVersion(String version1, String version2) {
        String[] str1=version1.split("\\.");
        String[] str2=version2.split("\\.");
        for(int i=0;i<Math.max(str1.length, str2.length);i++){
        	int digit1=i<str1.length?Integer.parseInt(str1[i]):0;
        	int digit2=i<str2.length?Integer.parseInt(str2[i]):0;
        	if(digit1<digit2) return -1;
        	else if(digit1>digit2) return 1;
        }
    	return 0;
    }
}
