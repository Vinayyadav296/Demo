package Assignnments;

import java.util.Scanner;

public class ArraySum {
	static int maxSum(int a[],int n) {
		if(n==0) {
			return 0;
		}
		int sum=0;
		for(int k=0;k<a.length;k++) {
			if(a[k]>0) {
				sum+=a[k];
			}
		}
		return sum;
	}
	

	public static void main(String[] args) {
		int T,N;
		System.out.println("Enter test case:");
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for (int j=0;j<T;j++) {
		System.out.println("Enter the number of elements in array:");
		N=sc.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			
	}
		System.out.println(maxSum(A,N));
		}
		

	}

}
