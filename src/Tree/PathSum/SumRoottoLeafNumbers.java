package Tree.PathSum;

import Tree.TreeNode;

public class SumRoottoLeafNumbers {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(1);
		r.left = new TreeNode(2);
		r.right = new TreeNode(4);                                                                            
		r.left.left = new TreeNode(3);
		r.left.left.left = new TreeNode(1);
		System.out.println(sumNumbers(r));
	}
	public static int sumNumbers(TreeNode root) {
        return sum(root,0);
    }
    public static int sum(TreeNode root, int s){
    	System.out.println(s);
        if(root==null)  return 0;
        if(root.left==null&&root.right==null)
            return s*10+root.val;
        return sum(root.left,s*10+root.val)+sum(root.right,s*10+root.val);
    }
}
