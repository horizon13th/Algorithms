package Design;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import Tree.TreeNode;

public class SerializeandDeserializeBinaryTree {
	public static void main(String[] args) {
		TreeNode r = new TreeNode(0);
		r.left = new TreeNode(-1);
		r.right = new TreeNode(1);
		r.left.left=new TreeNode(-2);
		SerializeandDeserializeBinaryTree i = new SerializeandDeserializeBinaryTree();
		i.deserialize(i.serialize(r));	
	}
	 // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }
    private void buildString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null").append(",");
        } else {
            sb.append(node.val).append(",");
            buildString(node.left, sb);
            buildString(node.right,sb);
        }
        //preorder travesal
        System.out.println(sb.toString());
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> dq = new LinkedList<String>(); 
        dq.addAll(Arrays.asList(data.split(",")));
        return buildTree(dq);
    }
    private TreeNode buildTree(Deque<String> dq){
    	String str = dq.poll();
    	if(str.equals("null"))
    		return null;
    	else{
    		TreeNode root = new TreeNode(Integer.valueOf(str));
    		root.left = buildTree(dq);
    		root.right = buildTree(dq);
        	return root;
    	}
    }
}
