package LinkedList;

public class IntersectionofTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //a+c
        //b+c
        //c is intersection part
        //A first scan a+c, B scan b+c
        //then A scan b+c B scan a+c
        // (a+c+b+c) == (b+c+a+c)
        //so at last the scan c together
        if(headA==null||headB==null)
            return null;
        ListNode a = headA;
        ListNode b = headB;
        while(a!=b){
            if(a==null) 
                a=headB;
            else
                a=a.next;
                
            if(b==null)
                b=headA;
            else
                b=b.next;
        }
        return a;
    }
}
