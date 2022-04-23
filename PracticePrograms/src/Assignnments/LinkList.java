package Assignnments;

import Assignnments.LL.Node;

public class LinkList {
	static Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
 Node reverseIterate(Node node,int n) {
     Node curr=node;
     Node next=null,prev=null;
     int count=0;
     while(curr!=null&&count <n) {
    	  next=curr.next;
    	 curr.next=prev;
    	 prev=curr;
    	 curr=next;
    	 count++;
     }
     if(node!=null) {
    	 node.next=curr;
     }
     while(count<n-1 && curr!=null) {
    	 curr=curr.next;
    	 count++;
     }
     if(curr!=null) {
    	 curr.next=reverseIterate(curr.next,n);
     }
     return prev;
 }
 void print(Node node) {
	 while(node!=null) {
		 System.out.println(node.data+" ->");
		 node=node.next;
	 }
 }
 void push(int data) {
	 Node newNode=new Node(data);
	 newNode.next=head;
	 head=newNode;
 }
	 
public static void main(String[] args) {
		LinkList list=new LinkList();
		for(int i=8;i>0;i--) {
			list.push(i);
		}
		System.out.println("given ll->");
		list.print(head);
		head=list.reverseIterate(head, 3);
		System.out.println(" ");
		System.out.println("modidfied list");
		list.print(head);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
