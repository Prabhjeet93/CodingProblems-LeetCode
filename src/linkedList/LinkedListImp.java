package linkedList;

public class LinkedListImp {
	
	Node head;
	
	   class Node{
		   int data;
		   Node next;
		   Node(int d){
			   data=d;
			   next=null;
		   }
		public LinkedListImp insert(LinkedListImp list, int value) {
			Node newNode=new Node(value);
			
			if(list.head==null) {
				list.head=newNode;
			}
			else {
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
			}
			return list;
		}
		
		public void printList(LinkedListImp list) {
			Node curr=list.head;
			while(curr!=null) {
				System.out.println(curr.data);
				curr=curr.next;
			}
		}
		
		public LinkedListImp deleteKey(LinkedListImp list, int key) {
			
			return list;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
