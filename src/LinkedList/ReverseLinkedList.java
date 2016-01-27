package LinkedList;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if(head==null||head.next==null)
            return head;
        ListNode tempHead=head;
        ListNode p1=head;
        ListNode p2=head.next;
        while(p2!=null){
            p1.next=p2.next;
            p2.next=tempHead;
            tempHead=p2;
            p2=p1.next;
        }
        return tempHead;
	}

	public static ListNode reverseListR(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode root = reverseListR(head.next);
		head.next.next = head;
		head.next = null;
		return root;
		// very difficult to understand
		// 1-->2-->3-->4
		// use recursive to return the last node 4 head=3
		// then the last second node's next will change it's next to last second
		// node 3<--4
		// let the last second node pointing to null null<--3<--4
		// return the root(the last node) 4 head=2
		// the last third node's next will change it's next to last third node
		// 2<--3
		// let the last third node pointing to null null<--2<--3<--4
		// return the root(the last node) 4 head=1
		// 1<--2
		// null<--1<--2<--3<--4
		// return root=4
	}
}
