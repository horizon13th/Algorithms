package Tree;

public class SameTree {
	public static void main(String[] args){
		TreeNode r=new TreeNode(0);
		r.left=new TreeNode(1);
		r.right=new TreeNode(2);
		r.left.left=new TreeNode(2);
		System.out.println(isSameTree(r, r));
	}
	 public static boolean isSameTree(TreeNode p, TreeNode q) {
		 if(p==null&&q==null)
	            return true;
	     if((p==null&&q!=null)||(q==null&&p!=null))
	            return false;
	     if(p.val!=q.val)
	            return false;
	      return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
	  }
}
