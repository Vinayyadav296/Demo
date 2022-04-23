package Assignnments;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSizeArray {
	static int[] removeElement(int arr[],int key) {
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=key)
				arr[index++]=arr[i];
		}
		return Arrays.copyOf(arr, index);
	}
	static int equalSize(int crr[],int n) {
		int max=0,count=0;
		for(int l=1;l<crr.length;l++) {
			if(max<crr[l]) {
				crr[l]=crr[l]-2;
				}
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int N,key;
		System.out.println("Enter size of the array:");
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		System.out.println("Enter elements of array:");
		int Arr[]=new int[N];
		for(int i=0;i<N;i++) {
			Arr[i]=sc.nextInt();
		}
		System.out.println("Enter key to be removed:");
		key=sc.nextInt();
		int[] Brr=removeElement(Arr,key);
		System.out.println(Arrays.toString(Brr));
		System.out.println(equalSize(Arr,key));


	}

}
