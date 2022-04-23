package Assignnments;

import java.util.Scanner;

public class Xor {
	static int xorOper(int arr[], int n) {
		int xor = 0;
		int sum = 0;
		
					for (int j = 0; j < n; j++) {
			xor = arr[j] ^ (n-(j+1));
	         sum+=xor;
			}

		
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length:");
		int N = sc.nextInt();
		System.out.println("enter array element:");
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(xorOper(A, N));

	}

}
