package LinkedList;

public class ReverseLinkedList2 {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (head == null)
			return null;
		if (m == n)
			return head;
		ListNode newHead = new ListNode(-1);
		newHead.next = head;
		ListNode preHead = newHead;
		for (int i = 1; i < m; i++) {
			preHead = preHead.next;
		}
		ListNode p1 = preHead.next;
		ListNode p2 = p1.next;
		for (int i = 0; i < n - m; i++) {
			p1.next = p2.next;
			p2.next = preHead.next;
			preHead.next = p2;
			p2 = p1.next;
		}
		return newHead.next;
	}
}
