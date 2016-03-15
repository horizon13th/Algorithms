package Tree;

public class FindValueInBinaryTree {
	public static void main(String []args){
			TreeNode r = new TreeNode(1);
			r.left = new TreeNode(-2);                                                                       
			r.left.left = new TreeNode(1);
			r.left.right = new TreeNode(3);
			r.left.left.left = new TreeNode(-1);
			r.right = new TreeNode(-3);   
			r.right.left = new TreeNode(-2);   
			System.out.println(findValue(r, 4));
	}
	public static boolean findValue(TreeNode root, int value){
		if(root==null)
			return false;
		if(root.val==value)
			return true;
		else
			return (findValue(root.left, value)||findValue(root.right, value));
	}
}
