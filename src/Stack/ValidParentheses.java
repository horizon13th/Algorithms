package Stack;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String args[]) {
		String str1 = "]";
		System.out.println(isValid(str1));
	}

	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[')
				st.push(ch);
			else if (ch == ')' && !st.empty() && st.peek() == '(')
				st.pop();
			else if (ch == ']' && !st.empty() && st.peek() == '[')
				st.pop();
			else if (ch == '}' && !st.empty() && st.peek() == '{')
				st.pop();
			else
				return false;
		}
		return st.empty();
	}
}
