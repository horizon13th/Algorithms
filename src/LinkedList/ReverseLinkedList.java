package LinkedList;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode p1=head;
        ListNode p2=head.next;
        ListNode temp;
        
        head.next=null;
        while(p2!=null){
            temp=p2.next;
            p2.next=p1;
            p1=p2;
            p2=temp;
        }
        
        return p1;
    }
}
