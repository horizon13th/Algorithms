package Tree.PathSum;

import java.util.ArrayList;
import java.util.List;

import Tree.TreeNode;

public class BinaryTreePaths {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(0);
		r.left = new TreeNode(1);
		r.right = new TreeNode(2);
		r.left.left = new TreeNode(2);
		r.left.left.left = new TreeNode(10);
		System.out.println(binaryTreePaths(r));
	}

	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<String>();
		if (root != null)
			search(root, "", result);
		return result;
	}

	public static void search(TreeNode root, String path, List<String> result) {
		if (root.left == null && root.right == null)
			result.add(path + root.val);
		if (root.left != null)
			search(root.left, path + root.val + "->", result);
		if (root.right != null)
			search(root.right, path + root.val + "->", result);
	}

}
