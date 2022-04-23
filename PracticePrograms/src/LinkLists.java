

public class LinkLists {
	static class Node{
		int data;
		Node next;
	}
		static Node push(Node head,int data) {
			Node node1=new Node();
			node1.data=data;
			node1.next=head;
			if(head!=null) {
				Node temp=head;
				while(temp.next!=head) {
					temp=temp.next;
					temp.next=node1;
				}
			}
				else {
					node1.next=node1;
					head=node1;
					
				}
			return head;
		}
		public static void printlist(Node head) {
			Node currnode=head;
			System.out.println(head.next.data);
			while(currnode!=head) {
				System.out.println(currnode.data+"->");
				currnode=currnode.next;
			}
			System.out.println();
			
		}
	static Node deleteNode(Node head,int key) {
		if(head==null) {
			return null;
		}
		Node currentnode=head;
		Node prevNode=new Node();
		while(currentnode.data!=key) {
			if(currentnode.next==head) {
				System.out.println("not found");
				break;
			}
			prevNode=currentnode;
			currentnode=currentnode.next;
		}
		if(currentnode==head) {
			prevNode=head;
			while(prevNode.next!=head) {
				prevNode=prevNode.next;
				head=currentnode.next;
				prevNode.next=head;
			}
				
				
		}
		else if(currentnode.next==head) {
			prevNode.next=head;
		}
		else {
			prevNode.next=currentnode.next;
		}
		return head;
	}
	

	public static void main(String[] args) {
		Node head=null;
		head=push(head,2);
		head=push(head,5);
		head=push(head,7);
		head=push(head,9);
		head=push(head,11);
		System.out.println("list before deletion");
		printlist(head);
		/*
		 * head=deleteNode(head,7); System.out.println("list after deletion");
		 * printlist(head);
		 */
	}

}
