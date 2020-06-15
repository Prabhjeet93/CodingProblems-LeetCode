package linkedList;

public class LinkedListImplimention {
	
	Node head;
	
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
		
	}
	public LinkedListImplimention insertion(LinkedListImplimention list, int val) {
		Node newNode= new Node(val);
		
		if(list.head==null) {
			list.head=newNode;
		}
		else {
			Node last = list.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
		}
		return list;
	}
	public void printList(LinkedListImplimention list) {
		Node curr = list.head;
		System.out.println(curr);
		while(curr!=null) {
			System.out.println(curr.data);
			if(curr.data==5)
				System.out.println("Found 5");
			curr = curr.next;
		}
	}
	
	public LinkedListImplimention deleteKey(LinkedListImplimention list, int key) {
		
		Node curr=list.head;
		Node prev=null;
		
		if(curr!=null && curr.data==key) {
			list.head=curr.next;
			
			System.out.println(key +" found and deleted");
			return list;
		}
		while(curr!=null && curr.data!=key) {
			prev=curr;
			curr=curr.next;
		}
		if(curr!=null) {
			prev.next=curr.next;
			System.out.println(key +" found and deleted");
			
		}
		if(curr==null) {
			System.out.println(key +" is not found");
		}
		return list;
		
	}
	
	public LinkedListImplimention deleteAtPosition(LinkedListImplimention list, int index) {
		
		Node curr=list.head;
		Node prev = null;
		
		if(index==0 && curr!=null) {
			list.head=curr.next;
			System.out.println(index +" position element deleted");
			return list;
		}
		int count=0;
		while(curr!=null) {
			
			if(count==index) {
				prev.next=curr.next;
				System.out.println(index +" position element deleted");
				break;
			}
			else {
			prev=curr;
			curr=curr.next;
			count++;
			}
		}
		
		if(curr==null) {
			System.out.println(index +" position doesn't found");
		}
		
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImplimention ll=new LinkedListImplimention();
		ll.printList(ll);
		ll.deleteKey(ll,5);
		ll.insertion(ll, 5);
		ll.deleteKey(ll,5);
		ll.insertion(ll, 6);
		
		ll.insertion(ll, 7);
		ll.insertion(ll, 2);
		ll.deleteKey(ll,5);
		ll.insertion(ll, 4);
		ll.insertion(ll, 5);
		ll.insertion(ll, 10);
		
		ll.printList(ll);
	}

}
