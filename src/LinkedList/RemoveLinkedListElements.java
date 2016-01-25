package LinkedList;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return null;
		ListNode pointer = head;
		while (pointer.next != null) {
			if (pointer.next.val == val)
				pointer.next = pointer.next.next;
			else
				pointer = pointer.next;
		}
		return head.val == val ? head.next : head;
	}

	public ListNode removeElements1(ListNode head, int val) {
		if (head == null)
			return null;
		ListNode fake = new ListNode(-1);
		fake.next = head;
		ListNode pointer = head, bef = fake;
		while (pointer != null) {
			// System.out.println(pointer.val);
			if (pointer.val == val)
				bef.next = pointer.next;
			else
				bef = bef.next;
			pointer = pointer.next;
		}
		return fake.next;
	}
}
