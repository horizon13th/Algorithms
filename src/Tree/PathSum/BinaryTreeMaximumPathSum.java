package Tree.PathSum;

import Tree.TreeNode;

public class BinaryTreeMaximumPathSum {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(1);
		r.left = new TreeNode(-2);                                                                       
		r.left.left = new TreeNode(1);
		r.left.right = new TreeNode(3);
		r.left.left.left = new TreeNode(-1);
		r.right = new TreeNode(-3);   
		r.right.left = new TreeNode(-2);   
		System.out.println(maxPathSum(r));
	}
	public static int max;
	public static int maxPathSum(TreeNode root) {
		max=Integer.MIN_VALUE;
		helper(root);
		return max;
	}
	public static int helper(TreeNode t){
		if(t==null)	return 0;
		int left=Math.max(0, helper(t.left));
		int right=Math.max(0, helper(t.right));
		max=Math.max(max, left+right+t.val);
		return Math.max(left, right)+t.val;
	}
}
