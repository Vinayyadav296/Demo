package keywordThis;

public class ThisAsAnArgumentInMethod {
	void m(ThisAsAnArgumentInMethod obj)
	{
	System.out.println("hello how are you");
	}
    void n()
    {
    	m(this);
    }
	public static void main(String[] args) {
		ThisAsAnArgumentInMethod a=new ThisAsAnArgumentInMethod();
		a.n();

	}

}
