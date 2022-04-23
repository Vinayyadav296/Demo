package Assignnments;

import java.util.Scanner;

public class MaxArray {
public static void main(String[]args) {
	int N;
	System.out.println("Enter the size of array:");
	Scanner sc=new Scanner(System.in);
	N=sc.nextInt();
	System.out.println("Enter the elements of array:");
	int []arr=new int[N];
	for(int i=0;i<N;i++) {
		arr[i]=sc.nextInt();
	}
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int j=0;j<arr.length;j++) {
			if(min>arr[j]) {
				min=arr[j];
			}
			else if(max<arr[j]) {
				max=arr[j];
			}
		}
	System.out.println("minimum element is:"+min);
	System.out.println("maximum element is:"+max);

	}

}
