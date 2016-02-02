package Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LowestCommonAncestorOfaBinaryTree {
	public static void main(String[] args) {
//		TreeNode r=new TreeNode(0);
//		r.left=new TreeNode(1);
//		r.right=new TreeNode(1);
		TreeNode r = new TreeNode(1);
		r.left = new TreeNode(-2);                                                                       
		r.left.left = new TreeNode(1);
		r.left.right = new TreeNode(3);
		r.left.left.left = new TreeNode(-1);
		r.right = new TreeNode(-3);   
		r.right.left = new TreeNode(-2);   
		System.out.println(lowestCommonAncestor(r, r.left.left.left,r.left.right).val);
	}
    
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root==null||root==p||root==q)	return root;
		TreeNode left=lowestCommonAncestor(root.left, p,q);
		TreeNode right=lowestCommonAncestor(root.right,p,q);
		if(left==null)	return right;
		if(right==null)	return left;
		return root;
    }

}
