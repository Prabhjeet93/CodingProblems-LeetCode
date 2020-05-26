package linkedList;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
  * }
 */
public class DetectCycle {
	
	  public ListNode detectCycle(ListNode head) {
	        if (head == null || head.next==null) {
	            return null;
	        }

	        ListNode fast, slow;
	        fast = head.next;
	        slow = head;
	        while (fast != slow) {
	            if(fast==null || fast.next==null)
	                return null;
	            fast = fast.next.next;
	            slow = slow.next;
	        } 

	        while (head != slow.next) {
	            head = head.next;
	            slow = slow.next;
	        }
	        return head;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
