package Design;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Tree.TreeNode;

public class BinarySearchTreeIterator {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(0);
		r.left = new TreeNode(-1);
		r.right = new TreeNode(1);
		r.left.left=new TreeNode(-2);
		BinarySearchTreeIterator i = new BinarySearchTreeIterator(r);
		List<Integer> res = new ArrayList<Integer>();
		while (i.hasNext())
			res.add(i.next());
		System.out.println(res);	
	}
	private Stack<TreeNode> st = new Stack<TreeNode>();

	public BinarySearchTreeIterator(TreeNode root) {
		pushAll(root);
		// add all the Treenode on the left
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		// find the smallest in the right
		return !st.empty();
	}

	/** @return the next smallest number */
	public int next() {
		// find the smallest the right
		TreeNode temp = st.pop();
		pushAll(temp.right);
		return temp.val;
	}

	public void pushAll(TreeNode root) {
		while (root != null) {
			st.push(root);
			root = root.left;
		}
	}
}
