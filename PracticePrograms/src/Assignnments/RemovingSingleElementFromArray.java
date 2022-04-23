package Assignnments;

import java.util.Scanner;
import java.util.Arrays;
public class RemovingSingleElementFromArray {
	static int [] removeElement(int[]arr,int index) {
		if(arr==null ||index<0||index>=arr.length) {
			return arr;
		}
		int []anotherArray=new int[arr.length-1];
		for(int j=0,k=0;j<arr.length;j++) {
			if(j==index) {
				continue;
			}
			anotherArray[k++]=arr[j];
		}
		return anotherArray;
	}
	
	public static void main(String[] args) {
		
		int N,index;
		System.out.println("Enter size of the array:");
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		System.out.println("Enter elements of array:");
		int Arr[]=new int[N];
		for(int i=0;i<N;i++) {
			Arr[i]=sc.nextInt();
		}
		System.out.println("Enter index to be removed:");
		index=sc.nextInt();
		int[] Brr=removeElement(Arr,index);
		System.out.println(Arrays.toString(Brr));

	}

}
