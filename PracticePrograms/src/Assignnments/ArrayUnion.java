package Assignnments;

import java.util.HashSet;

public class ArrayUnion {
	public int arrayUnion(int arr1[],int arr2[]) {
		HashSet<Integer> hs=new HashSet<>();
		for(int set:arr1) {
			hs.add(set);
		}
		for(int set:arr2) {
			hs.add(set);
		}
		return hs.size();
	}
	public static void main(String[] args) {
		ArrayUnion obj=new ArrayUnion();
		int arr1[]=new int[]{5,10,15,5};
		int arr2[]=new int[] {10,15,4,6};
       System.out.println(obj.arrayUnion(arr1, arr2));
	}

}
