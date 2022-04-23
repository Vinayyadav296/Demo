package Assignnments;

import java.util.Scanner;

public class PairProduct {

	public static void main(String[] args) {
		System.out.println("enter length:");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println("enter array Elements:");
		int brr[] = new int[N];
		for (int i = 0; i < N - 1; i++) {
			brr[i] = sc.nextInt();
		}
		int sum1 = 0;
		for (int i = 0; i < N; i++) {
			sum1 += brr[i];

		}
		System.out.println(sum1);
		int sum2 = (N * (N + 1) / 2);
		System.out.println(sum2);

		if (sum1 < sum2) {
			int missingElement = sum2 - sum1;
			System.out.println(missingElement);

		}

	}
}
