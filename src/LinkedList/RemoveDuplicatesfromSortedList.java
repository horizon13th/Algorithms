package LinkedList;

public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		//idea of two pointers
		if(head==null||head.next==null)
			return head;
        ListNode temp=head.next;   //if let temp=head and seek for temp.next(null), wrong
        ListNode save=head;
        while(temp!=null){
            if(temp.val!=save.val){
                save.next=temp;
                save=save.next;
            }
            temp=temp.next;
        }
        save.next=null;
        return save;
    }
}
