package Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	public static void main(String args[]) {
		String str = "23*";
		//String[] tokens = {"2","-13","*","4","+"};
		String[] tokens = {"0", "3", "/"};
		System.out.println(evalRPN(str));
		System.out.println(evalRPN1(tokens));
	}
	public static int evalRPN(String str) {
		int result = 0;
        char[] token = str.toCharArray();
        Stack<Double> s = new Stack<Double>();
        for(int i=0; i<token.length; i++){
        	if(Character.isDigit(token[i]))
        		s.push((double) Character.getNumericValue(token[i]));
        	else{
        		char op = token[i];
        		if(s.isEmpty())
        			return -1;
       			double a = s.pop();
        		if(s.isEmpty())
        			return -1;
        		double b = s.pop();	
        		s.push(cal(op, a, b));
        	}		
        }
        result = s.pop().intValue();
        return result;
    }
	public static double cal(char op, double a, double b){
		double res = 0;
		switch(op){
			case '+':{
				res = a+b;
				break;
			}
			case '-':{
				res = a-b;
				break;
			}
			case '*':{
				res = a*b;
				break;
			}
			case '/':{
				res = a/b;
				break;
			}
		}
		System.out.println(res);
		return res;
	}
	
	public static int evalRPN1(String[] tokens){
		int result = 0;
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0; i<tokens.length; i++){
			if(tokens[i].matches("^-?\\d+")){
				s.push(Integer.parseInt(tokens[i]));
			}
			else{
				char op = tokens[i].charAt(0);
				int a = s.pop();
        		int b = s.pop();	
        		s.push(cal1(op, a, b));
			}
		}
	    return result;
	}
	public static int cal1(char op, int a, int b){
		int res = 0;
		switch(op){
			case '+':{
				res = a+b;
				break;
			}
			case '-':{
				res = a-b;
				break;
			}
			case '*':{
				res = a*b;
				break;
			}
			case '/':{
				res = a/b;
				break;
			}
		}
		System.out.println(res);
		return res;
	}
}

