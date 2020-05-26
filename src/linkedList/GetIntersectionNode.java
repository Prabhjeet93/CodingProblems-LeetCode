package linkedList;

/*public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }*/

public class GetIntersectionNode {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if (headA == null || headB == null) {
           return null;
       }
       ListNode p = headA;
       ListNode q = headB;
       while (p != q) {
           p =  (p != null) ? p.next : headB;
           q =  (q != null) ? q.next : headA;
       }
       return p;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
