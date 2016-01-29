package LinkedList;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(-1);
		ListNode newHead = dummy;
		int add1 = 0;
		int sum = 0;
		while (l1 != null || l2 != null) {
			sum = add1;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			newHead.next = new ListNode(sum % 10);
			add1 = sum / 10;
			newHead = newHead.next;
		}
		if (add1 != 0)
			newHead.next = new ListNode(add1);
		return dummy.next;
	}
}
