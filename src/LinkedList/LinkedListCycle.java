package LinkedList;

import java.util.HashSet;

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
	public boolean hasCycle1(ListNode head) {
		//according to pysical theory, 
		//we can see one node as stop node, 
		//another node as running node. 
		//So the relavant spped is 1 node/time.
        if(head==null)
            return false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}
