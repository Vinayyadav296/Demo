package Assignnments;
import java.util.*;

public class StackClass {
	//public static  Node{
		/*int data;
		 Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
		static class Stack{
			public static Node head;
			public static boolean isEmpty() {
				return head=null;
			}
			public void push() {
				Node newNode=Node(data);
			}
		}
	}*/

	public static void main(String[] args) {
		String str = new String ("Vinayk");    //Vknayi
		String nstr=" ";
        char ch;
        for(int i=0;i<str.length();i++) {
        	if(i%2==0) {
        		ch=str.charAt(i);
        	}
        	if(i%2!=0) {
        	ch=str.charAt(i);
        	nstr=ch+nstr;
        }
        }
          System.out.println("reverse string :"+nstr);
	}

}
