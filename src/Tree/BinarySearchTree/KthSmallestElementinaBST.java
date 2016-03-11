package Tree.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

import Tree.TreeNode;

public class KthSmallestElementinaBST {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(0);
		r.left = new TreeNode(-1);
		r.right = new TreeNode(1);
		r.left.left=new TreeNode(-2);
		System.out.println(kthSmallest(r, 3));	
	}
	public static int kthSmallest(TreeNode root, int k) {
        if(root==null)  return 0;
        List<Integer> inorder = new ArrayList<Integer>();
        helper(inorder, root);
        return inorder.get(k-1);
    }
    public static void helper(List<Integer> inorder, TreeNode root){
        if(root==null)  return;
        helper(inorder, root.left);
        inorder.add(root.val);
        helper(inorder, root.right);
    }
}
