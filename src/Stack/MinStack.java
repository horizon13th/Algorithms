package Stack;

import java.util.Stack;

public class MinStack {
	public static void main(String args[]){
		push(-1);
		top();
		System.out.println(getMin());

	}
	private static Stack<Integer> mStack = new Stack<Integer>();
	private static Stack<Integer> mMinStack = new Stack<Integer>();

	public static void push(int x) {
	    mStack.push(x);
	    if (mMinStack.size() != 0) {
	        int min = mMinStack.peek();
	        if (x <= min) {
	            mMinStack.push(x);
	        }
	    } else {
	        mMinStack.push(x);
	    }
	    System.out.println(mStack+""+mMinStack);
	}

	public static void pop() {
	    int x = mStack.pop();
	    if (mMinStack.size() != 0) {
	        if (x == mMinStack.peek()) {
	            mMinStack.pop();
	        }
	    }
	}

	public static int top() {
	    return mStack.peek();
	}

	public static int getMin() {
	    return mMinStack.peek();
	}
}
