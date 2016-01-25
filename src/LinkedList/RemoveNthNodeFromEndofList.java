package LinkedList;

public class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode newHead = new ListNode(-1);
		newHead.next = head;
		ListNode fast = newHead;
		ListNode slow = newHead;

		// fast is (n+1) more steps than slow
		for (int i = 0; i < n + 1; i++) {
			fast = fast.next;
		}

		// move together
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}

		// delete the nth node form end
		slow.next = slow.next.next;

		return newHead.next;
	}
}
