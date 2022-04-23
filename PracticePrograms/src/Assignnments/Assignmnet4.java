package Assignnments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignmnet4 {
	public int max(int [] array) {
	      int max = 0;
	     
	      for(int k=0; k<array.length; k++ ) {
	         if(array[k]>max) {
	            max = array[k];
	         }
	      }
	      return max;
	   }
	   public int min(int [] array) {
	      int min = array[0];
	     
	      for(int k=0; k<array.length; k++ ) {
	         if(array[k]<min) {
	            min = array[k];
	         }
	      }
	      return min;
	   }
	 
	public static void main(String[] args) {
		System.out.println("Enter test case");
		int T,N;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
	
		for(int j=0;j<T;j++) {
			System.out.println("Enter number ofElements");
			N=sc.nextInt();
			System.out.println("enter array elements");
			int A[]=new int[N];
		for(int i=0;i<A.length;i++) {
			A[i]=sc.nextInt();
	
		}
		Assignmnet4 g= new Assignmnet4();
		System.out.println("Maximum value in the array is::"+g.max(A));
	      System.out.println("Minimum value in the array is::"+g.min(A));
		}

		

	}

}
