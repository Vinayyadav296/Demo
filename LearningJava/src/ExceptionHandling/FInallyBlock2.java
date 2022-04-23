package ExceptionHandling;

public class FInallyBlock2 {

	public static void main(String[] args) {
		try {
			int a=25/0;
			System.out.println(a);
			
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
