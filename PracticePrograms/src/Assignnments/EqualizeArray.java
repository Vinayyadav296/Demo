package Assignnments;
import java.util.Scanner;

public class EqualizeArray {

	public static void main(String[] args) {
		System.out.println("enter the length of array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the array elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int evencount=0;
		int oddcount=0;
		 for(int i=0;i<n;i++) {
			
		   if(i%2==0) {
			 evencount++;
		   }
		   else {
			   oddcount++;
		   }
	 }
		 System.out.println(Math.max(evencount, oddcount));
			
			}
		
		}
		

		
		
		
	
	

