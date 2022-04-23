package ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		int a[]=new int[5];
		try {
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array exception occurs");
			}
		catch(Exception e) {
			System.out.println("parent exception occurs");
		}
		System.out.println("rest code is executed");
	}

}
