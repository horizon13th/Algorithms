package Tree.Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Tree.TreeNode;

public class BinaryTreeInorderTraversal {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(1);
		r.left = new TreeNode(-2);                                                                       
		r.left.left = new TreeNode(1);
		r.left.right = new TreeNode(3);
		r.left.left.left = new TreeNode(-1);
		r.right = new TreeNode(-3);   
		r.right.left = new TreeNode(-2);   
		System.out.println(inorderTraversal1(r));
	}
	//recursive way: Time complexity: O(n), Space complexity: O(logn)
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res=new ArrayList<Integer>();
        if(root==null)	return res;
        helper(root, res);
        return res;
    }
	public static void helper(TreeNode t, List<Integer> res){
		if(t==null)	return;
		helper(t.left,res);
		res.add(t.val);
		helper(t.right,res);
	}
	//iterative way: Time complexity: O(n), Space complexity: O(logN)
	public static List<Integer> inorderTraversal1(TreeNode root) {
		List<Integer> result=new ArrayList<Integer>();
		Stack<TreeNode> stack =new Stack<TreeNode>();
		while(root!=null||!stack.isEmpty()){
			if(root!=null){
				stack.push(root);
				root=root.left;
			}
			else{
				root=stack.pop();
				result.add(root.val);
				root=root.right;
			}
		}
		return result;
	}
}
