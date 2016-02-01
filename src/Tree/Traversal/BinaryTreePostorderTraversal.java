package Tree.Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Tree.TreeNode;

public class BinaryTreePostorderTraversal {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(1);
		r.left = new TreeNode(-2);                                                                       
		r.left.left = new TreeNode(1);
		r.left.right = new TreeNode(3);
		r.left.left.left = new TreeNode(-1);
		r.right = new TreeNode(-3);   
		r.right.left = new TreeNode(-2);   
		System.out.println(postorderTraversal1(r));
	}
	public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result =new ArrayList<Integer>();
        helper(root, result);
        return result;
    }
    public static void helper(TreeNode t, List<Integer> res){
        if(t==null) return;
        helper(t.left,res);
        helper(t.right,res);
        res.add(t.val);
    }
    public static List<Integer>postorderTraversal1(TreeNode root){
    	List<Integer> result=new ArrayList<Integer>();
    	if(root==null)	return result;
    	Stack<TreeNode> stack=new Stack<TreeNode>();
    	TreeNode pre=null;
    	while(root!=null||!stack.isEmpty()){
    		if(root!=null){
    			stack.push(root);
    			root=root.left;
    		}
    		else{
    			//The only difference is that we need to record whether the parent node 
    			//has been traversed or not.
    			//So we use peekNode to restore traversal info
    			//if right side not been traversed before, we go through to right side
    			//else we add the top node into result list and flag it as traversed.
    			TreeNode peekNode=stack.peek();
    			if(peekNode.right!=null && pre!=peekNode.right)
    				root=peekNode.right;
    			//here we have to add the condition to test whether peekNode's right has object or not
    			//or it will go into infinite loop
    			else{
    				stack.pop();
    				result.add(peekNode.val);
    				pre=peekNode;
    			}
    		}
    		System.out.println(result);
    	}
    	return result;		
    }
}
