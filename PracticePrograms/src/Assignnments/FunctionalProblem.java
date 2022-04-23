package Assignnments;

import java.util.Scanner;

public class FunctionalProblem {
	static void NewtonSchool(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0) {
			System.out.println("Newton");
		}
			else if(i%5==0) {
				System.out.println("School");
			}
			else if(i%3==0&&n%5==0) {
				System.out.println("Newton school");
			}
			else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		FunctionalProblem f=new FunctionalProblem();
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		 f.NewtonSchool(N);
	}

}
