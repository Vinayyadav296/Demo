package methods;
import java.util.Scanner;
public class AdditionMethod {
public static void main(String[] args) {
		int a,b;
		System.out.println("Enter two numbers");
        Scanner s =new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();	
        int sum=add(a,b);
        System.out.println("Sum of two numbers is"+" "+ sum);
        
	}
static int add(int a,int b)
{
int c=a+b;
return c;

}
}
