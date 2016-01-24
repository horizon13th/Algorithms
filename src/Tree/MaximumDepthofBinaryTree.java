package Tree;

public class MaximumDepthofBinaryTree {
	//DFS
	public static void main(String[] args){
		TreeNode r=new TreeNode(0);
		r.left=new TreeNode(1);
		r.right=new TreeNode(2);
		r.left.left=new TreeNode(2);
		System.out.println(maxDepth(r));
	}
	public static int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
