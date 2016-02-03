package Tree.BinarySearchTree;

import Tree.TreeNode;

public class ConvertSortedArraytoBinarySearchTree {
	public static void main(String args[]){
		int[] nums={1,2,5,7,8,9};
		System.out.println(sortedArrayToBST(nums));
	}
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null||nums.length==0)	return null;
        return helper(nums, 0, nums.length-1);
    }
    private static TreeNode helper(int[]nums, int left, int right){
    	if(left>right)	return null;
    	int mid=(left+right)/2;
    	TreeNode root=new TreeNode(nums[mid]);
    	root.left=helper(nums,left,mid-1);
    	root.right=helper(nums,mid+1,right);
    	return root;
    }
}
