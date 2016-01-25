package Tree;

public class PathSum {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(0);
		r.left = new TreeNode(1);
		r.right = new TreeNode(2);
		r.left.left = new TreeNode(2);
		r.left.left.left = new TreeNode(10);
		System.out.println(hasPathSum(r, 12));
	}

	public static boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		if (sum == root.val && root.left == null && root.right == null)
			return true;
		return hasPathSum(root.left, sum - root.val)
				|| hasPathSum(root.right, sum - root.val);
	}
}
