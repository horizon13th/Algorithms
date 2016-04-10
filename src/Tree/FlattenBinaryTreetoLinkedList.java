package Tree;

public class FlattenBinaryTreetoLinkedList {
	public static void main(String []args){
		TreeNode r = new TreeNode(1);
		r.left = new TreeNode(-2);                                                                       
		r.left.left = new TreeNode(1);
		r.left.right = new TreeNode(3);
		r.left.left.left = new TreeNode(-1);
		r.right = new TreeNode(-3);   
		r.right.left = new TreeNode(-2);   
		flatten(r);
	}
	public static void flatten(TreeNode root) {
        if(root==null)
            return;
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        root.right=root.left;
        root.left=null;
        while(root.right!=null)
            root=root.right;
        root.right=temp;
    }
}
