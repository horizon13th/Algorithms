package Stack;

import java.util.Stack;

public class ImplementQueueusingStacks {
	private Stack<Integer> input = new Stack<Integer>();
	private Stack<Integer> output = new Stack<Integer>();

	// Push element x to the back of queue.
	public void push(int x) {
		input.push(x);
	}

	// Removes the element from in front of queue.
	public void pop() {
		while (!input.isEmpty()) {
			output.push(input.pop());
		}
		output.pop();
		while (!output.isEmpty()) {
			input.push(output.pop());
		}
	}

	// Get the front element.
	public int peek() {
		while (!input.isEmpty()) {
			output.push(input.pop());
		}
		int result = output.peek();
		while (!output.isEmpty()) {
			input.push(output.pop());
		}
		return result;
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return input.isEmpty();
	}
}
