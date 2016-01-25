package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthofBinaryTree {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(0);
		r.left = new TreeNode(1);
		r.right = new TreeNode(2);
		r.left.left = new TreeNode(2);
		System.out.println(minDepth(r));
	}

	public static int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null)
			return 1 + minDepth(root.right);
		if (root.right == null)
			return 1 + minDepth(root.left);
		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}
	
	public static int minDepth1(TreeNode root){
		if(root==null)
			return 0;
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.add(root);
		int depth=1;
		while(!q.isEmpty()){
			int size=q.size();
			for(int i=0;i<size;i++){
				TreeNode t=q.remove();
				if(t.left==null&&t.right==null)
					return depth;
				if(t.left!=null)
					q.add(t.left);
				if(t.right!=null)
					q.add(t.right);
			}
			depth++;
		}
		return depth;
	}
}
