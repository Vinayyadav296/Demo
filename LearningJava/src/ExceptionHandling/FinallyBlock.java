package ExceptionHandling;

public class FinallyBlock {
public static void main(String[] args) {
	try {
		System.out.println("inside try block");
		int a=25/5;
	}
	catch(ArithmeticException e ) {
		System.out.println(e);
	}
	finally {
		System.out.println("finally block is executed ");
	}
	System.out.println("rest code is executed");
}
}
