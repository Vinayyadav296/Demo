package keywordThis;

public class CallCurrentClassMethod {
	void m()
	{
		System.out.println("hello sir");
	}
    void n()
    {
    	System.out.println("Hello mam");
    	this.m();
    }
    
	public static void main(String[] args) {
		CallCurrentClassMethod c1=new CallCurrentClassMethod();
		c1.n();

	}

}
