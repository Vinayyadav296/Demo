package methods;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		findEvenOdd(num);
	}
static void findEvenOdd(int num)
{
if(num%2==0)
{
	System.out.println(num+" " +"is Even");
}
else {
	System.out.println(num+" "+"is odd");
}
}
}
