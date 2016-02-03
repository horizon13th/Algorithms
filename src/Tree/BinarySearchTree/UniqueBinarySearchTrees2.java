package Tree.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

import Tree.TreeNode;

public class UniqueBinarySearchTrees2 {
	public static void main(String[] args) {
		System.out.println(generateTrees(5));
	}

	public static List<TreeNode> generateTrees(int n) {
		if(n==0) return new ArrayList<TreeNode>();
		return helper(1, n);
	}

	public static List<TreeNode> helper(int left, int right) {
		List<TreeNode> res = new ArrayList<TreeNode>();
		if (left > right) {
			res.add(null);
			return res;
		}
		for (int i = left; i <= right; i++) {
			List<TreeNode> leftList = helper(left, i - 1);
			List<TreeNode> rightList = helper(i + 1, right);
			for (TreeNode leftListNode : leftList) {
				for (TreeNode rightListNode : rightList) {
					TreeNode t = new TreeNode(i);
					t.left=leftListNode;
					t.right=rightListNode;
					res.add(t);
				}
			}
		}
		return res;
	}
}
