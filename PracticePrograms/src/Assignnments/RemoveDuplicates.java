package Assignnments;

import java.util.LinkedHashSet;

public class RemoveDuplicates {                        //remove duplicates from "bbba" while maintaing the order o/p -> ba
	
	public void removeDuplicates(char str[], int n) {
		LinkedHashSet<Character> set = new LinkedHashSet<>(n - 1);
		for (char x : str)
			set.add(x);
		for (char x : set)
			System.out.print(x);
	}
	

	public static void main(String[] args) {
		RemoveDuplicates obj = new RemoveDuplicates();
		char str[] = "bbba".toCharArray();     //"bbba"   //chhhcckklk
		int n = str.length;
		obj.removeDuplicates(str, n);

	}

}
