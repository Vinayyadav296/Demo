package ExceptionHandling;

public class TestExcepetion3 {

	public static void main(String[] args) {
				try {
					int a[]= {10,20,30};
					System.out.println(a[10]);

		}
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println(e);
        }
				System.out.println("rest code is printed");
	}

}
