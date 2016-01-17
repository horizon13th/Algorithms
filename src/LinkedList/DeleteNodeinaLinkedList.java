package LinkedList;

public class DeleteNodeinaLinkedList {
	public void deleteNode(ListNode node) {
        if(node!=null && node.next!=null)
        	if(node.next==null)
        		node=null;
            node.val = node.next.val;
            node.next = node.next.next;
    }
}


