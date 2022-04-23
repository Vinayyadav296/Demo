package Assignnments;

import java.util.Arrays;
import java.util.Scanner;

public class PairSum {
static int minimumSum(int a[],int n) {
	int x=Integer.MIN_VALUE;
	Arrays.sort(a);
	for(int j=0;j<n/2;j++) {
		int sum=a[j]+a[n-1-j];
		if(sum>x) {
			x=sum;
		}
	}
	return x;
	
}
	public static void main(String[] args) {
		
		System.out.println("Enter array length:");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		System.out.println("Enter array elements:");
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(minimumSum(arr,N));

	}

}
