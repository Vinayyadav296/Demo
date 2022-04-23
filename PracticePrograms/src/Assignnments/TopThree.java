package Assignnments;

import java.util.Scanner;

public class TopThree {
	static void topThree(int a[],int n) {
		int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
		for(int k=0;k<n;k++) {
			int current=a[k];
			if(first<current) {
				third=second;
				second=first;
				first=current;
			}
			else if(second<current) {
				third=second;
				second=current;
			}
			else if(third<a[k]) {
				third=current;
			}
				
			}
		
		System.out.println("top three elements are: " + first + " " + second + " " + third);
	}

	public static void main(String[] args) {
		int T,N;
		System.out.println("Enter the number of test cases:");
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(int j=0;j<T;j++) {
		System.out.println("Enter number of elements in the array:");
	    N=sc.nextInt();
		int A[]=new int[N];
		for(int i=0;i<A.length;i++) {
			A[i]=sc.nextInt();
		}
		TopThree t=new TopThree();
		t.topThree(A,N);
		}
	    

	}

}
