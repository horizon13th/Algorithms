package Tree;

public class BalancedBinaryTree {
	public static void main(String[] args){
		TreeNode r=new TreeNode(0);
		r.left=new TreeNode(1);
		//r.right=new TreeNode(2);
		r.left.left=new TreeNode(2);
		r.left.left.left=new TreeNode(10);
		System.out.println(isBalanced(r));
	}
	public static boolean isBalanced(TreeNode root) {
		if(root==null)	return true;
        if(Math.abs(height(root.left)-height(root.right))<=1)
        	return isBalanced(root.left)&&isBalanced(root.right);
        return false;
    }
	public static int height(TreeNode root){
		if(root==null)	return 0;
		return Math.max(height(root.left), height(root.right))+1;//dont forget +1
	}
}
