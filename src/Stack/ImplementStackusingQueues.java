package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ImplementStackusingQueues {
	private Queue<Integer> q = new LinkedList<Integer>();

	// Push element x onto stack.
	public void push(int x) {
		q.add(x);
	}

	// Removes the element on top of the stack.
	public void pop() {
		for (int i = 0; i < q.size() - 1; i++)
			q.add(q.remove());
		q.remove();
	}

	// Get the top element.
	public int top() {
		for (int i = 0; i < q.size() - 1; i++)
			q.add(q.remove());
		int result = q.remove();
		q.add(result);
		return result;
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return q.isEmpty();
	}
}
