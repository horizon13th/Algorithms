package Tree;

public class SymmetricTree {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(0);
		r.left = new TreeNode(1);
		r.right = new TreeNode(1);
		// r.left.left=new TreeNode(2);
		System.out.println(isSymmetric(r));
	}

	public static boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return isMirror(root.left, root.right);
	}

	public static boolean isMirror(TreeNode l, TreeNode r) {
		if (l == null && r == null)
			return true;
		if (l == null || r == null)
			return false;
		if (l.val != r.val)
			return false;
		return isMirror(l.left, r.right) && isMirror(l.right, r.left);
	}
}
