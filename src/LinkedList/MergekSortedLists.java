package LinkedList;

public class MergekSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        return binary(lists,0,lists.length);
    }
	public static ListNode binary(ListNode[] lists, int l, int r){
		if(l==r)	return lists[l];
		if(l<r){
			int m=(1+r)/2;
			ListNode l1=binary(lists,l,m);
			ListNode l2=binary(lists,m+1,r);
			return mergeTwoList(l1,l2);
		}
		else
			return null;
		
	}
    public static ListNode mergeTwoList(ListNode l1, ListNode l2){
        if(l1==null)    return l2;
        if(l2==null)    return l1;
        
        ListNode newHead;
        if(l1.val<l2.val){
            newHead=l1;
            newHead.next=mergeTwoList(l1.next, l2);
        }
        else{
            newHead=l2;
            newHead.next=mergeTwoList(l2.next, l1);
        }
        return newHead;
    }
}
