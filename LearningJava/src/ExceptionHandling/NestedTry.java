package ExceptionHandling;

public class NestedTry {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("going to  divide by zero");
				int s=10/0;
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int a[]=new int[5];
				a[10]=4;
			}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e);
			}
			System.out.println("other statement");
		}
			catch(Exception e) {
				System.out.println("outer catch is handled");
			}
			System.out.println("rest code is executed");
		
		}
	

	}


