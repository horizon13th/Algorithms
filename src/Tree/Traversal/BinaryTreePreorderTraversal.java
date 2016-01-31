package Tree.Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Tree.TreeNode;

public class BinaryTreePreorderTraversal {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(1);
		r.left = new TreeNode(-2);                                                                       
		r.left.left = new TreeNode(1);
		r.left.right = new TreeNode(3);
		r.left.left.left = new TreeNode(-1);
		r.right = new TreeNode(-3);   
		r.right.left = new TreeNode(-2);   
		System.out.println(preorderTraversal1(r));
	}
	public static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result =new ArrayList<Integer>();
        helper(root, result);
        return result;
    }
	public static void helper(TreeNode t, List<Integer> res){
		if(t==null)	return;
		res.add(t.val);
		helper(t.left,res);
		helper(t.right,res);
	}
	public static List<Integer> preorderTraversal1(TreeNode root){
		Stack<TreeNode> stack =new Stack<TreeNode>();
		List<Integer> result=new ArrayList<Integer>();
		while(root!=null||!stack.isEmpty()){
			if(root!=null){
				stack.push(root);
				result.add(root.val);
				root=root.left;
			}
			else{
				root=stack.pop();
				root=root.right;
			}
		}
		return result;
	}
}
