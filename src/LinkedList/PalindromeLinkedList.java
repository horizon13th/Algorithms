package LinkedList;

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head){
		//deal with corner case
        if(head==null || head.next==null)
            return true;
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head.next;
        ListNode pre = slow;
            
        //share same idea with reverse linked list
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            pre = slow;
            slow = temp;
            temp=temp.next;
            slow.next=pre;
        }
        //odd numbers temp moves a step left       
        if(fast.next==null)
            slow = slow.next;
        
        //check temp and slow 's value 
        while(temp!=null){
            if(temp.val!=slow.val)
                return false;
            temp=temp.next;
            slow=slow.next;
            System.out.println(temp.val+","+slow.val);
        }
        return true; 
    }
}
