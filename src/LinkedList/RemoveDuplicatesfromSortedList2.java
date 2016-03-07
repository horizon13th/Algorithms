package LinkedList;

public class RemoveDuplicatesfromSortedList2 {
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while(head!=null && head.next!=null){
            if(head.val==head.next.val){
                int dup = head.val;
                while(head!=null && head.val==dup){
                    head=head.next;
                }
                pre.next=head;
            }
            else{
                head=head.next;
                pre=pre.next;
            }
        }

        return dummy.next;
    }
}
