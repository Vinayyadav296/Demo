package Assignnments;
import java.util.Collections;
import java.util.LinkedList;
public class LLframework {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
	list.addFirst("am");
	list.addFirst("i");
	list.addFirst("Hi");
	list.addLast("Vinay");
	System.out.println(list);
	System.out.println(list.size());
	System.out.println(list.get(3));
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	list.add("Engineer");
	System.out.println(list);
    list.add(4, "a software engineer");
    System.out.println(list);
    list.remove(4);
    for(int i=0;i<list.size();i++) {
    	System.out.print(list.get(i)+"->");
    }
    Collections.reverse(list);
    System.out.println(list);
}
}
