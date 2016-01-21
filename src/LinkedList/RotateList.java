package LinkedList;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		//deal with counter case
        if(head==null||head.next==null)
            return head;
        
        int len=0;
        
        //store head in temp head
        ListNode tempHead = head;
        
        //scan from begin to end to find out the length
        while(head!=null && head.next!=null){
            len++;
            head=head.next;
        }
        //connect the last node with temphead
        head.next=tempHead;
        System.out.println(len);//length is 1 smaller than actual length
        k=k%(len+1);
        //when k is larger than length, we need to rotate from k%length
        for(int i=0; i<(len-k+1); i++)
            head =head.next;
        
        ListNode newHead = head.next;
        head.next=null;
        
        return newHead;
    }
}
