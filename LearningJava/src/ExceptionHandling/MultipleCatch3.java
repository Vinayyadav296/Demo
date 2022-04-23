package ExceptionHandling;

public class MultipleCatch3 {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception occurs");
		}
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("Array exception occurs");
        }
		catch(Exception e) {
         System.out.println("parent class exception");
	}
   System.out.println("rest code is executed");
}
}
