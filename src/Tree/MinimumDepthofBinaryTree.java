package Tree;

public class MinimumDepthofBinaryTree {
	public static void main(String[] args){
		TreeNode r=new TreeNode(0);
		r.left=new TreeNode(1);
		r.right=new TreeNode(2);
		r.left.left=new TreeNode(2);
		System.out.println(minDepth(r));
	}
	public static int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null)	return 1+minDepth(root.right);
        if(root.right==null) return 1+minDepth(root.left);
        return 1+Math.min(minDepth(root.left), minDepth(root.right));
    }
}
