package Assignnments;

import java.util.Scanner;

public class assgn {
	public static void main(String[] args) {
		int i,even=0,odd=1;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		for (int j1=0;j1<i;j1++) {
			
			int j=sc.nextInt();
		if(j%2==0){
			odd=odd*j;
		}
		else{
			even=even+j;
		}}
		
		System.out.println(even+" "+odd);


	}
}

