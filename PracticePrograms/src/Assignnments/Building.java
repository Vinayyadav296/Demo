package Assignnments;

import java.util.Scanner;

public class Building {
	static int building(int a[],int n) {
		if(n==0) {
			return 0;
		}
		int max=a[0];
		int count=1;
		for(int j=1;j<n;j++) {
			if(max<a[j]) {
				max=a[j];
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		int N;
		System.out.println("Enter number of buildings:");
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		System.out.println("Enter BUlding heights:");
	    int H[]=new int[N];
	    for(int i=0;i<H.length;i++) {
	    	H[i]=sc.nextInt();
	      }
		System.out.println(building(H,N));
		
	
		}

}
