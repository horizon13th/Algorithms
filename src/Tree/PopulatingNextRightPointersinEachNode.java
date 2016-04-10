package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode {
	public static void printTree(TreeLinkNode root){
		List<Integer> res = new ArrayList<Integer>();
		Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
		q.add(root);
		while(!q.isEmpty()){
			TreeLinkNode temp = q.remove();
			res.add(temp.val);
			printNext(temp);
			if(temp.left!=null)			q.add(temp.left);
			if(temp.right!=null)		q.add(temp.right);
		}
		System.out.println(res);
	}
	public static void printNext(TreeLinkNode root){
		if(root.next==null)
			System.out.print("null");
		else
			System.out.print(root.next.val);
		System.out.print(" ");
	}
	public static void main(String []args){
		TreeLinkNode r = new TreeLinkNode(1);
		r.left = new TreeLinkNode(-2);                                                                       
		r.left.left = new TreeLinkNode(1);
		r.left.right = new TreeLinkNode(3);
		r.right = new TreeLinkNode(-3);   
		r.right.left = new TreeLinkNode(-2);   
		r.right.right = new TreeLinkNode(1);
		connect(r);
		printTree(r);
	}
	public static TreeLinkNode par = null;
    public static void connect(TreeLinkNode root) {
        if(root==null)
            return;
        if(par==null){
            root.next=null;
        }
        else{
            if(root==par.left)
                root.next=par.right;
            else if(root==par.right){
                if(par.next==null)
                    root.next=par.right;
                else
                    root.next=par.next.left;
            }
        }
        par=root;
        connect(root.left);
        par=root;
        connect(root.right);
    }
}
