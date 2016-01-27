package LinkedList;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs=new HashSet<ListNode>();
        while(head!=null&&head.next!=null){
            if(!hs.add(head))
                return true;
            head=head.next;
        }
        return false;
    }
}
