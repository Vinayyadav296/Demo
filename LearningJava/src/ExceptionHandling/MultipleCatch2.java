package ExceptionHandling;

public class MultipleCatch2 {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[10]=50/0;
		}
       catch(ArithmeticException e)
		{
    	   System.out.println("Arithmetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index of of bounds");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest code is executed");


	}

}
