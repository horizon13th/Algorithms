package Tree.PathSum;

import java.util.ArrayList;
import java.util.List;

import Tree.TreeNode;

public class PathSum2 {
	public static void main(String[] args) {
		TreeNode r=new TreeNode(0);
		r.left=new TreeNode(1);
		r.right=new TreeNode(1);
//		TreeNode r = new TreeNode(1);
//		r.left = new TreeNode(-2);                                                                       
//		r.left.left = new TreeNode(1);
//		r.left.right = new TreeNode(3);
//		r.left.left.left = new TreeNode(-1);
//		r.right = new TreeNode(-3);   
//		r.right.left = new TreeNode(-2);   
		System.out.println(pathSum(r, 1));
	}
	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(root==null)	return result;
        List<Integer> row = new ArrayList<Integer>();
        search(root, sum, result, row);
        return result;
    }
	public static void search(TreeNode t, int sum, List<List<Integer>> res, List<Integer> row){
		if(t.left==null && t.right==null && sum==t.val){
			row.add(t.val);
			res.add(new ArrayList<Integer>(row));
			row.remove(row.size()-1);
		}
		if(t.left!=null){
			row.add(t.val);
			search(t.left, sum-t.val, res, row);
			row.remove(row.size()-1);
		}
		if(t.right!=null){
			row.add(t.val);
			search(t.right, sum-t.val, res, row);
			row.remove(row.size()-1);
		}
	}
}
