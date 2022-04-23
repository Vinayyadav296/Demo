package Assignnments;

import java.util.Arrays;

public class AarrayCopy {

	public static void main(String[] args) {
		AarrayCopy ob=new AarrayCopy();
		int arr[]=new int[] {15,18,89,87,56,87};
		int pos=4;
		int val=99;
		int result[]=ob.inserElementAtIndex(arr,4,99);
		System.out.println(Arrays.toString(result));
	}
	private int[] inserElementAtIndex(int arr[],int pos,int val) {
		if(pos<0||pos>arr.length) {
			System.out.println("invalid input");
			return arr;
		}
		int idx=0;
		int result[]=new int[arr.length+1];
		while(idx<pos) {
			result[idx]=arr[idx];
			idx++;
		}
		 result[pos]=val;
		 pos++;
		 while(pos<arr.length+1) {
			 result[pos]=arr[idx];
			 pos++;
			 idx++;
		 }
		 return result;
	}
	

}
