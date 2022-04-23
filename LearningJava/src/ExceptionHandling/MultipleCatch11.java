package ExceptionHandling;

public class MultipleCatch11 {

	public static void main(String[] args) {
		int a[]=new int[5];
		try {
			System.out.println(a[10]);
		}
       catch(ArithmeticException e)
		{
    	   System.out.println(e);
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
