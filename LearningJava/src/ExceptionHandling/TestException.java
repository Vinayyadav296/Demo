package ExceptionHandling;

public class TestException {
public static void main(String[] args) {
	try {
		int c=100/0;
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("rest code is executed");
}
}
