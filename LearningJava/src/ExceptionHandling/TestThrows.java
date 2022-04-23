package ExceptionHandling;

import java.io.IOException;

public class TestThrows {
	void m() throws IOException{
		throw new IOException("Device Error");
	}
	void n() throws IOException{
		m();
	}
	void p() {
		try {
			n();
			}
		catch(Exception e) {
			System.out.println("exception handled");
		}
		System.out.println("rest code is executed");
	}

}
