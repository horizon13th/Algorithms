package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal2 {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(0);
		r.left = new TreeNode(1);
		r.right = new TreeNode(1);
		r.left.left = new TreeNode(2);
		System.out.println(levelOrderBottom(r));
	}

	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null)
			return result;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> level = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode head = q.poll();
				level.add(head.val);
				if (head.left != null)
					q.add(head.left);
				if (head.right != null)
					q.add(head.right);
			}
			result.add(0, level);
		}
		return result;
	}
}
