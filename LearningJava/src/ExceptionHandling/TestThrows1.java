package ExceptionHandling;

import java.io.IOException;

class A{
void m() throws IOException{
		throw new IOException("Device error");
	}
}
public class TestThrows1 {
public static void main(String[] args) {
		try {
			A a=new A();
			a.m();
		}
		catch(IOException e) {
			System.out.println("exception Handled ");
		}
		System.out.println("rest code is Executed");

	}

}
