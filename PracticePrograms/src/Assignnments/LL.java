package Assignnments;

public class LL {
	Node head;
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data=data;
			this.next=null;
		}
	}
		public void addFirst(String data) {
			Node newNode=new Node(data);
			if(head==null) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
		}
		public void print() {
			Node currNode=head;
			while(currNode!=null) {
				System.out.print(currNode.data+"->");
				currNode=currNode.next;
			}
			System.out.println("null");
			
		}
		public void addLast(String data) {
			Node newNode=new Node(data);
			if(head==null) {
				head=newNode;
				return;
			}
			Node lastNode=head;
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
			}
			lastNode.next=newNode;
		}
		public void deleteFirst() {
			if(head==null) {
				System.out.println("list empty");
				return;
			}
			head=head.next;
		}
		public void deleteLast() {
			if(head==null) {
				System.out.println("list empty");
				return;
			}
			if(head.next==null){
				head=null;
				return;
			}
			Node secondLast=head;
			Node lastNode=head.next;
			while(lastNode.next!=null) {
				secondLast=secondLast.next;
			    lastNode=lastNode.next;
			}
			secondLast.next=null;
		}
		public void revereIterate() {
			if(head==null||head.next==null) {
				return;
			}
			Node prevNode=head;
			Node currNode=head.next;
			while(currNode!=null) {
				Node nextNode=currNode.next;
				currNode.next=prevNode;
				prevNode=currNode;
				currNode=nextNode;
			}
			head.next=null;
			head=prevNode;
		}


	public static void main(String[] args) {
		LL list=new LL();
		list.addLast("a");
		list.addLast("list");
		list.addFirst("is");
		list.addFirst("this");
		list.print();
		list.revereIterate();
		list.print();
		list.deleteLast();
		list.print();
		
		

	}

}
