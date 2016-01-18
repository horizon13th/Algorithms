package LinkedList;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //first deal with null
        if(l1==null)  return l2;
        if(l2==null)  return l1;
        
        ListNode newHead;
        if(l1.val<l2.val){
            newHead=l1;
            newHead.next=mergeTwoLists(l2,l1.next);
        }
        else{
            newHead=l2;
            newHead.next=mergeTwoLists(l1,l2.next);
        }
    
        return newHead;
    }
}
