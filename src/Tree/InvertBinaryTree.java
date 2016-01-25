package Tree;

public class InvertBinaryTree {
	public static void main(String[] args){
		TreeNode r=new TreeNode(0);
		r.left=new TreeNode(1);
		r.right=new TreeNode(1);
		//r.left.left=new TreeNode(2);
		System.out.println(invertTree(r));
	}
	public static TreeNode invertTree(TreeNode root) {
	    if(root==null||(root.left==null&&root.right==null))
	    	return root;
	    TreeNode temp=root.left;
	    root.left=invertTree(root.right);
	    root.right=invertTree(temp);
	    return root;
	}
}
