package ExceptionHandling;

public class ExceptionPropogation {
	void m()
	{
		int a=50/0;
		}
	void n() {
		m();
		}
    void p() {
    	try {
    		n();
    		}
    	catch(ArithmeticException e) {
    		System.out.println("Exception handled");
    	}
    }

	public static void main(String[] args) {
		ExceptionPropogation p1=new ExceptionPropogation();
		p1.p();
		System.out.println("rest code is executed");
			}

}
