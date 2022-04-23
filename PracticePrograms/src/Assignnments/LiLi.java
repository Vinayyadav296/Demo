package Assignnments;

public class LiLi {
    Player head;
    class Player{
    	String name;
    	Player next;
    	Player(String name){
    		this.name=name;
    		this.next=null;
    	}
    	}
    public void addFirst(String name) {
    	Player newPlayer =new Player(name);
    	if(head==null) {
    		head=newPlayer;
    		return;
    	}
    	newPlayer.next=head;
    	head=newPlayer;
    	  }
    public void printList() {
    	Player currPlayer=head;
    	while(currPlayer!=null) {
    		System.out.print(currPlayer.name+">");
    		currPlayer=currPlayer.next;
    	}
    	System.out.println("null");
    }
    public void addLast(String name) {
    	Player newPlayer=new Player(name);
    	if(head==null) {
    		head=newPlayer;
    		return;
    	}
    	Player lastPlayer=head;
    	while(lastPlayer.next!=null) {
    		lastPlayer=lastPlayer.next;
    	}
    	lastPlayer.next=newPlayer;
    }
    public void deleteFirst() {                         
    	if(head==null) {
    		System.out.println("list is empty nothing to delete");
    		return;
    		}
    	head=head.next;
    }
    public void deleteLast() {
    	if(head==null) {
    		System.out.println("list is empty nothing to delete");
    		return;
    	}
    	if(head.next==null) {
    		head=null;
    		return;
    	}
    	Player secondLast=head;
    	Player lastPlayer=head.next;
    	while(lastPlayer.next!=null) {
    		lastPlayer=lastPlayer.next;
    		secondLast=secondLast.next;
    	}
    	secondLast.next=null;
    }
	public static void main(String[] args) {
       LiLi list=new LiLi();
       list.addLast("Sachin");
       list.addLast("Tendulkar");
       list.printList();
       list.addFirst("is");
       list.addFirst("He");
       list.addFirst("Yes");
       list.printList();
       list.deleteFirst();
       list.printList();
       list.deleteLast();
       list.printList();
	}

}
