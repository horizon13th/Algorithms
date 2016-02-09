package Tree.BinarySearchTree;

import LinkedList.ListNode;
import Tree.TreeNode;

public class ConvertSortedListtoBinarySearchTree {
	public TreeNode sortedListToBST(ListNode head) {
        return helper(head, null);
    }
    private TreeNode helper(ListNode left, ListNode right){
        if(left==right) return null;
        ListNode mid=left;
        ListNode fast=left;
        //slow and fast pointer to find the mid listNode
        while(fast!=right && fast.next!=right){
            mid=mid.next;
            fast=fast.next.next;
        }
        TreeNode root=new TreeNode(mid.val);
        root.left=helper(left,mid);
        root.right=helper(mid.next,right);
        return root;
    }
}
