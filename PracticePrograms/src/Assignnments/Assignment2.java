package Assignnments;

import java.util.Scanner;

public class Assignment2 {
	static int minDiff(int brr[],int n) {
		int diff=Integer.MAX_VALUE;
		for (int k=0;k<n;k++) {
		 {int l=(k+1)%n;
				if (Math.abs((brr[k] - brr[l]) )< diff)
                    diff = Math.abs((brr[k] - brr[l]));

			}
			
		}
		return diff;
	}

	public static void main(String[] args) {
		int T,N;
		System.out.println("Enter test cases.");
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(int j=0;j<T;j++) {
		System.out.println("Enter the number of elements in array:");
		N=sc.nextInt();
		System.out.println("Enter array elements:");
		int []Arr=new int[N];
		for(int i=0;i<Arr.length;i++) {
			Arr[i]=sc.nextInt();
			//System.out.print(Arr[i]);
		}
		 System.out.println("Minimum difference is "+
	                minDiff(Arr, N));

	}
       

		}

}
