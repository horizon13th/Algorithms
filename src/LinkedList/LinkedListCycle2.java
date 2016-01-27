package LinkedList;

public class LinkedListCycle2 {
	public ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null)
			return null;
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				fast = head;
				while (fast != slow) {
					fast = fast.next;
					slow = slow.next;
				}
				return fast;
			}
		}
		return null;
	}
}
