package Tree.Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Tree.TreeNode;

public class BinaryTreeZigzagLevelOrderTraversal {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(0);
		r.left = new TreeNode(1);
		r.right = new TreeNode(-1);
		r.left.left = new TreeNode(2);
		System.out.println(zigzagLevelOrder(r));
	}
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(root==null)	return result;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        int levelNum=0;
        while(!q.isEmpty()){
        	List<Integer> level=new ArrayList<Integer>();
        	int size=q.size();
        	for(int i=0;i<size;i++){
        		TreeNode temp=q.poll();
        		//difference only exist here: when meet even level, 
        		//we add value into the first place of the queue
        		if(levelNum%2==0)
        			level.add(temp.val);
        		else
        			level.add(0,temp.val);
        		if(temp.left!=null)
        			q.add(temp.left);
        		if(temp.right!=null)
        			q.add(temp.right);
        	}
        	result.add(level);
        	levelNum++;
        }
        return result;
    }
}
