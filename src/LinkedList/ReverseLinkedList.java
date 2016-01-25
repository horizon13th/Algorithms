package LinkedList;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode p1 = head;
		ListNode p2 = head.next;
		ListNode temp;

		head.next = null;
		while (p2 != null) {
			temp = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = temp;
		}

		return p1;
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
