package Tree.BinarySearchTree;

import Tree.TreeNode;

public class ValidateBinarySearchTree {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(0);
		r.left = new TreeNode(-1);
		r.right = new TreeNode(1);
		// r.left.left=new TreeNode(2);
		System.out.println(isValidBST(r));
	}
	public static boolean isValidBST(TreeNode root) {
		return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public static boolean helper(TreeNode root, long min, long max) {
		if(root==null)
			return true;
		if(root.val>=max|| root.val<=min)
			return false;
        return helper(root.left, min, root.val)&&helper(root.right,root.val,max);
    }
	public static boolean isValidBST1(TreeNode root){
		
	}
}
