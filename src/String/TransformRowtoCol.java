package String;

import java.util.Scanner;

public class TransformRowtoCol {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String line;
		StringBuilder sb = new StringBuilder();
		while(sc.hasNextLine() && ! (line = sc.nextLine()).equals("")){
			transform(line, sb);
		}
		System.out.println(sb.toString());
	}
	public static void transform(String str, StringBuilder sb){
		//System.out.println(str);
		str = str.replace(',','.');
		sb.append(str);
		sb.append(",");
		//System.out.println(sb.toString());
	}
}
