package Tree.BinarySearchTree;

import Tree.TreeNode;

public class RecoverBinarySearchTree {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(0);
		r.left = new TreeNode(-1);
		r.right = new TreeNode(-7);
		r.left.left=new TreeNode(2);
		recoverTree(r);
	}

	private static TreeNode l=null;
	private static TreeNode r=null;
	private static TreeNode temp=null;

	public static void recoverTree(TreeNode root) {
		findSwap(root);
		TreeNode swap = new TreeNode(l.val);
		l.val = r.val;
		r.val = swap.val;
	}

	// Use inorder travesal to find the swapped element.
	// Find the element that is smaller than the pre node
	private static void findSwap(TreeNode root) {
		if (root == null)
			return;
		findSwap(root.left);
		if (temp != null) {
			if (root.val <= temp.val) {
				if (l == null)
					l = temp;
				else
					r = root;
			}
		}
		temp = root;
		findSwap(root.right);
	}
}
