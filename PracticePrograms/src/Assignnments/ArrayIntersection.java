package Assignnments;

import java.util.HashSet;

public class ArrayIntersection {
public int IntersectionArray(int arr1[],int arr2[]) {
	HashSet<Integer> hs= new HashSet<>();
	int count=0;
	for(int set:arr1) {
		hs.add(set);
	}
	for(int set:arr2) {
		if(hs.contains(set)) {
			count++;
		}
		hs.remove(set);
	}
	return count;
}
	public static void main(String[] args) {
		ArrayIntersection obj=new ArrayIntersection();
		int arr1[]=new int[] {5,10,15,5};
        int arr2[]=new int[] {10,15,4,5,10};
    System.out.println(obj.IntersectionArray(arr1, arr2));
       
	}

}
