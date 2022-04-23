package Assignnments;

import java.util.Scanner;

public class Assignment1 {
  static void reverseArray(int a[],int n){
	  int []b=new int[n];
	  int j=n;
	  for(int i=0;i<n;i++) {
		  b[j-1]=a[i];
		  j=j-1;
	  }
	  System.out.print(" reverse array sum  is:");
		  System.out.print(b[1]+b[3]+b[5]+" "+b[0]*b[2]*b[4]);
		  
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the length of array..");
		int l;
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		System.out.print("Enter the Elements of array..");
		int arr[]=new int[l];
		for(int a=0;a<l;a++) {
			arr[a]=sc.nextInt();
		}
		
		reverseArray(arr,arr.length);

	}

}
