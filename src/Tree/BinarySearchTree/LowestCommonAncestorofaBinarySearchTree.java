package Tree.BinarySearchTree;

import Tree.TreeNode;

public class LowestCommonAncestorofaBinarySearchTree {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(0);
		r.left = new TreeNode(1);
		r.right = new TreeNode(1);
		// r.left.left=new TreeNode(2);
		System.out.println(lowestCommonAncestor(r, r.left, r.right));
	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p,
			TreeNode q) {
		if (root.val < q.val && root.val < p.val)
			return lowestCommonAncestor(root.right, p, q);
		else if (root.val > q.val && root.val > p.val)
			return lowestCommonAncestor(root.left, p, q);
		else
			return root;
	}
}
