package LinkedList;

public class SwapNodesinPairs {
	 public ListNode swapPairs(ListNode head) {
	        if(head==null||head.next==null)
	            return head;
	        ListNode newHead =new ListNode(-1);
	        newHead.next=head;
	        ListNode pointer=newHead;
	        while(pointer.next!=null&&pointer.next.next!=null){
	            ListNode odd=pointer.next;
	            ListNode even=pointer.next.next;
	            odd.next=even.next;
	            pointer.next=even;
	            even.next=odd;
	            pointer=pointer.next.next;
	        }
	        return newHead.next;
	    }
}
